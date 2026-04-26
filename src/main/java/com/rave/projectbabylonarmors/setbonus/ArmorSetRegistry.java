package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.setbonus.impl.IronMageArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.impl.IronWarriorArmorSetBonus;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import java.util.List;

public final class ArmorSetRegistry {

    private static final ArmorSetDefinition IRON_WARRIOR_SET = ArmorSetDefinition.builder("iron_warrior")
            .displayNameKey("tooltip.project_babylon_armors.set.iron_warrior")
            .helmet(PBArmorItems.IRON_WARRIOR_HELMET)
            .chestplate(PBArmorItems.IRON_WARRIOR_CHESTPLATE)
            .leggings(PBArmorItems.IRON_WARRIOR_LEGGINGS)
            .boots(PBArmorItems.IRON_WARRIOR_BOOTS)
            .classBonus(new IronWarriorArmorSetBonus())
            .build();

    private static final ArmorSetDefinition IRON_MAGE_SET = ArmorSetDefinition.builder("iron_mage")
            .displayNameKey("tooltip.project_babylon_armors.set.iron_mage")
            .helmet(PBArmorItems.IRON_MAGE_HELMET)
            .chestplate(PBArmorItems.IRON_MAGE_CHESTPLATE)
            .leggings(PBArmorItems.IRON_MAGE_LEGGINGS)
            .boots(PBArmorItems.IRON_MAGE_BOOTS)
            .classBonus(new IronMageArmorSetBonus())
            .build();

    private static final List<ArmorSetDefinition> SETS = List.of(
            IRON_WARRIOR_SET,
            IRON_MAGE_SET
    );

    private ArmorSetRegistry() {
    }

    public static List<ArmorSetDefinition> getAll() {
        return SETS;
    }

    public static ArmorSetDefinition findContaining(Item item) {
        for (ArmorSetDefinition set : SETS) {
            if (set.contains(item)) {
                return set;
            }
        }
        return null;
    }

    public static ArmorSetDefinition findMatching(Player player) {
        for (ArmorSetDefinition set : SETS) {
            if (set.matches(player)) {
                return set;
            }
        }
        return null;
    }

    public static ArmorSetDefinition findById(String setId) {
        for (ArmorSetDefinition set : SETS) {
            if (set.getId().equals(setId)) {
                return set;
            }
        }
        return null;
    }
}
