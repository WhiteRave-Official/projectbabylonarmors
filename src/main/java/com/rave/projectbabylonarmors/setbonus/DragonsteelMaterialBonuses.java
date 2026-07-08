package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.init.PBArmorEffects;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.network.PBNetwork;
import com.rave.projectbabylonmaterials.network.client.ClientboundArmorPhotonEffectPacket;
import com.rave.projectbabylonmaterials.network.client.ClientboundDragonsteelCooldownPacket;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.PacketDistributor;

import java.util.List;

public final class DragonsteelMaterialBonuses {
    private static final float REBIRTH_HEAL_RATIO = 0.33F;
    private static final float REBIRTH_COOLDOWN_DAMAGE_DEALT_MULTIPLIER = 1.12F;
    private static final float REBIRTH_COOLDOWN_DAMAGE_TAKEN_MULTIPLIER = 0.88F;
    private static final int REBIRTH_COOLDOWN_TICKS = 12000;
    private static final int TELEPORT_ATTEMPTS = 16;
    private static final double TELEPORT_HORIZONTAL_RANGE = 8.0D;
    private static final double TELEPORT_VERTICAL_RANGE = 8.0D;
    private static final int ENDER_WAVE_POINTS = 24;
    private static final double ENDER_WAVE_RADIUS = 2.4D;
    private static final String REBIRTH_TRIGGER_TICK_TAG = "project_babylon_armors.rebirth_trigger_tick";
    private static final String REBIRTH_COOLDOWN_UNTIL_TAG = "project_babylon_armors.rebirth_cooldown_until";
    private static final ArmorSetBonus REBIRTH = new RebirthBonus();

    private DragonsteelMaterialBonuses() {
    }

    public static ArmorSetBonus rebirth() {
        return REBIRTH;
    }

    public static void resetRebirthCooldown(LivingEntity entity) {
        entity.removeEffect(PBArmorEffects.REBIRTH_COOLDOWN.get());
        entity.getPersistentData().remove(REBIRTH_TRIGGER_TICK_TAG);
        entity.getPersistentData().remove(REBIRTH_COOLDOWN_UNTIL_TAG);
        RebirthEvents.syncPlayerCooldown(entity);
    }

    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class RebirthEvents {
        private RebirthEvents() {
        }

        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void onLivingHurt(LivingHurtEvent event) {
            LivingEntity entity = event.getEntity();
            if (event.isCanceled() || entity.level().isClientSide() || event.getAmount() <= 0.0F) {
                return;
            }

            float adjustedAmount = event.getAmount();
            if (hasDragonsteelSet(entity) && isOnCooldown(entity)) {
                adjustedAmount *= REBIRTH_COOLDOWN_DAMAGE_TAKEN_MULTIPLIER;
            }

            if (event.getSource().getEntity() instanceof LivingEntity attacker
                    && attacker != entity
                    && hasDragonsteelSet(attacker)
                    && isOnCooldown(attacker)) {
                adjustedAmount *= REBIRTH_COOLDOWN_DAMAGE_DEALT_MULTIPLIER;
            }

            if (adjustedAmount != event.getAmount()) {
                event.setAmount(adjustedAmount);
            }

            if (!hasDragonsteelSet(entity) || isOnCooldown(entity)
                    || event.getSource().is(DamageTypeTags.BYPASSES_INVULNERABILITY)
                    || event.getAmount() < entity.getHealth()) {
                return;
            }

            triggerRebirth(entity);
            event.setAmount(0.0F);
            event.setCanceled(true);
        }

        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void onLivingDeath(LivingDeathEvent event) {
            LivingEntity entity = event.getEntity();
            if (event.isCanceled() || entity.level().isClientSide()) {
                return;
            }

            if (!hasDragonsteelSet(entity)) {
                return;
            }

            if (hasPendingRebirthThisTick(entity)) {
                reviveDeathState(entity);
                event.setCanceled(true);
                return;
            }

            if (isOnCooldown(entity) || event.getSource().is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
                return;
            }

            triggerRebirth(entity);
            reviveDeathState(entity);
            event.setCanceled(true);
        }
        @SubscribeEvent
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if (event.phase != TickEvent.Phase.END || event.player.level().isClientSide()) {
                return;
            }

            if (event.player.tickCount % 10 == 0) {
                syncPlayerCooldown(event.player);
            }
        }
        private static boolean hasDragonsteelSet(LivingEntity entity) {

            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(entity);
            return activeSet != null && activeSet.getId().startsWith("dragonsteel_");
        }

        private static boolean isOnCooldown(LivingEntity entity) {
            long cooldownUntil = getCooldownUntil(entity);
            long gameTime = getGameTime(entity);
            return cooldownUntil > 0L && gameTime >= 0L && gameTime < cooldownUntil;
        }

        private static boolean hasPendingRebirthThisTick(LivingEntity entity) {
            if (!(entity.level() instanceof ServerLevel serverLevel)) {
                return false;
            }

            CompoundTag data = entity.getPersistentData();
            return data.contains(REBIRTH_TRIGGER_TICK_TAG) && data.getLong(REBIRTH_TRIGGER_TICK_TAG) == serverLevel.getGameTime();
        }

        private static void markRebirthTriggered(LivingEntity entity) {
            if (entity.level() instanceof ServerLevel serverLevel) {
                entity.getPersistentData().putLong(REBIRTH_TRIGGER_TICK_TAG, serverLevel.getGameTime());
            }
        }

        private static void markCooldown(LivingEntity entity) {
            if (entity.level() instanceof ServerLevel serverLevel) {
                entity.getPersistentData().putLong(REBIRTH_COOLDOWN_UNTIL_TAG, serverLevel.getGameTime() + REBIRTH_COOLDOWN_TICKS);
            }
        }

        private static void triggerRebirth(LivingEntity entity) {
            markRebirthTriggered(entity);
            markCooldown(entity);
            syncPlayerCooldown(entity);
            if (!(entity instanceof Player)) {
                entity.addEffect(new MobEffectInstance(PBArmorEffects.REBIRTH_COOLDOWN.get(), REBIRTH_COOLDOWN_TICKS, 0, false, true, true));
            }

            float healAmount = Math.max(1.0F, (float) entity.getMaxHealth() * REBIRTH_HEAL_RATIO);
            entity.setHealth(Math.min(entity.getMaxHealth(), healAmount));
            entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            entity.clearFire();

            if (entity.isPassenger()) {
                entity.stopRiding();
            }

            boolean teleported = tryChorusTeleport(entity);
            playRebirthAnimationIfAvailable(entity);
            spawnRebirthEffects(entity, teleported);
        }

        private static void reviveDeathState(LivingEntity entity) {
            entity.deathTime = 0;
            entity.hurtTime = 0;
            entity.hurtDuration = 0;
        }

        private static boolean tryChorusTeleport(LivingEntity entity) {
            double originX = entity.getX();
            double originY = entity.getY();
            double originZ = entity.getZ();

            for (int i = 0; i < TELEPORT_ATTEMPTS; i++) {
                double targetX = entity.getX() + (entity.getRandom().nextDouble() - 0.5D) * TELEPORT_HORIZONTAL_RANGE * 2.0D;
                double targetY = Mth.clamp(
                        entity.getY() + (double) (entity.getRandom().nextInt((int) (TELEPORT_VERTICAL_RANGE * 2.0D + 1)) - TELEPORT_VERTICAL_RANGE),
                        entity.level().getMinBuildHeight(),
                        entity.level().getMinBuildHeight() + ((ServerLevel) entity.level()).getLogicalHeight() - 1
                );
                double targetZ = entity.getZ() + (entity.getRandom().nextDouble() - 0.5D) * TELEPORT_HORIZONTAL_RANGE * 2.0D;

                if (entity.randomTeleport(targetX, targetY, targetZ, true)) {
                    entity.fallDistance = 0.0F;
                    entity.level().gameEvent(GameEvent.TELEPORT, new Vec3(originX, originY, originZ), GameEvent.Context.of(entity));
                    entity.level().playSound(null, originX, originY, originZ, SoundEvents.CHORUS_FRUIT_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
                    entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.CHORUS_FRUIT_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
                    return true;
                }
            }

            return false;
        }

        private static boolean playRebirthAnimationIfAvailable(LivingEntity entity) {
            if (!ModList.get().isLoaded("project_babylon_weapons")) {
                return false;
            }

            try {
                Class<?> rebirthSkillClass = Class.forName("com.rave.projectbabylonweapons.skill.weapon_innate.RebirthSkill");
                java.lang.reflect.Method triggerMethod = rebirthSkillClass.getMethod("triggerPassiveRebirth", LivingEntity.class);
                Object result = triggerMethod.invoke(null, entity);
                if (result instanceof Boolean triggered && triggered) {
                    return true;
                }
            } catch (ReflectiveOperationException ignored) {
            }

            try {
                Class<?> capabilitiesClass = Class.forName("yesman.epicfight.world.capabilities.EpicFightCapabilities");
                Class<?> patchClass = Class.forName("yesman.epicfight.world.capabilities.entitypatch.LivingEntityPatch");
                java.lang.reflect.Method getPatchMethod = capabilitiesClass.getMethod("getEntityPatch", net.minecraft.world.entity.Entity.class, Class.class);
                Object patch = getPatchMethod.invoke(null, entity, patchClass);
                if (patch == null) {
                    return false;
                }

                Class<?> animationsClass = Class.forName("com.rave.projectbabylonweapons.gameasset.PBAnimations");
                java.lang.reflect.Field rebirthField = animationsClass.getField("REBIRTH");
                Object rebirthAnimation = rebirthField.get(null);
                if (rebirthAnimation == null) {
                    return false;
                }

                for (java.lang.reflect.Method method : patch.getClass().getMethods()) {
                    if (method.getName().equals("playAnimationSynchronized") && method.getParameterCount() == 2) {
                        method.invoke(patch, rebirthAnimation, 0.0F);
                        return true;
                    }
                }
            } catch (ReflectiveOperationException ignored) {
            }

            return false;
        }

        private static void spawnRebirthEffects(LivingEntity entity, boolean teleported) {
            if (!(entity.level() instanceof ServerLevel serverLevel)) {
                return;
            }

            double centerX = entity.getX();
            double centerY = entity.getY() + 0.85D;
            double centerZ = entity.getZ();

            PBNetwork.CHANNEL.send(
                    PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> entity),
                    new ClientboundArmorPhotonEffectPacket(entity.getId(), ClientboundArmorPhotonEffectPacket.DRAGONSTEEL_REBIRTH, true, (float) ENDER_WAVE_RADIUS)
            );
            serverLevel.playSound(null, centerX, entity.getY(), centerZ, SoundEvents.ENDER_DRAGON_GROWL, SoundSource.PLAYERS, 1.0F, 1.0F);
            if (teleported) {
                serverLevel.playSound(null, centerX, entity.getY(), centerZ, SoundEvents.CHORUS_FRUIT_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
            }
        }

        private static long getTriggerTick(LivingEntity entity) {
            return entity.getPersistentData().contains(REBIRTH_TRIGGER_TICK_TAG) ? entity.getPersistentData().getLong(REBIRTH_TRIGGER_TICK_TAG) : -1L;
        }

        private static int getRemainingCooldownTicks(LivingEntity entity) {
            long cooldownUntil = getCooldownUntil(entity);
            long gameTime = getGameTime(entity);
            if (cooldownUntil <= 0L || gameTime < 0L || gameTime >= cooldownUntil) {
                return 0;
            }
            return (int) Math.min(Integer.MAX_VALUE, cooldownUntil - gameTime);
        }

        private static void syncPlayerCooldown(LivingEntity entity) {
            if (entity instanceof ServerPlayer serverPlayer) {
                PBNetwork.CHANNEL.send(
                        PacketDistributor.PLAYER.with(() -> serverPlayer),
                        new ClientboundDragonsteelCooldownPacket(getRemainingCooldownTicks(entity))
                );
            }
        }

        private static long getCooldownUntil(LivingEntity entity) {
            return entity.getPersistentData().contains(REBIRTH_COOLDOWN_UNTIL_TAG) ? entity.getPersistentData().getLong(REBIRTH_COOLDOWN_UNTIL_TAG) : -1L;
        }

        private static long getGameTime(LivingEntity entity) {
            return entity.level() instanceof ServerLevel serverLevel ? serverLevel.getGameTime() : -1L;
        }
    }

    private static final class RebirthBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/dragonsteel_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/dragonsteel_material_icon.png"
        );

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.rebirth.name");
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
                    Component.translatable("tooltip.project_babylon_armors.bonus.rebirth.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.rebirth.line2").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.rebirth.line3").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
