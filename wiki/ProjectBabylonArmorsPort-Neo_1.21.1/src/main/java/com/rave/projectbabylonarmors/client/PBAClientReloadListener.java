package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRendererRegistry;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientReloadListenersEvent;

@EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class PBAClientReloadListener {
    private PBAClientReloadListener() {
    }

    @SubscribeEvent
    public static void registerReloadListeners(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(new ResourceManagerReloadListener() {
            @Override
            public void onResourceManagerReload(ResourceManager resourceManager) {
                PBAGeoArmorRendererRegistry.clearCache();

                if (ModList.get().isLoaded("epicfight") && EpicFightClientCompat.isRegistered()) {
                    EpicFightClientCompat.refreshTransformers();
                }
            }
        });
    }
}
