package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRendererRegistry;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
