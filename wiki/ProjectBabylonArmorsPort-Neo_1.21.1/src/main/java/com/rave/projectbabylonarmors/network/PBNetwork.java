package com.rave.projectbabylonarmors.network;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.config.PBArmorStats;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.slf4j.Logger;

@EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class PBNetwork {
    private static final Logger LOGGER = LogUtils.getLogger();

    private PBNetwork() {
    }

    @SubscribeEvent
    public static void onRegisterPayloads(RegisterPayloadHandlersEvent event) {
        // optional(): a client with this build can still join servers that don't expose the
        // channel (older mod build); it just won't receive datapack stat overrides there.
        PayloadRegistrar registrar = event.registrar("1").optional();
        registrar.playToClient(ArmorStatsSyncPayload.TYPE, ArmorStatsSyncPayload.STREAM_CODEC, (payload, context) -> {
            try {
                JsonObject root = JsonParser.parseString(payload.statsJson()).getAsJsonObject();
                PBArmorStats.setRuntimeOverridesFromJson(root);
            } catch (RuntimeException exception) {
                LOGGER.error("Received malformed armor stats sync payload", exception);
            }
        });
    }
}
