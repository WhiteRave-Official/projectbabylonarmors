package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.item.IronWarriorArmor;
import software.bernie.geckolib.model.GeoModel;

public abstract class IronWarriorGeoArmorRenderer<T extends IronWarriorArmor> extends PBAGeoArmorRenderer<T> {
    protected IronWarriorGeoArmorRenderer(GeoModel<T> model) {
        super(model);
    }
}
