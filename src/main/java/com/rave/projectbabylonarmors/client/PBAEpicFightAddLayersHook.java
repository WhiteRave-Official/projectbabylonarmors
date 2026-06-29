package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRendererRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class PBAEpicFightAddLayersHook {
    private PBAEpicFightAddLayersHook() {
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAddLayers(EntityRenderersEvent.AddLayers event) {
        if (!ModList.get().isLoaded("epicfight")) {
            return;
        }

        PBAGeoArmorRendererRegistry.clearCache();
        EpicFightClientCompat.refreshTransformers();
    }
}
