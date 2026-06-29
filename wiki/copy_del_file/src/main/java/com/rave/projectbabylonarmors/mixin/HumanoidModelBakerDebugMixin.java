package com.rave.projectbabylonarmors.mixin;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import yesman.epicfight.api.client.model.SkinnedMesh;
import yesman.epicfight.api.client.model.transformer.HumanoidModelBaker;
import yesman.epicfight.api.client.model.transformer.HumanoidModelTransformer;
import yesman.epicfight.client.mesh.HumanoidMesh;

import java.util.List;

@Mixin(value = HumanoidModelBaker.class, remap = false)
public abstract class HumanoidModelBakerDebugMixin {
    @Shadow @Final private static List<HumanoidModelTransformer> MODEL_TRANSFORMERS;

    @Inject(method = "registerNewTransformer", at = @At("TAIL"), remap = false)
    private static void pba$logRegisterTransformer(HumanoidModelTransformer transformer, CallbackInfo ci) {
        ProjectBabylonArmors.LOGGER.info("[PBAArmorReloadDebug] HumanoidModelBaker.registerNewTransformer transformer={} transformerCount={}",
                transformer == null ? "null" : transformer.getClass().getName(),
                MODEL_TRANSFORMERS.size());
    }

    @Inject(method = "bakeArmor", at = @At("HEAD"), remap = false)
    private static void pba$logBakeArmorStart(LivingEntity entityLiving, ItemStack itemstack, ArmorItem armorItem, EquipmentSlot slot,
                                              HumanoidModel<?> originalModel, Model forgeModel, HumanoidModel<?> entityModel,
                                              HumanoidMesh entityMesh, CallbackInfoReturnable<SkinnedMesh> cir) {
        ProjectBabylonArmors.LOGGER.info("[PBAArmorReloadDebug] HumanoidModelBaker.bakeArmor start item={} slot={} forgeModelClass={} originalModelClass={} transformerCount={}",
                ForgeRegistries.ITEMS.getKey(armorItem),
                slot,
                forgeModel == null ? "null" : forgeModel.getClass().getName(),
                originalModel == null ? "null" : originalModel.getClass().getName(),
                MODEL_TRANSFORMERS.size());
    }

    @Redirect(method = "bakeArmor", at = @At(value = "INVOKE", target = "Lyesman/epicfight/api/client/model/transformer/HumanoidModelTransformer;transformArmorModel(Lnet/minecraft/client/model/HumanoidModel;)Lyesman/epicfight/api/client/model/SkinnedMesh;"), remap = false)
    private static SkinnedMesh pba$logTransformerCall(HumanoidModelTransformer transformer, HumanoidModel<?> humanoidModel,
                                                      LivingEntity entityLiving, ItemStack itemstack, ArmorItem armorItem, EquipmentSlot slot,
                                                      HumanoidModel<?> originalModel, Model forgeModel, HumanoidModel<?> entityModel,
                                                      HumanoidMesh entityMesh) {
        ProjectBabylonArmors.LOGGER.info("[PBAArmorReloadDebug] HumanoidModelTransformer.transformArmorModel call transformer={} item={} slot={} modelClass={}",
                transformer == null ? "null" : transformer.getClass().getName(),
                ForgeRegistries.ITEMS.getKey(armorItem),
                slot,
                humanoidModel == null ? "null" : humanoidModel.getClass().getName());
        SkinnedMesh result = transformer.transformArmorModel(humanoidModel);
        ProjectBabylonArmors.LOGGER.info("[PBAArmorReloadDebug] HumanoidModelTransformer.transformArmorModel result transformer={} item={} slot={} meshNull={}",
                transformer == null ? "null" : transformer.getClass().getName(),
                ForgeRegistries.ITEMS.getKey(armorItem),
                slot,
                result == null);
        return result;
    }
}