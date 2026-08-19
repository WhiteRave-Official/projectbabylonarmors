package com.rave.projectbabylonarmors.client.geo.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;

public class PBAFixedGeoArmorModel<T extends Item & GeoItem> extends GeoModel<T> {
    private final ResourceLocation modelResource;
    private final ResourceLocation textureResource;

    public PBAFixedGeoArmorModel(String modelPath, String texturePath) {
        this.modelResource = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", modelPath);
        this.textureResource = ResourceLocation.fromNamespaceAndPath("project_babylon_armors", texturePath);
    }

    @Override
    public ResourceLocation getModelResource(T animatable) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return null;
    }

    public ResourceLocation getFixedModelResource() {
        return this.modelResource;
    }

    public ResourceLocation getFixedTextureResource() {
        return this.textureResource;
    }
}
