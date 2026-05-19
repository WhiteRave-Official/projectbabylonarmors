package com.rave.projectbabylonarmors.client.geo.renderer;

import software.bernie.geckolib.cache.object.GeoCube;
import software.bernie.geckolib.cache.object.GeoBone;

public interface PBAGeoArmorBoneBridge {
    default void prepareForEpicFightBake() {
    }

    default PBAGeoEpicFightArmorTransformer.PartTransformer<GeoCube> getBodyPartTransformer() {
        return PBAGeoEpicFightArmorTransformer.CHEST;
    }

    GeoBone getHeadBone();

    GeoBone getBodyBone();

    GeoBone getRightArmBone();

    GeoBone getLeftArmBone();

    GeoBone getRightLegBone();

    GeoBone getLeftLegBone();

    GeoBone getRightBootBone();

    GeoBone getLeftBootBone();
}
