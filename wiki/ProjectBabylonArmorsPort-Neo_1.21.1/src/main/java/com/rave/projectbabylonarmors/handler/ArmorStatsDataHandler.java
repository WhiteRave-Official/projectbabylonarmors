package com.rave.projectbabylonarmors.handler;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.config.PBArmorStats;
import com.rave.projectbabylonarmors.network.ArmorStatsSyncPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * Loads armor stat overrides from datapacks (data/project_babylon_armors/armor_stats/<set>.json)
 * and keeps players in sync: overrides apply on world load and on /reload without a restart,
 * and worn armor attribute modifiers are refreshed in place.
 */
@EventBusSubscriber(modid = ProjectBabylonArmors.MODID)
public final class ArmorStatsDataHandler {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = new Gson();

    /** Last loaded overrides document, kept for syncing to newly joining players. */
    private static volatile JsonObject currentOverrides = new JsonObject();

    private ArmorStatsDataHandler() {
    }

    @SubscribeEvent
    public static void onAddReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new StatsReloadListener());
    }

    @SubscribeEvent
    public static void onDatapackSync(OnDatapackSyncEvent event) {
        List<ServerPlayer> players = event.getPlayer() != null
                ? List.of(event.getPlayer())
                : event.getPlayerList().getPlayers();

        ArmorStatsSyncPayload payload = new ArmorStatsSyncPayload(GSON.toJson(currentOverrides));
        for (ServerPlayer player : players) {
            PacketDistributor.sendToPlayer(player, payload);
            refreshWornArmor(player);
        }
    }

    /**
     * Re-applies the attribute modifiers of currently worn armor so stat changes take
     * effect immediately after /reload, without requiring a re-equip.
     */
    private static void refreshWornArmor(ServerPlayer player) {
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) {
                continue;
            }

            ItemStack stack = player.getItemBySlot(slot);
            if (stack.isEmpty()) {
                continue;
            }

            stack.forEachModifier(slot, (attribute, modifier) -> {
                AttributeInstance instance = player.getAttributes().getInstance(attribute);
                if (instance != null && instance.hasModifier(modifier.id())) {
                    instance.removeModifier(modifier.id());
                    instance.addTransientModifier(modifier);
                }
            });
        }
    }

    private static final class StatsReloadListener extends SimpleJsonResourceReloadListener {
        private StatsReloadListener() {
            super(GSON, "armor_stats");
        }

        @Override
        protected void apply(Map<ResourceLocation, JsonElement> files, ResourceManager resourceManager, ProfilerFiller profiler) {
            JsonObject root = new JsonObject();
            for (Map.Entry<ResourceLocation, JsonElement> entry : files.entrySet()) {
                if (!ProjectBabylonArmors.MODID.equals(entry.getKey().getNamespace())) {
                    continue;
                }
                if (!entry.getValue().isJsonObject()) {
                    LOGGER.warn("Skipping non-object armor stats file {}", entry.getKey());
                    continue;
                }
                root.add(entry.getKey().getPath(), entry.getValue().getAsJsonObject());
            }

            currentOverrides = root;
            PBArmorStats.setRuntimeOverridesFromJson(root);
        }
    }
}
