package com.rave.projectbabylonarmors.client.geo.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public final class NetheriteMageGeoRenderers {
    private static final ResourceLocation HELMET_ID = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "netherite_mage_helmet");
    private static final ResourceLocation CHESTPLATE_ID = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "netherite_mage_chestplate");
    private static final ResourceLocation LEGGINGS_ID = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "netherite_mage_leggings");
    private static final ResourceLocation BOOTS_ID = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "netherite_mage_boots");
    private static final String EPIC_FIGHT_TRANSFORMER = "com.rave.projectbabylonarmors.client.geo.renderer.PBAEpicFightGeoArmorTransformer";
    private static final PBAGeoArmorSetDefinition DEFINITION = PBAGeoArmorSetDefinition.builder()
        .helmet(HELMET_ID, () -> configuredRenderer(
            "geo/netherite_mage_helmet.geo.json",
            "textures/entities/netherite_mage_helmet.png",
            PBAGeoArmorSetDefinition.SlotMode.DEFAULT,
            PBAGeoArmorSetDefinition.ChestMode.DEFAULT
        ))
        .chestplate(CHESTPLATE_ID, () -> configuredRenderer(
            "geo/netherite_mage_chestplate.geo.json",
            "textures/entities/netherite_mage_chestplate.png",
            PBAGeoArmorSetDefinition.SlotMode.DEFAULT,
            PBAGeoArmorSetDefinition.ChestMode.RIGID_CHEST
        ), PBAGeoArmorSetDefinition.ChestMode.RIGID_CHEST)
        .leggings(LEGGINGS_ID, () -> configuredRenderer(
            "geo/netherite_mage_leggings.geo.json",
            "textures/entities/netherite_mage_leggings.png",
            PBAGeoArmorSetDefinition.SlotMode.LEGGINGS,
            PBAGeoArmorSetDefinition.ChestMode.DEFAULT
        ))
        .boots(BOOTS_ID, () -> configuredRenderer(
            "geo/netherite_mage_boots.geo.json",
            "textures/entities/netherite_mage_boots.png",
            PBAGeoArmorSetDefinition.SlotMode.BOOTS,
            PBAGeoArmorSetDefinition.ChestMode.DEFAULT
        ))
        .epicFightTransformer(EPIC_FIGHT_TRANSFORMER)
        .build();
    private static boolean registered;

    private NetheriteMageGeoRenderers() {
    }

    public static synchronized void register() {
        if (registered) {
            return;
        }

        PBAGeoArmorAutoRegistry.register(DEFINITION);
        registered = true;
    }

    public static PBAGeoArmorRenderer<?> getRendererForStack(ItemStack stack) {
        register();
        return getRendererForItem(stack.getItem());
    }

    public static PBAGeoArmorRenderer<?> getRendererForItem(Item item) {
        register();
        return PBAGeoArmorAutoRegistry.getRenderer(item, PBAGeoArmorRenderer.class);
    }

    private static PBAGeoArmorRenderer<?> configuredRenderer(
        String modelPath,
        String texturePath,
        PBAGeoArmorSetDefinition.SlotMode slotMode,
        PBAGeoArmorSetDefinition.ChestMode chestMode
    ) {
        return new PBAConfiguredGeoArmorRenderer<>(modelPath, texturePath, slotMode, chestMode);
    }
}
