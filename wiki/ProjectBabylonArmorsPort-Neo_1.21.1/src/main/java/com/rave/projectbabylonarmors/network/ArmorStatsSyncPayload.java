package com.rave.projectbabylonarmors.network;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

/**
 * Syncs the datapack armor-stat overrides to clients as a single JSON document,
 * so client-side tooltips match what the server actually applies.
 */
public record ArmorStatsSyncPayload(String statsJson) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<ArmorStatsSyncPayload> TYPE =
            new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "armor_stats_sync"));

    public static final StreamCodec<RegistryFriendlyByteBuf, ArmorStatsSyncPayload> STREAM_CODEC =
            StreamCodec.composite(ByteBufCodecs.STRING_UTF8, ArmorStatsSyncPayload::statsJson, ArmorStatsSyncPayload::new);

    @Override
    public CustomPacketPayload.Type<ArmorStatsSyncPayload> type() {
        return TYPE;
    }
}
