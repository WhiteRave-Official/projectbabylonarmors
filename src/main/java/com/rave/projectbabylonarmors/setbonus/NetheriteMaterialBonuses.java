package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.combat.MagicArmorCalculationHelper;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class NetheriteMaterialBonuses {
    private static final double AURA_RADIUS = 2.0D;
    private static final int RING_DURATION_TICKS = 40;
    private static final int RING_APPLICATION_INTERVAL = 10;
    private static final int PARTICLE_INTERVAL = 5;
    private static final float RING_TRIGGER_CHANCE = 0.10F;
    private static final float BONUS_DAMAGE_MULTIPLIER = 1.15F;
    private static final float RING_FIRE_DAMAGE = 2.0F;
    private static final int BURN_DURATION_SECONDS = 5;
    private static final int RING_POINTS = 20;
    private static final UUID KNOCKBACK_IMMUNITY_UUID = UUID.nameUUIDFromBytes("netherite_material.knockback_immunity".getBytes(StandardCharsets.UTF_8));
    private static final String KNOCKBACK_IMMUNITY_NAME = "project_babylon_armors.netherite_material_knockback_immunity";
    private static final Map<UUID, Integer> ACTIVE_FIRE_RINGS = new ConcurrentHashMap<>();
    private static final ArmorSetBonus ABYSS = new AbyssBonus();

    private NetheriteMaterialBonuses() {
    }

    public static ArmorSetBonus abyss() {
        return ABYSS;
    }

    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class AbyssEvents {
        private AbyssEvents() {
        }

        @SubscribeEvent
        public static void onLivingAttack(LivingAttackEvent event) {
            LivingEntity entity = event.getEntity();
            if (entity.level().isClientSide() || !hasNetheriteSet(entity)) {
                return;
            }

            if (event.getSource().is(DamageTypeTags.IS_FIRE) || event.getSource().is(DamageTypes.LAVA)) {
                entity.clearFire();
                event.setCanceled(true);
            }
        }

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.isCanceled() || event.getAmount() <= 0.0F || event.getEntity().level().isClientSide()) {
                return;
            }

            LivingEntity target = event.getEntity();
            if (hasNetheriteSet(target) && target.getRandom().nextFloat() < RING_TRIGGER_CHANCE) {
                ACTIVE_FIRE_RINGS.put(target.getUUID(), target.tickCount + RING_DURATION_TICKS);
            }

            if (target.isOnFire() && event.getSource().getEntity() instanceof LivingEntity attacker && hasNetheriteSet(attacker)) {
                event.setAmount(event.getAmount() * BONUS_DAMAGE_MULTIPLIER);
            }
        }

        @SubscribeEvent
        public static void onLivingTick(LivingEvent.LivingTickEvent event) {
            LivingEntity wearer = event.getEntity();
            if (wearer.level().isClientSide()) {
                return;
            }

            if (hasNetheriteSet(wearer)) {
                wearer.clearFire();
            }

            Integer ringEndTick = ACTIVE_FIRE_RINGS.get(wearer.getUUID());
            if (ringEndTick == null) {
                return;
            }

            if (!hasNetheriteSet(wearer) || wearer.tickCount > ringEndTick) {
                ACTIVE_FIRE_RINGS.remove(wearer.getUUID());
                return;
            }

            if (wearer.tickCount % PARTICLE_INTERVAL == 0) {
                spawnRingParticles(wearer);
            }

            if (wearer.tickCount % RING_APPLICATION_INTERVAL == 0) {
                applyFireRing(wearer);
            }
        }

        private static boolean hasNetheriteSet(LivingEntity entity) {
            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(entity);
            return activeSet != null && activeSet.getId().startsWith("netherite_");
        }

        private static void applyFireRing(LivingEntity wearer) {
            AABB area = wearer.getBoundingBox().inflate(AURA_RADIUS, 0.75D, AURA_RADIUS);
            List<LivingEntity> nearby = wearer.level().getEntitiesOfClass(LivingEntity.class, area,
                    target -> isValidRingTarget(wearer, target));

            for (LivingEntity target : nearby) {
                float adjustedDamage = MagicArmorCalculationHelper.applyAdjustedMagicDamage(target, RING_FIRE_DAMAGE);
                if (adjustedDamage > 0.0F) {
                    int originalInvulnerableTime = target.invulnerableTime;
                    target.invulnerableTime = 0;
                    try {
                        target.hurt(wearer.damageSources().magic(), adjustedDamage);
                    } finally {
                        target.invulnerableTime = originalInvulnerableTime;
                    }
                }
                target.setSecondsOnFire(BURN_DURATION_SECONDS);
            }
        }

        private static boolean isValidRingTarget(LivingEntity wearer, LivingEntity target) {
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

        private static void spawnRingParticles(LivingEntity wearer) {
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
                serverLevel.sendParticles(ParticleTypes.FLAME, x, centerY, z, 2, 0.01D, 0.02D, 0.01D, 0.0D);
                serverLevel.sendParticles(ParticleTypes.SMOKE, x, centerY + 0.02D, z, 1, 0.01D, 0.01D, 0.01D, 0.0D);
            }

            Vec3 center = new Vec3(centerX, centerY, centerZ);
            serverLevel.sendParticles(ParticleTypes.FLAME, center.x, center.y, center.z, 8, 0.2D, 0.02D, 0.2D, 0.0D);
            serverLevel.sendParticles(ParticleTypes.LAVA, center.x, center.y + 0.02D, center.z, 4, 0.15D, 0.02D, 0.15D, 0.0D);
            serverLevel.sendParticles(ParticleTypes.SMOKE, center.x, center.y + 0.03D, center.z, 6, 0.18D, 0.02D, 0.18D, 0.0D);
        }
    }

    private static final class AbyssBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/netherite_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/netherite_material_icon.png"
        );

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.abyss.name");
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
            var attribute = entity.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
            if (attribute == null || attribute.getModifier(KNOCKBACK_IMMUNITY_UUID) != null) {
                return;
            }

            attribute.addTransientModifier(new AttributeModifier(
                    KNOCKBACK_IMMUNITY_UUID,
                    KNOCKBACK_IMMUNITY_NAME,
                    1.0D,
                    AttributeModifier.Operation.ADDITION
            ));
        }

        @Override
        public void remove(LivingEntity entity) {
            var attribute = entity.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
            if (attribute != null && attribute.getModifier(KNOCKBACK_IMMUNITY_UUID) != null) {
                attribute.removeModifier(KNOCKBACK_IMMUNITY_UUID);
            }
            ACTIVE_FIRE_RINGS.remove(entity.getUUID());
        }

        @Override
        public boolean isApplied(LivingEntity entity) {
            var attribute = entity.getAttribute(Attributes.KNOCKBACK_RESISTANCE);
            return attribute != null && attribute.getModifier(KNOCKBACK_IMMUNITY_UUID) != null;
        }

        @Override
        public List<Component> getTooltipLines() {
            return List.of(
                    Component.translatable("tooltip.project_babylon_armors.bonus.abyss.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.abyss.line2").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.abyss.line3").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
