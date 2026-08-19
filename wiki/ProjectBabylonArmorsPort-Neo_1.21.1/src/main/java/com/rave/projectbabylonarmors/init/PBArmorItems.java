package com.rave.projectbabylonarmors.init;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.item.DiamondMageArmor;
import com.rave.projectbabylonarmors.item.DiamondRogueArmor;
import com.rave.projectbabylonarmors.item.DiamondTankArmor;
import com.rave.projectbabylonarmors.item.DiamondWarriorArmor;
import com.rave.projectbabylonarmors.item.DragonsteelMageArmor;
import com.rave.projectbabylonarmors.item.DragonsteelRogueArmor;
import com.rave.projectbabylonarmors.item.DragonsteelTankArmor;
import com.rave.projectbabylonarmors.item.DragonsteelWarriorArmor;
import com.rave.projectbabylonarmors.item.EtherealMageArmor;
import com.rave.projectbabylonarmors.item.EtherealRogueArmor;
import com.rave.projectbabylonarmors.item.EtherealTankArmor;
import com.rave.projectbabylonarmors.item.EtherealWarriorArmor;
import com.rave.projectbabylonarmors.item.GoldenMageArmor;
import com.rave.projectbabylonarmors.item.GoldenRogueArmor;
import com.rave.projectbabylonarmors.item.GoldenTankArmor;
import com.rave.projectbabylonarmors.item.GoldenWarriorArmor;
import com.rave.projectbabylonarmors.item.IceMageArmor;
import com.rave.projectbabylonarmors.item.IceRogueArmor;
import com.rave.projectbabylonarmors.item.IceTankArmor;
import com.rave.projectbabylonarmors.item.IceWarriorArmor;
import com.rave.projectbabylonarmors.item.IronMageArmor;
import com.rave.projectbabylonarmors.item.IronRogueArmor;
import com.rave.projectbabylonarmors.item.IronTankArmor;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;
import com.rave.projectbabylonarmors.item.NetheriteMageArmor;
import com.rave.projectbabylonarmors.item.NetheriteRogueArmor;
import com.rave.projectbabylonarmors.item.NetheriteTankArmor;
import com.rave.projectbabylonarmors.item.NetheriteWarriorArmor;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class PBArmorItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, ProjectBabylonArmors.MODID);

    public static final DeferredHolder<Item, Item> DIAMOND_MAGE_BOOTS =
            ITEMS.register("diamond_mage_boots", DiamondMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DIAMOND_MAGE_CHESTPLATE =
            ITEMS.register("diamond_mage_chestplate", DiamondMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DIAMOND_MAGE_HELMET =
            ITEMS.register("diamond_mage_helmet", DiamondMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DIAMOND_MAGE_LEGGINGS =
            ITEMS.register("diamond_mage_leggings", DiamondMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DIAMOND_ROGUE_BOOTS =
            ITEMS.register("diamond_rogue_boots", DiamondRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DIAMOND_ROGUE_CHESTPLATE =
            ITEMS.register("diamond_rogue_chestplate", DiamondRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DIAMOND_ROGUE_HELMET =
            ITEMS.register("diamond_rogue_helmet", DiamondRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DIAMOND_ROGUE_LEGGINGS =
            ITEMS.register("diamond_rogue_leggings", DiamondRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DIAMOND_TANK_BOOTS =
            ITEMS.register("diamond_tank_boots", DiamondTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DIAMOND_TANK_CHESTPLATE =
            ITEMS.register("diamond_tank_chestplate", DiamondTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DIAMOND_TANK_HELMET =
            ITEMS.register("diamond_tank_helmet", DiamondTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DIAMOND_TANK_LEGGINGS =
            ITEMS.register("diamond_tank_leggings", DiamondTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DIAMOND_WARRIOR_BOOTS =
            ITEMS.register("diamond_warrior_boots", DiamondWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DIAMOND_WARRIOR_CHESTPLATE =
            ITEMS.register("diamond_warrior_chestplate", DiamondWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DIAMOND_WARRIOR_HELMET =
            ITEMS.register("diamond_warrior_helmet", DiamondWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DIAMOND_WARRIOR_LEGGINGS =
            ITEMS.register("diamond_warrior_leggings", DiamondWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_MAGE_BOOTS =
            ITEMS.register("dragonsteel_mage_boots", DragonsteelMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_MAGE_CHESTPLATE =
            ITEMS.register("dragonsteel_mage_chestplate", DragonsteelMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_MAGE_HELMET =
            ITEMS.register("dragonsteel_mage_helmet", DragonsteelMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_MAGE_LEGGINGS =
            ITEMS.register("dragonsteel_mage_leggings", DragonsteelMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_ROGUE_BOOTS =
            ITEMS.register("dragonsteel_rogue_boots", DragonsteelRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_ROGUE_CHESTPLATE =
            ITEMS.register("dragonsteel_rogue_chestplate", DragonsteelRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_ROGUE_HELMET =
            ITEMS.register("dragonsteel_rogue_helmet", DragonsteelRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_ROGUE_LEGGINGS =
            ITEMS.register("dragonsteel_rogue_leggings", DragonsteelRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_TANK_BOOTS =
            ITEMS.register("dragonsteel_tank_boots", DragonsteelTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_TANK_CHESTPLATE =
            ITEMS.register("dragonsteel_tank_chestplate", DragonsteelTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_TANK_HELMET =
            ITEMS.register("dragonsteel_tank_helmet", DragonsteelTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_TANK_LEGGINGS =
            ITEMS.register("dragonsteel_tank_leggings", DragonsteelTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_WARRIOR_BOOTS =
            ITEMS.register("dragonsteel_warrior_boots", DragonsteelWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_WARRIOR_CHESTPLATE =
            ITEMS.register("dragonsteel_warrior_chestplate", DragonsteelWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_WARRIOR_HELMET =
            ITEMS.register("dragonsteel_warrior_helmet", DragonsteelWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> DRAGONSTEEL_WARRIOR_LEGGINGS =
            ITEMS.register("dragonsteel_warrior_leggings", DragonsteelWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_MAGE_BOOTS =
            ITEMS.register("ethereal_mage_boots", EtherealMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_MAGE_CHESTPLATE =
            ITEMS.register("ethereal_mage_chestplate", EtherealMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_MAGE_HELMET =
            ITEMS.register("ethereal_mage_helmet", EtherealMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_MAGE_LEGGINGS =
            ITEMS.register("ethereal_mage_leggings", EtherealMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_ROGUE_BOOTS =
            ITEMS.register("ethereal_rogue_boots", EtherealRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_ROGUE_CHESTPLATE =
            ITEMS.register("ethereal_rogue_chestplate", EtherealRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_ROGUE_HELMET =
            ITEMS.register("ethereal_rogue_helmet", EtherealRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_ROGUE_LEGGINGS =
            ITEMS.register("ethereal_rogue_leggings", EtherealRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_TANK_BOOTS =
            ITEMS.register("ethereal_tank_boots", EtherealTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_TANK_CHESTPLATE =
            ITEMS.register("ethereal_tank_chestplate", EtherealTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_TANK_HELMET =
            ITEMS.register("ethereal_tank_helmet", EtherealTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_TANK_LEGGINGS =
            ITEMS.register("ethereal_tank_leggings", EtherealTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_WARRIOR_BOOTS =
            ITEMS.register("ethereal_warrior_boots", EtherealWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_WARRIOR_CHESTPLATE =
            ITEMS.register("ethereal_warrior_chestplate", EtherealWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_WARRIOR_HELMET =
            ITEMS.register("ethereal_warrior_helmet", EtherealWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ETHEREAL_WARRIOR_LEGGINGS =
            ITEMS.register("ethereal_warrior_leggings", EtherealWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> GOLDEN_MAGE_BOOTS =
            ITEMS.register("golden_mage_boots", GoldenMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> GOLDEN_MAGE_CHESTPLATE =
            ITEMS.register("golden_mage_chestplate", GoldenMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> GOLDEN_MAGE_HELMET =
            ITEMS.register("golden_mage_helmet", GoldenMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> GOLDEN_MAGE_LEGGINGS =
            ITEMS.register("golden_mage_leggings", GoldenMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> GOLDEN_ROGUE_BOOTS =
            ITEMS.register("golden_rogue_boots", GoldenRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> GOLDEN_ROGUE_CHESTPLATE =
            ITEMS.register("golden_rogue_chestplate", GoldenRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> GOLDEN_ROGUE_HELMET =
            ITEMS.register("golden_rogue_helmet", GoldenRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> GOLDEN_ROGUE_LEGGINGS =
            ITEMS.register("golden_rogue_leggings", GoldenRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> GOLDEN_TANK_BOOTS =
            ITEMS.register("golden_tank_boots", GoldenTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> GOLDEN_TANK_CHESTPLATE =
            ITEMS.register("golden_tank_chestplate", GoldenTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> GOLDEN_TANK_HELMET =
            ITEMS.register("golden_tank_helmet", GoldenTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> GOLDEN_TANK_LEGGINGS =
            ITEMS.register("golden_tank_leggings", GoldenTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> GOLDEN_WARRIOR_BOOTS =
            ITEMS.register("golden_warrior_boots", GoldenWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> GOLDEN_WARRIOR_CHESTPLATE =
            ITEMS.register("golden_warrior_chestplate", GoldenWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> GOLDEN_WARRIOR_HELMET =
            ITEMS.register("golden_warrior_helmet", GoldenWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> GOLDEN_WARRIOR_LEGGINGS =
            ITEMS.register("golden_warrior_leggings", GoldenWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ICE_MAGE_BOOTS =
            ITEMS.register("ice_mage_boots", IceMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ICE_MAGE_CHESTPLATE =
            ITEMS.register("ice_mage_chestplate", IceMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ICE_MAGE_HELMET =
            ITEMS.register("ice_mage_helmet", IceMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ICE_MAGE_LEGGINGS =
            ITEMS.register("ice_mage_leggings", IceMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ICE_ROGUE_BOOTS =
            ITEMS.register("ice_rogue_boots", IceRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ICE_ROGUE_CHESTPLATE =
            ITEMS.register("ice_rogue_chestplate", IceRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ICE_ROGUE_HELMET =
            ITEMS.register("ice_rogue_helmet", IceRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ICE_ROGUE_LEGGINGS =
            ITEMS.register("ice_rogue_leggings", IceRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ICE_TANK_BOOTS =
            ITEMS.register("ice_tank_boots", IceTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ICE_TANK_CHESTPLATE =
            ITEMS.register("ice_tank_chestplate", IceTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ICE_TANK_HELMET =
            ITEMS.register("ice_tank_helmet", IceTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ICE_TANK_LEGGINGS =
            ITEMS.register("ice_tank_leggings", IceTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> ICE_WARRIOR_BOOTS =
            ITEMS.register("ice_warrior_boots", IceWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> ICE_WARRIOR_CHESTPLATE =
            ITEMS.register("ice_warrior_chestplate", IceWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> ICE_WARRIOR_HELMET =
            ITEMS.register("ice_warrior_helmet", IceWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> ICE_WARRIOR_LEGGINGS =
            ITEMS.register("ice_warrior_leggings", IceWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> IRON_MAGE_BOOTS =
            ITEMS.register("iron_mage_boots", IronMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> IRON_MAGE_CHESTPLATE =
            ITEMS.register("iron_mage_chestplate", IronMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> IRON_MAGE_HELMET =
            ITEMS.register("iron_mage_helmet", IronMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> IRON_MAGE_LEGGINGS =
            ITEMS.register("iron_mage_leggings", IronMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> IRON_ROGUE_BOOTS =
            ITEMS.register("iron_rogue_boots", IronRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> IRON_ROGUE_CHESTPLATE =
            ITEMS.register("iron_rogue_chestplate", IronRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> IRON_ROGUE_HELMET =
            ITEMS.register("iron_rogue_helmet", IronRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> IRON_ROGUE_LEGGINGS =
            ITEMS.register("iron_rogue_leggings", IronRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> IRON_TANK_BOOTS =
            ITEMS.register("iron_tank_boots", IronTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> IRON_TANK_CHESTPLATE =
            ITEMS.register("iron_tank_chestplate", IronTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> IRON_TANK_HELMET =
            ITEMS.register("iron_tank_helmet", IronTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> IRON_TANK_LEGGINGS =
            ITEMS.register("iron_tank_leggings", IronTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> IRON_WARRIOR_BOOTS =
            ITEMS.register("iron_warrior_boots", IronWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> IRON_WARRIOR_CHESTPLATE =
            ITEMS.register("iron_warrior_chestplate", IronWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> IRON_WARRIOR_HELMET =
            ITEMS.register("iron_warrior_helmet", IronWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> IRON_WARRIOR_LEGGINGS =
            ITEMS.register("iron_warrior_leggings", IronWarriorArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> NETHERITE_MAGE_BOOTS =
            ITEMS.register("netherite_mage_boots", NetheriteMageArmor.Boots::new);

    public static final DeferredHolder<Item, Item> NETHERITE_MAGE_CHESTPLATE =
            ITEMS.register("netherite_mage_chestplate", NetheriteMageArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> NETHERITE_MAGE_HELMET =
            ITEMS.register("netherite_mage_helmet", NetheriteMageArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> NETHERITE_MAGE_LEGGINGS =
            ITEMS.register("netherite_mage_leggings", NetheriteMageArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> NETHERITE_ROGUE_BOOTS =
            ITEMS.register("netherite_rogue_boots", NetheriteRogueArmor.Boots::new);

    public static final DeferredHolder<Item, Item> NETHERITE_ROGUE_CHESTPLATE =
            ITEMS.register("netherite_rogue_chestplate", NetheriteRogueArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> NETHERITE_ROGUE_HELMET =
            ITEMS.register("netherite_rogue_helmet", NetheriteRogueArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> NETHERITE_ROGUE_LEGGINGS =
            ITEMS.register("netherite_rogue_leggings", NetheriteRogueArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> NETHERITE_TANK_BOOTS =
            ITEMS.register("netherite_tank_boots", NetheriteTankArmor.Boots::new);

    public static final DeferredHolder<Item, Item> NETHERITE_TANK_CHESTPLATE =
            ITEMS.register("netherite_tank_chestplate", NetheriteTankArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> NETHERITE_TANK_HELMET =
            ITEMS.register("netherite_tank_helmet", NetheriteTankArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> NETHERITE_TANK_LEGGINGS =
            ITEMS.register("netherite_tank_leggings", NetheriteTankArmor.Leggings::new);

    public static final DeferredHolder<Item, Item> NETHERITE_WARRIOR_BOOTS =
            ITEMS.register("netherite_warrior_boots", NetheriteWarriorArmor.Boots::new);

    public static final DeferredHolder<Item, Item> NETHERITE_WARRIOR_CHESTPLATE =
            ITEMS.register("netherite_warrior_chestplate", NetheriteWarriorArmor.Chestplate::new);

    public static final DeferredHolder<Item, Item> NETHERITE_WARRIOR_HELMET =
            ITEMS.register("netherite_warrior_helmet", NetheriteWarriorArmor.Helmet::new);

    public static final DeferredHolder<Item, Item> NETHERITE_WARRIOR_LEGGINGS =
            ITEMS.register("netherite_warrior_leggings", NetheriteWarriorArmor.Leggings::new);

}
