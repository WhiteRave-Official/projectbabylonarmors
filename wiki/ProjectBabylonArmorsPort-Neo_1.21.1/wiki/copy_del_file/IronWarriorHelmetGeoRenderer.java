package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.IronWarriorArmorGeoModel;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;

public class IronWarriorHelmetGeoRenderer extends IronWarriorGeoArmorRenderer<IronWarriorArmor.Helmet> {
    public IronWarriorHelmetGeoRenderer() {
        super(new IronWarriorArmorGeoModel<>(
                "geo/iron_warrior_helmet.geo.json",
                "textures/entities/iron_warrior_helmet.png"
        ));
    }
}
