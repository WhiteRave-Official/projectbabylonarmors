package com.rave.projectbabylonarmors.mixin;

import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import yesman.epicfight.api.client.model.SkinnedMesh;
import yesman.epicfight.client.renderer.patched.layer.WearableItemLayer;

import java.util.Map;

@Mixin(WearableItemLayer.class)
public interface WearableItemLayerAccessor {
    @Accessor("ARMOR_MODELS")
    static Map<ResourceLocation, SkinnedMesh> pba$getArmorModels() {
        throw new UnsupportedOperationException();
    }

    @Accessor("EPICFIGHT_OVERRIDING_TEXTURES")
    static Map<String, ResourceLocation> pba$getOverridingTextures() {
        throw new UnsupportedOperationException();
    }
}
