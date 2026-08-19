package com.rave.projectbabylonarmors.client.compat.epicfight;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAEpicFightGeoArmorTransformer;
import com.rave.projectbabylonarmors.mixin.HumanoidModelBakerAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import yesman.epicfight.api.client.model.SkinnedMesh;
import yesman.epicfight.compat.geckolib.client.GeoModelTransformer;
import yesman.epicfight.api.client.model.transformer.HumanoidModelTransformer;

import net.minecraft.world.item.ArmorItem;

import java.util.List;
import java.util.Map;
import java.util.Set;

public final class EpicFightClientCompat {
    private static final PBAEpicFightGeoArmorTransformer GEO_ARMOR_TRANSFORMER = new PBAEpicFightGeoArmorTransformer();
    private static boolean registered;

    private EpicFightClientCompat() {
    }

    public static synchronized void register() {
        refreshTransformers();
        registered = true;
    }

    public static synchronized void refreshTransformers() {
        List<HumanoidModelTransformer> transformers = HumanoidModelBakerAccessor.pba$getModelTransformers();
        transformers.removeIf(transformer -> transformer instanceof GeoModelTransformer || transformer instanceof PBAEpicFightGeoArmorTransformer);
        transformers.add(GEO_ARMOR_TRANSFORMER);

        clearExceptionalModels();
        clearBakedModels();
    }

    public static boolean isRegistered() {
        return registered;
    }

    private static void clearExceptionalModels() {
        Set<ArmorItem> exceptionalModels = HumanoidModelBakerAccessor.pba$getExceptionalModels();
        exceptionalModels.removeIf(armorItem -> {
            ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(armorItem);
            return itemId != null && ProjectBabylonArmors.MODID.equals(itemId.getNamespace());
        });
    }

    private static void clearBakedModels() {
        Map<ResourceLocation, SkinnedMesh> bakedModels = HumanoidModelBakerAccessor.pba$getBakedModels();
        bakedModels.keySet().removeIf(itemId -> itemId != null && ProjectBabylonArmors.MODID.equals(itemId.getNamespace()));
    }
}
