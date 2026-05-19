package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yesman.epicfight.api.client.forgeevent.AnimatedArmorTextureEvent;
import yesman.epicfight.api.client.model.transformer.GeoModelTransformer;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class PBAEpicFightGeoArmorTextureHandler {
    private PBAEpicFightGeoArmorTextureHandler() {
    }

    @SubscribeEvent
    public static void onAnimatedArmorTexture(AnimatedArmorTextureEvent event) {
        GeoModelTransformer.getGeoArmorTexturePath(event);
    }
}
