package com.rave.projectbabylonarmors.client.geo.renderer;

import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.cache.object.GeoCube;

public class PBAConfiguredGeoArmorRenderer<T extends Item & GeoItem> extends PBAGeoArmorRenderer<T> {
    private final PBAGeoArmorSetDefinition.SlotMode slotMode;
    private final PBAGeoArmorSetDefinition.ChestMode chestMode;

    public PBAConfiguredGeoArmorRenderer(String modelPath, String texturePath,
                                         PBAGeoArmorSetDefinition.SlotMode slotMode,
                                         PBAGeoArmorSetDefinition.ChestMode chestMode) {
        super(new com.rave.projectbabylonarmors.client.geo.model.PBAFixedGeoArmorModel<>(modelPath, texturePath));
        this.slotMode = slotMode;
        this.chestMode = chestMode;
    }

    @Override
    protected void remapSlotBones() {
        switch (this.slotMode) {
            case LEGGINGS -> {
                this.rightBoot = null;
                this.leftBoot = null;
            }
            case BOOTS -> {
                this.rightLeg = this.rightBoot;
                this.leftLeg = this.leftBoot;
            }
            default -> {
            }
        }
    }

    @Override
    public PBAGeoEpicFightArmorTransformer.PartTransformer<GeoCube> getBodyPartTransformer() {
        return switch (this.chestMode) {
            case RIGID_CHEST -> PBAGeoEpicFightArmorTransformer.RIGID_CHEST;
            case RIGID_SPLIT_CHEST -> PBAGeoEpicFightArmorTransformer.RIGID_SPLIT_CHEST;
            default -> super.getBodyPartTransformer();
        };
    }
}
