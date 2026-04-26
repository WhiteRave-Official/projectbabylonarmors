package com.rave.projectbabylonarmors.setbonus;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ArmorSetDefinition {

    private final String id;
    private final String displayName;
    private final Supplier<Item> helmet;
    private final Supplier<Item> chestplate;
    private final Supplier<Item> leggings;
    private final Supplier<Item> boots;
    private final List<ArmorSetBonus> materialBonuses;
    private final List<ArmorSetBonus> classBonuses;
    private final List<ArmorSetBonus> allBonuses;

    public ArmorSetDefinition(String id, String displayName, Supplier<Item> helmet, Supplier<Item> chestplate, Supplier<Item> leggings,
                              Supplier<Item> boots, List<ArmorSetBonus> materialBonuses, List<ArmorSetBonus> classBonuses) {
        this.id = id;
        this.displayName = displayName;
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
        this.materialBonuses = List.copyOf(materialBonuses);
        this.classBonuses = List.copyOf(classBonuses);
        List<ArmorSetBonus> combinedBonuses = new ArrayList<>(materialBonuses.size() + classBonuses.size());
        combinedBonuses.addAll(materialBonuses);
        combinedBonuses.addAll(classBonuses);
        this.allBonuses = Collections.unmodifiableList(combinedBonuses);
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<ArmorSetBonus> getMaterialBonuses() {
        return materialBonuses;
    }

    public List<ArmorSetBonus> getClassBonuses() {
        return classBonuses;
    }

    public List<ArmorSetBonus> getAllBonuses() {
        return allBonuses;
    }

    public boolean matches(Player player) {
        return matchesSlot(player.getItemBySlot(EquipmentSlot.HEAD), helmet)
                && matchesSlot(player.getItemBySlot(EquipmentSlot.CHEST), chestplate)
                && matchesSlot(player.getItemBySlot(EquipmentSlot.LEGS), leggings)
                && matchesSlot(player.getItemBySlot(EquipmentSlot.FEET), boots);
    }

    public int countMatchedPieces(Player player) {
        int matchedPieces = 0;
        if (matchesSlot(player.getItemBySlot(EquipmentSlot.HEAD), helmet)) {
            matchedPieces++;
        }
        if (matchesSlot(player.getItemBySlot(EquipmentSlot.CHEST), chestplate)) {
            matchedPieces++;
        }
        if (matchesSlot(player.getItemBySlot(EquipmentSlot.LEGS), leggings)) {
            matchedPieces++;
        }
        if (matchesSlot(player.getItemBySlot(EquipmentSlot.FEET), boots)) {
            matchedPieces++;
        }
        return matchedPieces;
    }

    public boolean hasPiece(Player player, EquipmentSlot slot) {
        return switch (slot) {
            case HEAD -> matchesSlot(player.getItemBySlot(slot), helmet);
            case CHEST -> matchesSlot(player.getItemBySlot(slot), chestplate);
            case LEGS -> matchesSlot(player.getItemBySlot(slot), leggings);
            case FEET -> matchesSlot(player.getItemBySlot(slot), boots);
            default -> false;
        };
    }

    public boolean contains(Item item) {
        return helmet.get() == item
                || chestplate.get() == item
                || leggings.get() == item
                || boots.get() == item;
    }

    public ItemStack getPieceStack(EquipmentSlot slot) {
        return switch (slot) {
            case HEAD -> new ItemStack(helmet.get());
            case CHEST -> new ItemStack(chestplate.get());
            case LEGS -> new ItemStack(leggings.get());
            case FEET -> new ItemStack(boots.get());
            default -> ItemStack.EMPTY;
        };
    }

    private static boolean matchesSlot(ItemStack stack, Supplier<Item> expected) {
        return !stack.isEmpty() && stack.getItem() == expected.get();
    }
}
