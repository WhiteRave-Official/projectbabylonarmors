package com.rave.projectbabylonarmors.init;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.effect.RebirthCooldownEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class PBArmorEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ProjectBabylonArmors.MODID);

    public static final RegistryObject<MobEffect> REBIRTH_COOLDOWN = EFFECTS.register("rebirth_cooldown", RebirthCooldownEffect::new);

    private PBArmorEffects() {
    }
}