package com.rave.projectbabylonarmors.mixin;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.client.model.Model;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import yesman.epicfight.api.client.model.SkinnedMesh;
import yesman.epicfight.client.renderer.patched.layer.WearableItemLayer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Mixin(WearableItemLayer.class)
public abstract class WearableItemLayerPutModelMixin {
    private static final Set<String> PBA_NULL_MODEL_LOGGED = new HashSet<>();

    @Inject(method = "putModel", at = @At("HEAD"), cancellable = true, remap = false)
    private static void pba$skipNullModelCache(ResourceLocation rl, SkinnedMesh skinnedMesh, CallbackInfo ci) {
        if (skinnedMesh != null) {
            return;
        }

        Map<ResourceLocation, SkinnedMesh> armorModels = WearableItemLayerAccessor.pba$getArmorModels();
        armorModels.remove(rl);
        ProjectBabylonArmors.LOGGER.warn("[PBAArmorReloadDebug] Prevented null Epic Fight armor mesh cache entry for {}", rl);
        ci.cancel();
    }

    @Inject(method = "getArmorModel", at = @At("RETURN"), remap = false)
    private void pba$resetCachedMeshVisibility(CallbackInfoReturnable<SkinnedMesh> cir) {
        SkinnedMesh mesh = cir.getReturnValue();
        if (mesh == null) {
            return;
        }

        mesh.getAllParts().forEach(part -> part.setHidden(false));
    }

    @Inject(method = "getArmorModel", at = @At("RETURN"), remap = false)
    private <E extends LivingEntity, M extends HumanoidModel<E>> void pba$logNullArmorModel(
            HumanoidArmorLayer<E, M, M> originalRenderer,
            M originalModel,
            Model forgeHooksArmorModel,
            E entityliving,
            ArmorItem armorItem,
            ItemStack itemstack,
            EquipmentSlot slot,
            CallbackInfoReturnable<SkinnedMesh> cir) {
        if (cir.getReturnValue() != null) {
            return;
        }

        Item item = itemstack.getItem();
        ResourceLocation itemId = item == null ? null : net.minecraftforge.registries.ForgeRegistries.ITEMS.getKey(item);
        String logKey = String.valueOf(itemId) + "|" + slot + "|" + (forgeHooksArmorModel == null ? "null" : forgeHooksArmorModel.getClass().getName());
        if (!PBA_NULL_MODEL_LOGGED.add(logKey)) {
            return;
        }

        ProjectBabylonArmors.LOGGER.warn(
                "[PBAArmorReloadDebug] WearableItemLayer.getArmorModel returned null item={} slot={} armorItemClass={} originalModelClass={} forgeHooksModelClass={} entity={}",
                itemId,
                slot,
                armorItem == null ? "null" : armorItem.getClass().getName(),
                originalModel == null ? "null" : originalModel.getClass().getName(),
                forgeHooksArmorModel == null ? "null" : forgeHooksArmorModel.getClass().getName(),
                entityliving == null ? "null" : entityliving.getName().getString()
        );
    }
}
