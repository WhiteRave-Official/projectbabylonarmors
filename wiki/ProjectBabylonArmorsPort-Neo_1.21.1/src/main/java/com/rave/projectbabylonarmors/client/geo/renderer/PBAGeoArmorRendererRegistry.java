package com.rave.projectbabylonarmors.client.geo.renderer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PBAGeoArmorRendererRegistry {
    private static final Map<ResourceLocation, Supplier<? extends GeoArmorRenderer<?>>> FACTORIES = new HashMap<>();
    private static final Map<ResourceLocation, GeoArmorRenderer<?>> CACHE = new HashMap<>();

    private PBAGeoArmorRendererRegistry() {
    }

    public static synchronized void register(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory) {
        FACTORIES.put(Objects.requireNonNull(itemId), Objects.requireNonNull(factory));
    }

    public static synchronized GeoArmorRenderer<?> getRenderer(ItemStack stack) {
        return getRenderer(stack.getItem());
    }

    public static synchronized GeoArmorRenderer<?> getRenderer(ResourceLocation itemId) {
        if (itemId == null) {
            return null;
        }

        GeoArmorRenderer<?> cachedRenderer = CACHE.get(itemId);
        if (cachedRenderer != null) {
            return cachedRenderer;
        }

        Supplier<? extends GeoArmorRenderer<?>> factory = FACTORIES.get(itemId);
        if (factory == null) {
            return null;
        }

        GeoArmorRenderer<?> renderer = factory.get();
        CACHE.put(itemId, renderer);
        return renderer;
    }

    public static synchronized GeoArmorRenderer<?> getRenderer(Item item) {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        return getRenderer(itemId);
    }

    public static synchronized void clearCache() {
        CACHE.clear();
    }

    public static synchronized int getCacheSize() {
        return CACHE.size();
    }
}