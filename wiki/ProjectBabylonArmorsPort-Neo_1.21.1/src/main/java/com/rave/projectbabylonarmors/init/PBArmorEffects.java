package com.rave.projectbabylonarmors.init;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.effect.RebirthCooldownEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class PBArmorEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ProjectBabylonArmors.MODID);

    public static final DeferredHolder<MobEffect, MobEffect> REBIRTH_COOLDOWN = EFFECTS.register("rebirth_cooldown", RebirthCooldownEffect::new);

    private PBArmorEffects() {
    }
}
