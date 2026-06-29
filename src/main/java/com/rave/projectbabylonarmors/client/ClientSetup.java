package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorSets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            PBAGeoArmorSets.registerAll();

            if (!ModList.get().isLoaded("epicfight")) {
                return;
            }

            EpicFightClientCompat.register();
            ProjectBabylonArmors.LOGGER.info("Epic Fight compatibility initialized for Project Babylon Armors.");
        });
    }
}