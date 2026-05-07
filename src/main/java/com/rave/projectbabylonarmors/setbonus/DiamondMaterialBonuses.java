package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.combat.ProjectileReflectionHelper;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import io.redspace.ironsspellbooks.entity.spells.AbstractMagicProjectile;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class DiamondMaterialBonuses {
    private static final float DAMAGE_REFLECT_CHANCE = 0.15F;
    private static final float PROJECTILE_REFLECT_CHANCE = 0.25F;
    private static final double REFLECTED_PROJECTILE_SPEED = 1.75D;
    private static final ArmorSetBonus UNYIELDING = new UnyieldingBonus();
    private static final ThreadLocal<Set<UUID>> REFLECTING_ATTACKERS = ThreadLocal.withInitial(HashSet::new);

    private DiamondMaterialBonuses() {
    }

    public static ArmorSetBonus unyielding() {
        return UNYIELDING;
    }

    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class UnyieldingEvents {
        private UnyieldingEvents() {
        }

        @SubscribeEvent
        public static void onLivingAttack(LivingAttackEvent event) {
            LivingEntity defender = event.getEntity();
            if (defender.level().isClientSide()) {
                return;
            }

            if (event.getSource().getDirectEntity() instanceof AbstractMagicProjectile) {
                return;
            }

            LivingEntity attacker = resolveLivingAttacker(event.getSource().getEntity());
            if (attacker == null || attacker == defender) {
                return;
            }

            if (!hasDiamondSet(defender)) {
                return;
            }

            UUID attackerId = attacker.getUUID();
            if (REFLECTING_ATTACKERS.get().contains(attackerId)) {
                return;
            }

            if (defender.getRandom().nextFloat() >= DAMAGE_REFLECT_CHANCE) {
                return;
            }

            event.setCanceled(true);
            REFLECTING_ATTACKERS.get().add(attackerId);
            try {
                float reflectedDamage = event.getAmount();
                defender.level().getServer().execute(() -> applyReflectedDamage(defender, attacker, reflectedDamage));
            } finally {
                REFLECTING_ATTACKERS.get().remove(attackerId);
            }
        }

        @SubscribeEvent
        public static void onProjectileImpact(ProjectileImpactEvent event) {
            if (!(event.getRayTraceResult() instanceof EntityHitResult hitResult)) {
                return;
            }

            if (!(hitResult.getEntity() instanceof LivingEntity defender) || defender.level().isClientSide()) {
                return;
            }

            Projectile projectile = event.getProjectile();
            if (projectile == null) {
                return;
            }

            LivingEntity attacker = resolveLivingAttacker(projectile.getOwner());
            if (attacker == null || attacker == defender) {
                return;
            }

            if (!hasDiamondSet(defender)) {
                return;
            }

            if (defender.getRandom().nextFloat() >= PROJECTILE_REFLECT_CHANCE) {
                return;
            }

            event.setCanceled(true);
            reflectProjectile(projectile, defender, attacker);
        }

        private static boolean hasDiamondSet(LivingEntity entity) {
            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(entity);
            return activeSet != null && activeSet.getId().startsWith("diamond_");
        }

        private static LivingEntity resolveLivingAttacker(Entity entity) {
            return entity instanceof LivingEntity living ? living : null;
        }

        private static void applyReflectedDamage(LivingEntity defender, LivingEntity attacker, float damage) {
            int originalInvulnerableTime = attacker.invulnerableTime;
            attacker.invulnerableTime = 0;
            try {
                attacker.hurt(createReflectDamageSource(defender), damage);
            } finally {
                attacker.invulnerableTime = originalInvulnerableTime;
            }
        }

        private static DamageSource createReflectDamageSource(LivingEntity defender) {
            if (defender instanceof Player player) {
                return defender.damageSources().playerAttack(player);
            }

            return defender.damageSources().mobAttack(defender);
        }

        private static void reflectProjectile(Projectile projectile, LivingEntity reflector, LivingEntity attacker) {
            Entity originalOwner = projectile.getOwner();
            Vec3 origin = reflector.getEyePosition().add(reflector.getLookAngle().scale(0.6D));
            Vec3 direction = attacker.getEyePosition().subtract(origin).normalize();
            Vec3 originalVelocity = projectile.getDeltaMovement();
            double speed = originalVelocity.length();
            if (speed < 0.1D) {
                speed = REFLECTED_PROJECTILE_SPEED;
            }

            ProjectileReflectionHelper.assignReflectedOwner(projectile, originalOwner, reflector);
            projectile.setPos(origin.x, origin.y, origin.z);
            projectile.setDeltaMovement(direction.scale(speed));
            projectile.hurtMarked = true;
            projectile.hasImpulse = true;
        }
    }

    private static final class UnyieldingBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/diamond_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/diamond_material_icon.png"
        );

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.unyielding.name");
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
                    Component.translatable("tooltip.project_babylon_armors.bonus.unyielding.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.unyielding.line2").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
