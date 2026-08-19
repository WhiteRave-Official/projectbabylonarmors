package com.rave.projectbabylonarmors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import yesman.epicfight.client.renderer.patched.layer.WearableItemLayer;

@Mixin(WearableItemLayer.class)
public abstract class WearableItemLayerFirstPersonMixin {
    @Redirect(
        method = "renderLayer",
        at = @At(
            value = "FIELD",
            target = "Lyesman/epicfight/client/renderer/patched/layer/WearableItemLayer;firstPersonModel:Z"
        ),
        remap = false
    )
    private boolean pba$disableFirstPersonArmorBranch(WearableItemLayer<?, ?, ?, ?> instance) {
        return false;
    }
}
