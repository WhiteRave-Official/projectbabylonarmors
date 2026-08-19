package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import io.redspace.ironsspellbooks.util.ParticleHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class IceMaterialBonuses {
    private static final double AURA_RADIUS = 2.0D;
    private static final int CHILLED_DURATION_TICKS = 40;
    private static final int CHILLED_AMPLIFIER = 0;
    private static final int AURA_APPLICATION_INTERVAL = 10;
    private static final int PARTICLE_INTERVAL = 15;
    private static final float DURATION_REDUCTION_MULTIPLIER = 0.70F;
    private static final int RING_POINTS = 18;
    private static final ResourceLocation CHILLED_EFFECT_ID = ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "chilled");
    private static final ResourceLocation SLOWED_EFFECT_ID = ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "slowed");
    private static final ResourceLocation SLOWNESS_EFFECT_ID = ResourceLocation.fromNamespaceAndPath("minecraft", "slowness");
    private static final ResourceLocation FROZEN_EFFECT_ID = ResourceLocation.fromNamespaceAndPath("project_babylon_weapons", "frozen_debuff");
    private static final Set<String> ACTIVE_DURATION_ADJUSTMENTS = ConcurrentHashMap.newKeySet();
    private static final ArmorSetBonus ICY_VISAGE = new IcyVisageBonus();

    private IceMaterialBonuses() {
    }

    public static ArmorSetBonus icyVisage() {
        return ICY_VISAGE;
    }

    @EventBusSubscriber(modid = ProjectBabylonArmors.MODID)
    public static final class IcyVisageEvents {
        private IcyVisageEvents() {
        }

        @SubscribeEvent
        public static void onLivingTick(EntityTickEvent.Post event) {
            if (!(event.getEntity() instanceof LivingEntity wearer)) {
                return;
            }

            if (wearer.level().isClientSide() || !hasIceSet(wearer)) {
                return;
            }

            if (wearer.tickCount % PARTICLE_INTERVAL == 0) {
                spawnAuraParticles(wearer);
            }

            if (wearer.tickCount % AURA_APPLICATION_INTERVAL == 0) {
                applyChilledAura(wearer);
            }
        }

        @SubscribeEvent
        public static void onEffectAdded(MobEffectEvent.Added event) {
            LivingEntity entity = event.getEntity();
            if (entity.level().isClientSide() || !hasIceSet(entity)) {
                return;
            }

            MobEffectInstance effectInstance = event.getEffectInstance();
            if (effectInstance == null || !isReducibleEffect(effectInstance.getEffect())) {
                return;
            }

            ResourceLocation effectId = BuiltInRegistries.MOB_EFFECT.getKey(effectInstance.getEffect().value());
            if (effectId == null) {
                return;
            }

            String adjustmentKey = entity.getUUID() + "|" + effectId;
            if (!ACTIVE_DURATION_ADJUSTMENTS.add(adjustmentKey)) {
                return;
            }

            entity.level().getServer().execute(() -> {
                try {
                    MobEffectInstance current = entity.getEffect(effectInstance.getEffect());
                    if (current == null) {
                        return;
                    }

                    int originalDuration = current.getDuration();
                    int adjustedDuration = Math.max(1, Math.round(originalDuration * DURATION_REDUCTION_MULTIPLIER));
                    if (adjustedDuration >= originalDuration) {
                        return;
                    }

                    entity.removeEffect(effectInstance.getEffect());
                    entity.addEffect(new MobEffectInstance(
                            effectInstance.getEffect(),
                            adjustedDuration,
                            current.getAmplifier(),
                            current.isAmbient(),
                            current.isVisible(),
                            current.showIcon()
                    ));
                } finally {
                    ACTIVE_DURATION_ADJUSTMENTS.remove(adjustmentKey);
                }
            });
        }

        private static boolean hasIceSet(LivingEntity entity) {
            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(entity);
            return activeSet != null && activeSet.getId().startsWith("ice_");
        }

        private static void applyChilledAura(LivingEntity wearer) {
            Holder<MobEffect> chilledEffect = BuiltInRegistries.MOB_EFFECT.getHolder(CHILLED_EFFECT_ID).orElse(null);
            if (chilledEffect == null) {
                return;
            }

            AABB area = wearer.getBoundingBox().inflate(AURA_RADIUS, 0.75D, AURA_RADIUS);
            List<LivingEntity> nearby = wearer.level().getEntitiesOfClass(LivingEntity.class, area,
                    target -> isValidAuraTarget(wearer, target));

            for (LivingEntity target : nearby) {
                target.addEffect(new MobEffectInstance(chilledEffect, CHILLED_DURATION_TICKS, CHILLED_AMPLIFIER, false, true, true), wearer);
            }
        }

        private static boolean isValidAuraTarget(LivingEntity wearer, LivingEntity target) {
            if (target == wearer || !target.isAlive() || wearer.isAlliedTo(target)) {
                return false;
            }

            if (wearer instanceof Player) {
                return !(target instanceof Player other) || !other.isSpectator();
            }

            if (wearer instanceof Mob mob) {
                LivingEntity currentTarget = mob.getTarget();
                LivingEntity revengeTarget = mob.getLastHurtByMob();
                return target == currentTarget || target == revengeTarget || target.getLastHurtByMob() == wearer || target instanceof Player;
            }

            return true;
        }

        private static boolean isReducibleEffect(Holder<MobEffect> effect) {
            ResourceLocation effectId = BuiltInRegistries.MOB_EFFECT.getKey(effect.value());
            return CHILLED_EFFECT_ID.equals(effectId)
                    || SLOWED_EFFECT_ID.equals(effectId)
                    || SLOWNESS_EFFECT_ID.equals(effectId)
                    || FROZEN_EFFECT_ID.equals(effectId);
        }

        private static void spawnAuraParticles(LivingEntity wearer) {
            if (!(wearer.level() instanceof ServerLevel serverLevel)) {
                return;
            }

            double centerX = wearer.getX();
            double centerY = wearer.getY() + 0.05D;
            double centerZ = wearer.getZ();

            for (int i = 0; i < RING_POINTS; i++) {
                double angle = (Math.PI * 2.0D * i) / RING_POINTS;
                double x = centerX + Math.cos(angle) * AURA_RADIUS;
                double z = centerZ + Math.sin(angle) * AURA_RADIUS;
                serverLevel.sendParticles(ParticleHelper.SNOWFLAKE, x, centerY, z, 1, 0.03D, 0.01D, 0.03D, 0.0D);
                serverLevel.sendParticles(ParticleHelper.SNOW_DUST, x, centerY, z, 1, 0.02D, 0.005D, 0.02D, 0.0D);
            }

            Vec3 center = new Vec3(centerX, centerY, centerZ);
            serverLevel.sendParticles(ParticleHelper.SNOW_DUST, center.x, center.y, center.z, 6, 0.2D, 0.01D, 0.2D, 0.0D);
        }
    }

    private static final class IcyVisageBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/ice_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/ice_material_icon.png"
        );

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.icy_visage.name");
        }

        @Override
        public ResourceLocation getFrameTexture() {
            return FRAME_TEXTURE;
        }

        @Override
        public ResourceLocation getIconTexture() {
            return ICON_TEXTURE;
        }

        @Override
        public void apply(LivingEntity entity) {
        }

        @Override
        public void remove(LivingEntity entity) {
        }

        @Override
        public boolean isApplied(LivingEntity entity) {
            return true;
        }

        @Override
        public List<Component> getTooltipLines() {
            return List.of(
                    Component.translatable("tooltip.project_babylon_armors.bonus.icy_visage.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.icy_visage.line2").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
