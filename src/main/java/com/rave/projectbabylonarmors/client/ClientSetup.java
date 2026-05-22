package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorSets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    private static final String EPIC_FIGHT_COMPAT_CLASS = "com.rave.projectbabylonarmors.client.compat.epicfight.EpicFightClientCompat";

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            PBAGeoArmorSets.registerAll();

            if (!ModList.get().isLoaded("epicfight")) {
                return;
            }

            try {
                Class<?> compatClass = Class.forName(EPIC_FIGHT_COMPAT_CLASS);
                compatClass.getMethod("register").invoke(null);
                ProjectBabylonArmors.LOGGER.info("Epic Fight compatibility initialized for Project Babylon Armors.");
            } catch (ReflectiveOperationException exception) {
                ProjectBabylonArmors.LOGGER.error("Failed to initialize Epic Fight compatibility for Project Babylon Armors.", exception);
            }
        });
    }
}


