package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.init.PBArmorItems;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition;
import net.minecraft.world.item.Item;
import java.util.function.Supplier;

import java.util.List;

public final class ArmorSetRegistry {

    private static boolean bootstrapped;

    private static final List<ArmorSetDefinition> SETS = List.of(
            createSet("iron_warrior", "tooltip.project_babylon_armors.set.iron_warrior",
                    PBArmorItems.IRON_WARRIOR_HELMET, PBArmorItems.IRON_WARRIOR_CHESTPLATE, PBArmorItems.IRON_WARRIOR_LEGGINGS, PBArmorItems.IRON_WARRIOR_BOOTS,
                    ClassArmorSetBonuses.warrior("iron_warrior", "tooltip.project_babylon_armors.bonus.iron_knight.name", 10.0D, 10.0D, null)),
            createSet("iron_mage", "tooltip.project_babylon_armors.set.iron_mage",
                    PBArmorItems.IRON_MAGE_HELMET, PBArmorItems.IRON_MAGE_CHESTPLATE, PBArmorItems.IRON_MAGE_LEGGINGS, PBArmorItems.IRON_MAGE_BOOTS,
                    ClassArmorSetBonuses.mage("iron_mage", "tooltip.project_babylon_armors.bonus.iron_arcanist.name", 50.0D, 15.0D, null, null, null)),
            createSet("iron_tank", "tooltip.project_babylon_armors.set.iron_tank",
                    PBArmorItems.IRON_TANK_HELMET, PBArmorItems.IRON_TANK_CHESTPLATE, PBArmorItems.IRON_TANK_LEGGINGS, PBArmorItems.IRON_TANK_BOOTS,
                    ClassArmorSetBonuses.tank("iron_tank", "tooltip.project_babylon_armors.bonus.iron_bulwark.name", 15.0D, 15.0D, null)),
            createSet("iron_rogue", "tooltip.project_babylon_armors.set.iron_rogue",
                    PBArmorItems.IRON_ROGUE_HELMET, PBArmorItems.IRON_ROGUE_CHESTPLATE, PBArmorItems.IRON_ROGUE_LEGGINGS, PBArmorItems.IRON_ROGUE_BOOTS,
                    ClassArmorSetBonuses.rogue("iron_rogue", "tooltip.project_babylon_armors.bonus.assassin_school.name", 10.0D, 10.0D, 5.0D, null, null)),

            createSet("golden_warrior", "tooltip.project_babylon_armors.set.golden_warrior", PBArmorItems.GOLDEN_WARRIOR_HELMET, PBArmorItems.GOLDEN_WARRIOR_CHESTPLATE, PBArmorItems.GOLDEN_WARRIOR_LEGGINGS, PBArmorItems.GOLDEN_WARRIOR_BOOTS, GoldenMaterialBonuses.secretCult(), ClassArmorSetBonuses.warrior("golden_warrior", "tooltip.project_babylon_armors.bonus.gilded_vanguard.name", 20.0D, 20.0D, null)),
            createSet("golden_mage", "tooltip.project_babylon_armors.set.golden_mage", PBArmorItems.GOLDEN_MAGE_HELMET, PBArmorItems.GOLDEN_MAGE_CHESTPLATE, PBArmorItems.GOLDEN_MAGE_LEGGINGS, PBArmorItems.GOLDEN_MAGE_BOOTS, GoldenMaterialBonuses.secretCult(), ClassArmorSetBonuses.mage("golden_mage", "tooltip.project_babylon_armors.bonus.golden_sage.name", 75.0D, 18.0D, 5.0D, null, null)),
            createSet("golden_tank", "tooltip.project_babylon_armors.set.golden_tank", PBArmorItems.GOLDEN_TANK_HELMET, PBArmorItems.GOLDEN_TANK_CHESTPLATE, PBArmorItems.GOLDEN_TANK_LEGGINGS, PBArmorItems.GOLDEN_TANK_BOOTS, GoldenMaterialBonuses.secretCult(), ClassArmorSetBonuses.tank("golden_tank", "tooltip.project_babylon_armors.bonus.gilded_juggernaut.name", 20.0D, 20.0D, null)),
            createSet("golden_rogue", "tooltip.project_babylon_armors.set.golden_rogue", PBArmorItems.GOLDEN_ROGUE_HELMET, PBArmorItems.GOLDEN_ROGUE_CHESTPLATE, PBArmorItems.GOLDEN_ROGUE_LEGGINGS, PBArmorItems.GOLDEN_ROGUE_BOOTS, GoldenMaterialBonuses.secretCult(), ClassArmorSetBonuses.rogue("golden_rogue", "tooltip.project_babylon_armors.bonus.gilded_shadow.name", 10.0D, 12.0D, 8.0D, 5.0D, null)),

            createSet("diamond_warrior", "tooltip.project_babylon_armors.set.diamond_warrior",
                    PBArmorItems.DIAMOND_WARRIOR_HELMET, PBArmorItems.DIAMOND_WARRIOR_CHESTPLATE, PBArmorItems.DIAMOND_WARRIOR_LEGGINGS, PBArmorItems.DIAMOND_WARRIOR_BOOTS,
                    DiamondMaterialBonuses.unyielding(),
                    ClassArmorSetBonuses.warrior("diamond_warrior", "tooltip.project_babylon_armors.bonus.diamond_champion.name", 20.0D, 20.0D, null)),
            createSet("diamond_mage", "tooltip.project_babylon_armors.set.diamond_mage",
                    PBArmorItems.DIAMOND_MAGE_HELMET, PBArmorItems.DIAMOND_MAGE_CHESTPLATE, PBArmorItems.DIAMOND_MAGE_LEGGINGS, PBArmorItems.DIAMOND_MAGE_BOOTS,
                    DiamondMaterialBonuses.unyielding(),
                    ClassArmorSetBonuses.mage("diamond_mage", "tooltip.project_babylon_armors.bonus.crystal_arcanist.name", 75.0D, 18.0D, 5.0D, null, null)),
            createSet("diamond_tank", "tooltip.project_babylon_armors.set.diamond_tank",
                    PBArmorItems.DIAMOND_TANK_HELMET, PBArmorItems.DIAMOND_TANK_CHESTPLATE, PBArmorItems.DIAMOND_TANK_LEGGINGS, PBArmorItems.DIAMOND_TANK_BOOTS,
                    DiamondMaterialBonuses.unyielding(),
                    ClassArmorSetBonuses.tank("diamond_tank", "tooltip.project_babylon_armors.bonus.diamond_bastion.name", 20.0D, 20.0D, null)),
            createSet("diamond_rogue", "tooltip.project_babylon_armors.set.diamond_rogue",
                    PBArmorItems.DIAMOND_ROGUE_HELMET, PBArmorItems.DIAMOND_ROGUE_CHESTPLATE, PBArmorItems.DIAMOND_ROGUE_LEGGINGS, PBArmorItems.DIAMOND_ROGUE_BOOTS,
                    DiamondMaterialBonuses.unyielding(),
                    ClassArmorSetBonuses.rogue("diamond_rogue", "tooltip.project_babylon_armors.bonus.silent_fang.name", 10.0D, 12.0D, 8.0D, 5.0D, null)),

            createSet("ice_warrior", "tooltip.project_babylon_armors.set.ice_warrior",
                    PBArmorItems.ICE_WARRIOR_HELMET, PBArmorItems.ICE_WARRIOR_CHESTPLATE, PBArmorItems.ICE_WARRIOR_LEGGINGS, PBArmorItems.ICE_WARRIOR_BOOTS,
                    IceMaterialBonuses.icyVisage(),
                    ClassArmorSetBonuses.warrior("ice_warrior", "tooltip.project_babylon_armors.bonus.frost_vanguard.name", 22.0D, 25.0D, 5.0D)),
            createSet("ice_mage", "tooltip.project_babylon_armors.set.ice_mage",
                    PBArmorItems.ICE_MAGE_HELMET, PBArmorItems.ICE_MAGE_CHESTPLATE, PBArmorItems.ICE_MAGE_LEGGINGS, PBArmorItems.ICE_MAGE_BOOTS,
                    IceMaterialBonuses.icyVisage(),
                    ClassArmorSetBonuses.mage("ice_mage", "tooltip.project_babylon_armors.bonus.frostweaver.name", 75.0D, 22.0D, 10.0D, 5.0D, null)),
            createSet("ice_tank", "tooltip.project_babylon_armors.set.ice_tank",
                    PBArmorItems.ICE_TANK_HELMET, PBArmorItems.ICE_TANK_CHESTPLATE, PBArmorItems.ICE_TANK_LEGGINGS, PBArmorItems.ICE_TANK_BOOTS,
                    IceMaterialBonuses.icyVisage(),
                    ClassArmorSetBonuses.tank("ice_tank", "tooltip.project_babylon_armors.bonus.glacial_colossus.name", 25.0D, 25.0D, 5.0D)),
            createSet("ice_rogue", "tooltip.project_babylon_armors.set.ice_rogue",
                    PBArmorItems.ICE_ROGUE_HELMET, PBArmorItems.ICE_ROGUE_CHESTPLATE, PBArmorItems.ICE_ROGUE_LEGGINGS, PBArmorItems.ICE_ROGUE_BOOTS,
                    IceMaterialBonuses.icyVisage(),
                    ClassArmorSetBonuses.rogue("ice_rogue", "tooltip.project_babylon_armors.bonus.winter_stalker.name", 12.0D, 15.0D, 10.0D, 10.0D, null)),

            createSet("ethereal_warrior", "tooltip.project_babylon_armors.set.ethereal_warrior",
                    PBArmorItems.ETHEREAL_WARRIOR_HELMET, PBArmorItems.ETHEREAL_WARRIOR_CHESTPLATE, PBArmorItems.ETHEREAL_WARRIOR_LEGGINGS, PBArmorItems.ETHEREAL_WARRIOR_BOOTS,
                    EtherealMaterialBonuses.enlightened(),
                    ClassArmorSetBonuses.warrior("ethereal_warrior", "tooltip.project_babylon_armors.bonus.astral_blade.name", 25.0D, 28.0D, 10.0D)),
            createSet("ethereal_mage", "tooltip.project_babylon_armors.set.ethereal_mage",
                    PBArmorItems.ETHEREAL_MAGE_HELMET, PBArmorItems.ETHEREAL_MAGE_CHESTPLATE, PBArmorItems.ETHEREAL_MAGE_LEGGINGS, PBArmorItems.ETHEREAL_MAGE_BOOTS,
                    EtherealMaterialBonuses.enlightened(),
                    ClassArmorSetBonuses.mage("ethereal_mage", "tooltip.project_babylon_armors.bonus.astral_hierophant.name", 100.0D, 25.0D, 15.0D, 10.0D, 10.0D)),
            createSet("ethereal_tank", "tooltip.project_babylon_armors.set.ethereal_tank",
                    PBArmorItems.ETHEREAL_TANK_HELMET, PBArmorItems.ETHEREAL_TANK_CHESTPLATE, PBArmorItems.ETHEREAL_TANK_LEGGINGS, PBArmorItems.ETHEREAL_TANK_BOOTS,
                    EtherealMaterialBonuses.enlightened(),
                    ClassArmorSetBonuses.tank("ethereal_tank", "tooltip.project_babylon_armors.bonus.aegis_ascendant.name", 28.0D, 28.0D, 10.0D)),
            createSet("ethereal_rogue", "tooltip.project_babylon_armors.set.ethereal_rogue",
                    PBArmorItems.ETHEREAL_ROGUE_HELMET, PBArmorItems.ETHEREAL_ROGUE_CHESTPLATE, PBArmorItems.ETHEREAL_ROGUE_LEGGINGS, PBArmorItems.ETHEREAL_ROGUE_BOOTS,
                    EtherealMaterialBonuses.enlightened(),
                    ClassArmorSetBonuses.rogue("ethereal_rogue", "tooltip.project_babylon_armors.bonus.phantom_dancer.name", 15.0D, 18.0D, 15.0D, 15.0D, null)),

            createSet("netherite_warrior", "tooltip.project_babylon_armors.set.netherite_warrior",
                    PBArmorItems.NETHERITE_WARRIOR_HELMET, PBArmorItems.NETHERITE_WARRIOR_CHESTPLATE, PBArmorItems.NETHERITE_WARRIOR_LEGGINGS, PBArmorItems.NETHERITE_WARRIOR_BOOTS,
                    NetheriteMaterialBonuses.abyss(),
                    ClassArmorSetBonuses.warrior("netherite_warrior", "tooltip.project_babylon_armors.bonus.nether_warlord.name", 27.0D, 30.0D, 12.0D)),
            createSet("netherite_mage", "tooltip.project_babylon_armors.set.netherite_mage",
                    PBArmorItems.NETHERITE_MAGE_HELMET, PBArmorItems.NETHERITE_MAGE_CHESTPLATE, PBArmorItems.NETHERITE_MAGE_LEGGINGS, PBArmorItems.NETHERITE_MAGE_BOOTS,
                    NetheriteMaterialBonuses.abyss(),
                    ClassArmorSetBonuses.mage("netherite_mage", "tooltip.project_babylon_armors.bonus.ember_archon.name", 115.0D, 28.0D, 18.0D, 15.0D, 15.0D)),
            createSet("netherite_tank", "tooltip.project_babylon_armors.set.netherite_tank",
                    PBArmorItems.NETHERITE_TANK_HELMET, PBArmorItems.NETHERITE_TANK_CHESTPLATE, PBArmorItems.NETHERITE_TANK_LEGGINGS, PBArmorItems.NETHERITE_TANK_BOOTS,
                    NetheriteMaterialBonuses.abyss(),
                    ClassArmorSetBonuses.tank("netherite_tank", "tooltip.project_babylon_armors.bonus.infernal_bastion.name", 30.0D, 30.0D, 12.0D)),
            createSet("netherite_rogue", "tooltip.project_babylon_armors.set.netherite_rogue",
                    PBArmorItems.NETHERITE_ROGUE_HELMET, PBArmorItems.NETHERITE_ROGUE_CHESTPLATE, PBArmorItems.NETHERITE_ROGUE_LEGGINGS, PBArmorItems.NETHERITE_ROGUE_BOOTS,
                    NetheriteMaterialBonuses.abyss(),
                    ClassArmorSetBonuses.rogue("netherite_rogue", "tooltip.project_babylon_armors.bonus.ashen_reaper.name", 20.0D, 20.0D, 20.0D, 20.0D, 10.0D)),

            createSet("dragonsteel_warrior", "tooltip.project_babylon_armors.set.dragonsteel_warrior",
                    PBArmorItems.DRAGONSTEEL_WARRIOR_HELMET, PBArmorItems.DRAGONSTEEL_WARRIOR_CHESTPLATE, PBArmorItems.DRAGONSTEEL_WARRIOR_LEGGINGS, PBArmorItems.DRAGONSTEEL_WARRIOR_BOOTS,
                    DragonsteelMaterialBonuses.rebirth(),
                    ClassArmorSetBonuses.warrior("dragonsteel_warrior", "tooltip.project_babylon_armors.bonus.dragonsoul_champion.name", 30.0D, 35.0D, 15.0D)),
            createSet("dragonsteel_mage", "tooltip.project_babylon_armors.set.dragonsteel_mage",
                    PBArmorItems.DRAGONSTEEL_MAGE_HELMET, PBArmorItems.DRAGONSTEEL_MAGE_CHESTPLATE, PBArmorItems.DRAGONSTEEL_MAGE_LEGGINGS, PBArmorItems.DRAGONSTEEL_MAGE_BOOTS,
                    DragonsteelMaterialBonuses.rebirth(),
                    ClassArmorSetBonuses.mage("dragonsteel_mage", "tooltip.project_babylon_armors.bonus.wyrm_archmage.name", 125.0D, 33.0D, 22.0D, 22.0D, 22.0D)),
            createSet("dragonsteel_tank", "tooltip.project_babylon_armors.set.dragonsteel_tank",
                    PBArmorItems.DRAGONSTEEL_TANK_HELMET, PBArmorItems.DRAGONSTEEL_TANK_CHESTPLATE, PBArmorItems.DRAGONSTEEL_TANK_LEGGINGS, PBArmorItems.DRAGONSTEEL_TANK_BOOTS,
                    DragonsteelMaterialBonuses.rebirth(),
                    ClassArmorSetBonuses.tank("dragonsteel_tank", "tooltip.project_babylon_armors.bonus.wyrmguard.name", 35.0D, 35.0D, 15.0D)),
            createSet("dragonsteel_rogue", "tooltip.project_babylon_armors.set.dragonsteel_rogue",
                    PBArmorItems.DRAGONSTEEL_ROGUE_HELMET, PBArmorItems.DRAGONSTEEL_ROGUE_CHESTPLATE, PBArmorItems.DRAGONSTEEL_ROGUE_LEGGINGS, PBArmorItems.DRAGONSTEEL_ROGUE_BOOTS,
                    DragonsteelMaterialBonuses.rebirth(),
                    ClassArmorSetBonuses.rogue("dragonsteel_rogue", "tooltip.project_babylon_armors.bonus.dragon_fang.name", 25.0D, 20.0D, 25.0D, 25.0D, 15.0D))
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

    private static ArmorSetDefinition createSet(String id, String displayNameKey,
                                                Supplier<Item> helmet,
                                                Supplier<Item> chestplate,
                                                Supplier<Item> leggings,
                                                Supplier<Item> boots,
                                                com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus classBonus) {
        return createSet(id, displayNameKey, helmet, chestplate, leggings, boots, null, classBonus);
    }
    private static ArmorSetDefinition createSet(String id, String displayNameKey,
                                                Supplier<Item> helmet,
                                                Supplier<Item> chestplate,
                                                Supplier<Item> leggings,
                                                Supplier<Item> boots,
                                                com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus materialBonus,
                                                com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus classBonus) {
        ArmorSetDefinition.Builder builder = ArmorSetDefinition.builder(id)
                .displayNameKey(displayNameKey)
                .helmet(helmet)
                .chestplate(chestplate)
                .leggings(leggings)
                .boots(boots);
        if (materialBonus != null) {
            builder.materialBonus(materialBonus);
        }
        return builder
                .classBonus(classBonus)
                .build();
    }
}



