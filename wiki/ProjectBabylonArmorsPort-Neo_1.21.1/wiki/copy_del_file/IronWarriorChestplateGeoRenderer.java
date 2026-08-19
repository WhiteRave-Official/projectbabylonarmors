package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.IronWarriorArmorGeoModel;
import com.rave.projectbabylonarmors.item.IronWarriorArmor;
import software.bernie.geckolib.cache.object.GeoCube;

public class IronWarriorChestplateGeoRenderer extends IronWarriorGeoArmorRenderer<IronWarriorArmor.Chestplate> {
    public IronWarriorChestplateGeoRenderer() {
        super(new IronWarriorArmorGeoModel<>(
                "geo/iron_warrior_chestplate.geo.json",
                "textures/entities/iron_warrior_chestplate.png"
        ));
    }

    @Override
    public PBAGeoEpicFightArmorTransformer.PartTransformer<GeoCube> getBodyPartTransformer() {
        return PBAGeoEpicFightArmorTransformer.RIGID_CHEST;
    }
}
