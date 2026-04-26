package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.setbonus.impl.IronWarriorArmorSetBonus;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class ArmorSetBonusManager {

    private static final ArmorSetDefinition IRON_WARRIOR_SET = new ArmorSetDefinition(
            "iron_warrior",
            "Iron Warrior",
            PBArmorItems.IRON_WARRIOR_HELMET,
            PBArmorItems.IRON_WARRIOR_CHESTPLATE,
            PBArmorItems.IRON_WARRIOR_LEGGINGS,
            PBArmorItems.IRON_WARRIOR_BOOTS,
            List.of(),
            List.of(new IronWarriorArmorSetBonus())
    );

    private static final List<ArmorSetDefinition> SETS = List.of(IRON_WARRIOR_SET);
    private static final Map<UUID, String> ACTIVE_SETS = new HashMap<>();

    private ArmorSetBonusManager() {
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END || event.side != LogicalSide.SERVER || event.player.level().isClientSide) {
            return;
        }

        Player player = event.player;
        ArmorSetDefinition currentSet = findMatchingSet(player);
        String previousSetId = ACTIVE_SETS.get(player.getUUID());

        if (currentSet == null) {
            if (previousSetId != null) {
                removeSetBonus(player, previousSetId);
                ACTIVE_SETS.remove(player.getUUID());
            }
            return;
        }

        if (!currentSet.getId().equals(previousSetId)) {
            if (previousSetId != null) {
                removeSetBonus(player, previousSetId);
            }

            applySetBonuses(player, currentSet);
            ACTIVE_SETS.put(player.getUUID(), currentSet.getId());
            return;
        }

        if (!areBonusesApplied(player, currentSet)) {
            applySetBonuses(player, currentSet);
        }
    }

    public static void appendCollapsedTooltip(ItemStack stack, List<Component> tooltip) {
        if (findSet(stack) != null) {
            tooltip.add(Component.literal("Hold Shift to see armor set bonuses").withStyle(ChatFormatting.GRAY));
        }
    }

    public static void appendTooltip(ItemStack stack, List<Component> tooltip, boolean expanded, Player player) {
        ArmorSetDefinition set = findSet(stack);
        if (set == null) {
            return;
        }

        if (!expanded) {
            appendCollapsedTooltip(stack, tooltip);
            return;
        }

        tooltip.add(Component.literal("Set: " + set.getDisplayName()).withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.literal("Pieces: " + getMatchedPieces(set, player) + "/4").withStyle(ChatFormatting.YELLOW));
        tooltip.add(Component.empty());
        tooltip.add(Component.literal("Armor Pieces").withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.empty());
        appendPieceLine(tooltip, "Helmet", hasPiece(set, player, EquipmentSlot.HEAD));
        appendPieceLine(tooltip, "Chestplate", hasPiece(set, player, EquipmentSlot.CHEST));
        appendPieceLine(tooltip, "Leggings", hasPiece(set, player, EquipmentSlot.LEGS));
        appendPieceLine(tooltip, "Boots", hasPiece(set, player, EquipmentSlot.FEET));

        appendBonusSection(tooltip, set.getMaterialBonuses());
        appendBonusSection(tooltip, set.getClassBonuses());
    }

    public static ArmorSetTooltipData createTooltipData(ItemStack stack, Player player) {
        ArmorSetDefinition set = findSet(stack);
        if (set == null) {
            return null;
        }

        List<ArmorSetTooltipData.ArmorPieceEntry> armorPieces = List.of(
                createArmorPieceEntry(set, player, EquipmentSlot.HEAD, "Helmet"),
                createArmorPieceEntry(set, player, EquipmentSlot.CHEST, "Chestplate"),
                createArmorPieceEntry(set, player, EquipmentSlot.LEGS, "Leggings"),
                createArmorPieceEntry(set, player, EquipmentSlot.FEET, "Boots")
        );

        List<ArmorSetTooltipData.BonusEntry> bonuses = set.getAllBonuses().stream()
                .map(bonus -> new ArmorSetTooltipData.BonusEntry(
                        bonus.getType(),
                        bonus.getDisplayName(),
                        bonus.getIconTexture(),
                        bonus.getTooltipLines()
                ))
                .toList();

        return new ArmorSetTooltipData(
                Component.literal(set.getDisplayName()).withStyle(ChatFormatting.GOLD),
                getMatchedPieces(set, player),
                armorPieces,
                bonuses
        );
    }

    public static int getExpandedTooltipLineCount(ArmorSetTooltipData data) {
        int lineCount = 9;
        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            lineCount += 1 + 1 + bonus.descriptionLines().size();
        }
        return lineCount;
    }

    private static ArmorSetDefinition findSet(ItemStack stack) {
        for (ArmorSetDefinition set : SETS) {
            if (set.contains(stack.getItem())) {
                return set;
            }
        }
        return null;
    }

    @SubscribeEvent
    public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        String setId = ACTIVE_SETS.remove(event.getEntity().getUUID());
        if (setId != null) {
            removeSetBonus(event.getEntity(), setId);
        }
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        ACTIVE_SETS.remove(event.getOriginal().getUUID());
        ACTIVE_SETS.remove(event.getEntity().getUUID());
    }

    private static ArmorSetDefinition findMatchingSet(Player player) {
        for (ArmorSetDefinition set : SETS) {
            if (set.matches(player)) {
                return set;
            }
        }
        return null;
    }

    private static void removeSetBonus(Player player, String setId) {
        ArmorSetDefinition set = findSetById(setId);
        if (set != null) {
            for (ArmorSetBonus bonus : set.getAllBonuses()) {
                bonus.remove(player);
            }
        }
    }

    private static ArmorSetDefinition findSetById(String setId) {
        for (ArmorSetDefinition set : SETS) {
            if (set.getId().equals(setId)) {
                return set;
            }
        }
        return null;
    }

    private static void applySetBonuses(Player player, ArmorSetDefinition set) {
        for (ArmorSetBonus bonus : set.getAllBonuses()) {
            bonus.apply(player);
        }
    }

    private static boolean areBonusesApplied(Player player, ArmorSetDefinition set) {
        for (ArmorSetBonus bonus : set.getAllBonuses()) {
            if (!bonus.isApplied(player)) {
                return false;
            }
        }
        return true;
    }

    private static int getMatchedPieces(ArmorSetDefinition set, Player player) {
        return player == null ? 0 : set.countMatchedPieces(player);
    }

    private static boolean hasPiece(ArmorSetDefinition set, Player player, EquipmentSlot slot) {
        return player != null && set.hasPiece(player, slot);
    }

    private static ArmorSetTooltipData.ArmorPieceEntry createArmorPieceEntry(ArmorSetDefinition set, Player player, EquipmentSlot slot,
                                                                             String pieceName) {
        return new ArmorSetTooltipData.ArmorPieceEntry(
                set.getPieceStack(slot),
                Component.literal(pieceName),
                hasPiece(set, player, slot)
        );
    }

    private static void appendPieceLine(List<Component> tooltip, String pieceName, boolean equipped) {
        ChatFormatting stateColor = equipped ? ChatFormatting.GREEN : ChatFormatting.DARK_GRAY;
        String stateText = equipped ? "Equipped" : "Missing";
        tooltip.add(Component.literal("    " + pieceName + ": ").withStyle(ChatFormatting.GRAY)
                .append(Component.literal(stateText).withStyle(stateColor)));
    }

    private static void appendBonusSection(List<Component> tooltip, List<ArmorSetBonus> bonuses) {
        for (ArmorSetBonus bonus : bonuses) {
            tooltip.add(Component.empty());
            tooltip.add(Component.literal("    " + bonus.getType().getTitle() + ": ").withStyle(ChatFormatting.GOLD)
                    .append(bonus.getDisplayName().copy().withStyle(ChatFormatting.AQUA)));
            tooltip.addAll(bonus.getTooltipLines());
        }
    }
}
