package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonarmors.setbonus.impl.IronMageArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.impl.IronRogueArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.impl.IronTankArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.impl.IronWarriorArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition;

import java.util.List;

public final class ArmorSetRegistry {

    private static boolean bootstrapped;

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

    private static final ArmorSetDefinition IRON_TANK_SET = ArmorSetDefinition.builder("iron_tank")
            .displayNameKey("tooltip.project_babylon_armors.set.iron_tank")
            .helmet(PBArmorItems.IRON_TANK_HELMET)
            .chestplate(PBArmorItems.IRON_TANK_CHESTPLATE)
            .leggings(PBArmorItems.IRON_TANK_LEGGINGS)
            .boots(PBArmorItems.IRON_TANK_BOOTS)
            .classBonus(new IronTankArmorSetBonus())
            .build();

    private static final ArmorSetDefinition IRON_ROGUE_SET = ArmorSetDefinition.builder("iron_rogue")
            .displayNameKey("tooltip.project_babylon_armors.set.iron_rogue")
            .helmet(PBArmorItems.IRON_ROGUE_HELMET)
            .chestplate(PBArmorItems.IRON_ROGUE_CHESTPLATE)
            .leggings(PBArmorItems.IRON_ROGUE_LEGGINGS)
            .boots(PBArmorItems.IRON_ROGUE_BOOTS)
            .classBonus(new IronRogueArmorSetBonus())
            .build();

    private static final List<ArmorSetDefinition> SETS = List.of(
            IRON_WARRIOR_SET,
            IRON_MAGE_SET,
            IRON_TANK_SET,
            IRON_ROGUE_SET
    );

    private ArmorSetRegistry() {
    }

    public static void bootstrap() {
        if (bootstrapped) {
            return;
        }

        com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.registerAll(SETS);
        bootstrapped = true;
    }
}
