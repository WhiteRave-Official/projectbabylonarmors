package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.IronWarriorArmorGeoModel;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;

public class IronWarriorBootsGeoRenderer extends IronWarriorGeoArmorRenderer<IronWarriorArmor.Boots> {
    public IronWarriorBootsGeoRenderer() {
        super(new IronWarriorArmorGeoModel<>(
                "geo/iron_warrior_boots.geo.json",
                "textures/entities/iron_warrior_boots.png"
        ));
    }

    @Override
    protected void remapSlotBones() {
        this.rightLeg = this.rightBoot;
        this.leftLeg = this.leftBoot;
    }
}
