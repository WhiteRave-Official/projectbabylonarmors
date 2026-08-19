package com.rave.projectbabylonarmors.client.geo.renderer;

import java.util.Objects;
import java.util.function.Supplier;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PBAGeoArmorSetDefinition {
    private final SlotDefinition helmet;
    private final SlotDefinition chestplate;
    private final SlotDefinition leggings;
    private final SlotDefinition boots;
    private final String epicFightTransformerClassName;

    private PBAGeoArmorSetDefinition(Builder builder) {
        this.helmet = Objects.requireNonNull(builder.helmet);
        this.chestplate = Objects.requireNonNull(builder.chestplate);
        this.leggings = Objects.requireNonNull(builder.leggings);
        this.boots = Objects.requireNonNull(builder.boots);
        this.epicFightTransformerClassName = builder.epicFightTransformerClassName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SlotDefinition getHelmet() {
        return this.helmet;
    }

    public SlotDefinition getChestplate() {
        return this.chestplate;
    }

    public SlotDefinition getLeggings() {
        return this.leggings;
    }

    public SlotDefinition getBoots() {
        return this.boots;
    }

    public ResourceLocation getHelmetId() {
        return this.helmet.itemId();
    }

    public Supplier<? extends GeoArmorRenderer<?>> getHelmetFactory() {
        return this.helmet.factory();
    }

    public ResourceLocation getChestplateId() {
        return this.chestplate.itemId();
    }

    public Supplier<? extends GeoArmorRenderer<?>> getChestplateFactory() {
        return this.chestplate.factory();
    }

    public ResourceLocation getLeggingsId() {
        return this.leggings.itemId();
    }

    public Supplier<? extends GeoArmorRenderer<?>> getLeggingsFactory() {
        return this.leggings.factory();
    }

    public ResourceLocation getBootsId() {
        return this.boots.itemId();
    }

    public Supplier<? extends GeoArmorRenderer<?>> getBootsFactory() {
        return this.boots.factory();
    }

    public String getEpicFightTransformerClassName() {
        return this.epicFightTransformerClassName;
    }

    public record SlotDefinition(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory,
                                 SlotMode slotMode, ChestMode chestMode) {
        public SlotDefinition {
            Objects.requireNonNull(itemId);
            Objects.requireNonNull(factory);
            Objects.requireNonNull(slotMode);
            Objects.requireNonNull(chestMode);
        }
    }

    public enum SlotMode {
        DEFAULT,
        LEGGINGS,
        BOOTS
    }

    public enum ChestMode {
        DEFAULT,
        RIGID_CHEST,
        RIGID_SPLIT_CHEST
    }

    public static final class Builder {
        private SlotDefinition helmet;
        private SlotDefinition chestplate;
        private SlotDefinition leggings;
        private SlotDefinition boots;
        private String epicFightTransformerClassName;

        private Builder() {
        }

        public Builder helmet(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory) {
            this.helmet = new SlotDefinition(itemId, factory, SlotMode.DEFAULT, ChestMode.DEFAULT);
            return this;
        }

        public Builder chestplate(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory, ChestMode chestMode) {
            this.chestplate = new SlotDefinition(itemId, factory, SlotMode.DEFAULT, chestMode);
            return this;
        }

        public Builder leggings(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory) {
            this.leggings = new SlotDefinition(itemId, factory, SlotMode.LEGGINGS, ChestMode.DEFAULT);
            return this;
        }

        public Builder boots(ResourceLocation itemId, Supplier<? extends GeoArmorRenderer<?>> factory) {
            this.boots = new SlotDefinition(itemId, factory, SlotMode.BOOTS, ChestMode.DEFAULT);
            return this;
        }

        public Builder epicFightTransformer(String transformerClassName) {
            this.epicFightTransformerClassName = transformerClassName;
            return this;
        }

        public PBAGeoArmorSetDefinition build() {
            return new PBAGeoArmorSetDefinition(this);
        }
    }
}
