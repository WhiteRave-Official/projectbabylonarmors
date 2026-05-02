package com.rave.projectbabylonarmors.setbonus;
import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.ProjectBabylonMaterials;
import com.rave.projectbabylonmaterials.combat.ArmorCalculationHelper;
import com.rave.projectbabylonmaterials.init.PBMEffects;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.List;
public final class GoldenMaterialBonuses {
    private static final float SECRET_CULT_PROC_CHANCE = 0.30F;
    private static final int SECRET_CULT_DURATION_TICKS = 100;
    private static final ArmorSetBonus SECRET_CULT = new SecretCultBonus();
    private GoldenMaterialBonuses() {
    }
    public static ArmorSetBonus secretCult() {
        return SECRET_CULT;
    }
    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static final class SecretCultEvents {
        private SecretCultEvents() {
        }
        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.getEntity().level().isClientSide()) {
                return;
            }
            if (!(event.getSource().getEntity() instanceof LivingEntity attacker)) {
                return;
            }
            LivingEntity target = event.getEntity();
            if (target == attacker) {
                return;
            }
            if (!ArmorCalculationHelper.isIronsSpellbooksDamage(event.getSource())) {
                return;
            }
            com.rave.projectbabylonmaterials.setbonus.ArmorSetDefinition activeSet =
                    com.rave.projectbabylonmaterials.setbonus.ArmorSetRegistry.findMatching(attacker);
            if (activeSet == null || !activeSet.getId().startsWith("golden_")) {
                return;
            }
            if (attacker.getRandom().nextFloat() >= SECRET_CULT_PROC_CHANCE) {
                return;
            }
            target.addEffect(new MobEffectInstance(PBMEffects.UNSTABLE.get(), SECRET_CULT_DURATION_TICKS, 0, false, true, true), attacker);
        }
    }
    private static final class SecretCultBonus implements ArmorSetBonus {
        private static final ResourceLocation FRAME_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/frame/material/gold_material_frame.png"
        );
        private static final ResourceLocation ICON_TEXTURE = ResourceLocation.fromNamespaceAndPath(
                ProjectBabylonMaterials.MODID,
                "textures/gui/tooltip/icon/material/gold_material_icon.png"
        );
        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.MATERIAL;
        }
        @Override
        public Component getDisplayName() {
            return Component.translatable("tooltip.project_babylon_armors.bonus.secret_cult.name");
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
                    Component.translatable("tooltip.project_babylon_armors.bonus.secret_cult.line1").withStyle(ChatFormatting.BLUE),
                    Component.translatable("tooltip.project_babylon_armors.bonus.secret_cult.line2").withStyle(ChatFormatting.BLUE)
            );
        }
    }
}
