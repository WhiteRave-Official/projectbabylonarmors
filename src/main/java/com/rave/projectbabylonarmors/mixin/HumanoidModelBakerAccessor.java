package com.rave.projectbabylonarmors.mixin;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import yesman.epicfight.api.client.model.SkinnedMesh;
import yesman.epicfight.api.client.model.transformer.HumanoidModelBaker;
import yesman.epicfight.api.client.model.transformer.HumanoidModelTransformer;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mixin(value = HumanoidModelBaker.class, remap = false)
public interface HumanoidModelBakerAccessor {
    @Accessor("MODEL_TRANSFORMERS")
    static List<HumanoidModelTransformer> pba$getModelTransformers() {
        throw new UnsupportedOperationException();
    }

    @Accessor("EXCEPTIONAL_MODELS")
    static Set<ArmorItem> pba$getExceptionalModels() {
        throw new UnsupportedOperationException();
    }

    @Accessor("BAKED_MODELS")
    static Map<ResourceLocation, SkinnedMesh> pba$getBakedModels() {
        throw new UnsupportedOperationException();
    }
}
