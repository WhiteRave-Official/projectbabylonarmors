package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.IronWarriorArmorGeoModel;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;

public class IronWarriorLeggingsGeoRenderer extends IronWarriorGeoArmorRenderer<IronWarriorArmor.Leggings> {
    public IronWarriorLeggingsGeoRenderer() {
        super(new IronWarriorArmorGeoModel<>(
                "geo/iron_warrior_leggings.geo.json",
                "textures/entities/iron_warrior_leggings.png"
        ));
    }

    @Override
    protected void remapSlotBones() {
        this.rightBoot = null;
        this.leftBoot = null;
    }
}
