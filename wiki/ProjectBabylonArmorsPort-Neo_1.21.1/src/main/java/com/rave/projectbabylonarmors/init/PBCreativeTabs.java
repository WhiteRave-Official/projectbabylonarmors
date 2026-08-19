package com.rave.projectbabylonarmors.init;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class PBCreativeTabs {
    private static final ResourceKey<Registry<CreativeModeTab>> CREATIVE_MODE_TAB_KEY =
            ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath("minecraft", "creative_mode_tab"));

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(CREATIVE_MODE_TAB_KEY, ProjectBabylonArmors.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ARMORS = TABS.register("armors", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(PBArmorItems.DIAMOND_MAGE_BOOTS.get()))
                    .title(net.minecraft.network.chat.Component.translatable("itemGroup.project_babylon_armors.armors"))
                    .displayItems((params, output) -> {
                        output.accept(PBArmorItems.DIAMOND_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.DIAMOND_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.DIAMOND_MAGE_HELMET.get());
                        output.accept(PBArmorItems.DIAMOND_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.DIAMOND_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.DIAMOND_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.DIAMOND_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.DIAMOND_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.DIAMOND_TANK_BOOTS.get());
                        output.accept(PBArmorItems.DIAMOND_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.DIAMOND_TANK_HELMET.get());
                        output.accept(PBArmorItems.DIAMOND_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.DIAMOND_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.DIAMOND_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.DIAMOND_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.DIAMOND_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_MAGE_HELMET.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_TANK_BOOTS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_TANK_HELMET.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.DRAGONSTEEL_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.ETHEREAL_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.ETHEREAL_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.ETHEREAL_MAGE_HELMET.get());
                        output.accept(PBArmorItems.ETHEREAL_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.ETHEREAL_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.ETHEREAL_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.ETHEREAL_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.ETHEREAL_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.ETHEREAL_TANK_BOOTS.get());
                        output.accept(PBArmorItems.ETHEREAL_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.ETHEREAL_TANK_HELMET.get());
                        output.accept(PBArmorItems.ETHEREAL_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.ETHEREAL_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.ETHEREAL_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.ETHEREAL_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.ETHEREAL_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.GOLDEN_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.GOLDEN_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.GOLDEN_MAGE_HELMET.get());
                        output.accept(PBArmorItems.GOLDEN_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.GOLDEN_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.GOLDEN_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.GOLDEN_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.GOLDEN_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.GOLDEN_TANK_BOOTS.get());
                        output.accept(PBArmorItems.GOLDEN_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.GOLDEN_TANK_HELMET.get());
                        output.accept(PBArmorItems.GOLDEN_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.GOLDEN_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.GOLDEN_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.GOLDEN_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.GOLDEN_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.ICE_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.ICE_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.ICE_MAGE_HELMET.get());
                        output.accept(PBArmorItems.ICE_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.ICE_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.ICE_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.ICE_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.ICE_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.ICE_TANK_BOOTS.get());
                        output.accept(PBArmorItems.ICE_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.ICE_TANK_HELMET.get());
                        output.accept(PBArmorItems.ICE_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.ICE_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.ICE_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.ICE_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.ICE_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.IRON_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.IRON_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.IRON_MAGE_HELMET.get());
                        output.accept(PBArmorItems.IRON_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.IRON_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.IRON_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.IRON_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.IRON_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.IRON_TANK_BOOTS.get());
                        output.accept(PBArmorItems.IRON_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.IRON_TANK_HELMET.get());
                        output.accept(PBArmorItems.IRON_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.IRON_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.IRON_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.IRON_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.IRON_WARRIOR_LEGGINGS.get());
                        output.accept(PBArmorItems.NETHERITE_MAGE_BOOTS.get());
                        output.accept(PBArmorItems.NETHERITE_MAGE_CHESTPLATE.get());
                        output.accept(PBArmorItems.NETHERITE_MAGE_HELMET.get());
                        output.accept(PBArmorItems.NETHERITE_MAGE_LEGGINGS.get());
                        output.accept(PBArmorItems.NETHERITE_ROGUE_BOOTS.get());
                        output.accept(PBArmorItems.NETHERITE_ROGUE_CHESTPLATE.get());
                        output.accept(PBArmorItems.NETHERITE_ROGUE_HELMET.get());
                        output.accept(PBArmorItems.NETHERITE_ROGUE_LEGGINGS.get());
                        output.accept(PBArmorItems.NETHERITE_TANK_BOOTS.get());
                        output.accept(PBArmorItems.NETHERITE_TANK_CHESTPLATE.get());
                        output.accept(PBArmorItems.NETHERITE_TANK_HELMET.get());
                        output.accept(PBArmorItems.NETHERITE_TANK_LEGGINGS.get());
                        output.accept(PBArmorItems.NETHERITE_WARRIOR_BOOTS.get());
                        output.accept(PBArmorItems.NETHERITE_WARRIOR_CHESTPLATE.get());
                        output.accept(PBArmorItems.NETHERITE_WARRIOR_HELMET.get());
                        output.accept(PBArmorItems.NETHERITE_WARRIOR_LEGGINGS.get());
                    })
                    .build());
}
