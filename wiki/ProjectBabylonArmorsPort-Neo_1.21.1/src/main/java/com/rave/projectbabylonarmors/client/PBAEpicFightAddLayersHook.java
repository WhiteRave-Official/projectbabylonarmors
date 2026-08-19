package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRendererRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
