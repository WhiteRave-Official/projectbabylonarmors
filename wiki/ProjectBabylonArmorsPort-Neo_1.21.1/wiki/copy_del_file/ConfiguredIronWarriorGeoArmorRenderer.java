package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.IronWarriorArmorGeoModel;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;
import software.bernie.geckolib.cache.object.GeoCube;

public class ConfiguredIronWarriorGeoArmorRenderer<T extends IronWarriorArmor> extends IronWarriorGeoArmorRenderer<T> {
    private final PBAGeoArmorSetDefinition.SlotMode slotMode;
    private final PBAGeoArmorSetDefinition.ChestMode chestMode;

    public ConfiguredIronWarriorGeoArmorRenderer(String modelPath, String texturePath,
                                                 PBAGeoArmorSetDefinition.SlotMode slotMode,
                                                 PBAGeoArmorSetDefinition.ChestMode chestMode) {
        super(new IronWarriorArmorGeoModel<>(modelPath, texturePath));
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
