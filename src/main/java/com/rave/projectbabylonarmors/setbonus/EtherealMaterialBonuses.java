package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.combat.ArmorCalculationHelper;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class EtherealMaterialBonuses {
    private static final float DEBUFF_DURATION_MULTIPLIER = 0.67F;
    private static final float ENLIGHTENED_PROC_CHANCE = 0.50F;
    private static final float MAGIC_TO_HEAL_RATIO = 0.15F;
    private static final Set<String> ACTIVE_DURATION_ADJUSTMENTS = ConcurrentHashMap.newKeySet();
    private static final ArmorSetBonus ENLIGHTENED = new EnlightenedBonus();

    private EtherealMaterialBonuses() {
    }

    public static ArmorSetBonus enlightened() {
        return ENLIGHTENED;
    }

    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class EnlightenedEvents {
        private EnlightenedEvents() {
        }

        @SubscribeEvent
        public static void onEffectAdded(MobEffectEvent.Added event) {
            LivingEntity entity = event.getEntity();
            if (entity.level().isClientSide() || !hasEtherealSet(entity)) {
                return;
            }

            MobEffectInstance effectInstance = event.getEffectInstance();
            if (effectInstance == null || !isReducibleDebuff(effectInstance.getEffect())) {
                return;
            }

            ResourceLocation effectId = ForgeRegistries.MOB_EFFECTS.getKey(effectInstance.getEffect());
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
                    int adjustedDuration = Math.max(1, Math.round(originalDuration * DEBUFF_DURATION_MULTIPLIER));
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

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.isCanceled() || event.getAmount() <= 0.0F || event.getEntity().level().isClientSide()) {
                return;
            }

            DamageSource source = event.getSource();
            if (!isMagicDamage(source)) {
                return;
            }

            LivingEntity target = event.getEntity();
            if (hasEtherealSet(target) && target.getRandom().nextFloat() < ENLIGHTENED_PROC_CHANCE) {
                healFromMagicDamage(target, event.getAmount());
            }

            LivingEntity attacker = resolveMagicAttacker(source);
            if (attacker != null && attacker != target
                    && hasEtherealSet(attacker) && attacker.getRandom().nextFloat() < ENLIGHTENED_PROC_CHANCE) {
                healFromMagicDamage(attacker, event.getAmount());
            }
        }

        private static boolean isMagicDamage(DamageSource source) {
            return ArmorCalculationHelper.isIronsSpellbooksDamage(source)
                    || source.is(DamageTypes.MAGIC)
                    || source.is(DamageTypes.INDIRECT_MAGIC);
        }

        private static LivingEntity resolveMagicAttacker(DamageSource source) {
            if (source.getEntity() instanceof LivingEntity living) {
                return living;
            }

            if (source.getDirectEntity() instanceof Projectile projectile && projectile.getOwner() instanceof LivingEntity owner) {
                return owner;
            }

            if (source.getDirectEntity() instanceof LivingEntity direct) {
                return direct;
            }

            return null;
        }

        private static boolean hasEtherealSet(LivingEntity entity) {
            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(entity);
            return activeSet != null && activeSet.getId().startsWith("ethereal_");
        }

        private static boolean isReducibleDebuff(MobEffect effect) {
            return effect.getCategory() == MobEffectCategory.HARMFUL;
        }

        private static void healFromMagicDamage(LivingEntity entity, float damageAmount) {
            float healAmount = damageAmount * MAGIC_TO_HEAL_RATIO;
            if (healAmount > 0.0F) {
                entity.heal(healAmount);
            }
        }
    }

    private static final class EnlightenedBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/ethereal_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/ethereal_material_icon.png"
        );

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.enlightened.name");
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
                    Component.translatable("tooltip.project_babylon_armors.bonus.enlightened.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.enlightened.line2").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
