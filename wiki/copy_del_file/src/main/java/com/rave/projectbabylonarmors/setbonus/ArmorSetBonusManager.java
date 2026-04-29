package com.rave.projectbabylonarmors.setbonus;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.List;

@Deprecated(forRemoval = true)
public final class ArmorSetBonusManager {

    private ArmorSetBonusManager() {
    }

    public static void appendCollapsedTooltip(ItemStack stack, List<Component> tooltip) {
        com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusManager.appendCollapsedTooltip(stack, tooltip);
    }

    public static void appendTooltip(ItemStack stack, List<Component> tooltip, boolean expanded, Player player) {
        com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusManager.appendTooltip(stack, tooltip, expanded, player);
    }

    public static ArmorSetTooltipData createTooltipData(ItemStack stack, Player player) {
        com.rave.projectbabylonmaterials.setbonus.ArmorSetTooltipData coreData =
                com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusManager.createTooltipData(stack, player);
        if (coreData == null) {
            return null;
        }

        List<ArmorSetTooltipData.ArmorPieceEntry> armorPieces = coreData.armorPieces().stream()
                .map(piece -> new ArmorSetTooltipData.ArmorPieceEntry(piece.stack(), piece.label(), piece.equipped()))
                .toList();

        List<ArmorSetTooltipData.BonusEntry> bonuses = coreData.bonuses().stream()
                .map(bonus -> new ArmorSetTooltipData.BonusEntry(
                        bonus.type(),
                        bonus.displayName(),
                        bonus.frameTexture(),
                        bonus.iconTexture(),
                        bonus.descriptionLines()
                ))
                .toList();

        return new ArmorSetTooltipData(coreData.setName(), coreData.matchedPieces(), armorPieces, bonuses);
    }

    public static int getExpandedTooltipLineCount(ArmorSetTooltipData data) {
        int lineCount = 9;
        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            lineCount += 2 + bonus.descriptionLines().size();
        }
        return lineCount;
    }
}
