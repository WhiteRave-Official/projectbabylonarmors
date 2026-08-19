package com.rave.projectbabylonarmors.client.geo.renderer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PBAGeoArmorAutoRegistry {
    private static final List<PBAGeoArmorSetDefinition> DEFINITIONS = new ArrayList<>();
    private static final Set<ResourceLocation> REGISTERED_IDS = new HashSet<>();

    private PBAGeoArmorAutoRegistry() {
    }

    public static synchronized void register(PBAGeoArmorSetDefinition definition) {
        boolean added = registerSlot(definition.getHelmetId(), definition.getHelmetFactory());
        added |= registerSlot(definition.getChestplateId(), definition.getChestplateFactory());
        added |= registerSlot(definition.getLeggingsId(), definition.getLeggingsFactory());
        added |= registerSlot(definition.getBootsId(), definition.getBootsFactory());

        if (added || !DEFINITIONS.contains(definition)) {
            DEFINITIONS.add(definition);
        }
    }

    private static boolean registerSlot(ResourceLocation itemId, java.util.function.Supplier<? extends GeoArmorRenderer<?>> factory) {
        if (!REGISTERED_IDS.add(itemId)) {
            return false;
        }

        PBAGeoArmorRendererRegistry.register(itemId, factory);
        return true;
    }

    public static synchronized List<PBAGeoArmorSetDefinition> getDefinitions() {
        return Collections.unmodifiableList(new ArrayList<>(DEFINITIONS));
    }

    public static <T extends GeoArmorRenderer<?>> T getRenderer(ItemStack stack, Class<T> rendererClass) {
        return castRenderer(PBAGeoArmorRendererRegistry.getRenderer(stack), rendererClass);
    }

    public static <T extends GeoArmorRenderer<?>> T getRenderer(Item item, Class<T> rendererClass) {
        return castRenderer(PBAGeoArmorRendererRegistry.getRenderer(item), rendererClass);
    }

    public static <T extends GeoArmorRenderer<?>> T getRenderer(ResourceLocation itemId, Class<T> rendererClass) {
        return castRenderer(PBAGeoArmorRendererRegistry.getRenderer(itemId), rendererClass);
    }

    private static <T extends GeoArmorRenderer<?>> T castRenderer(GeoArmorRenderer<?> renderer, Class<T> rendererClass) {
        return rendererClass.isInstance(renderer) ? rendererClass.cast(renderer) : null;
    }
}
