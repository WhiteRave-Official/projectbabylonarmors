package com.rave.projectbabylonarmors.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class RebirthCooldownEffect extends MobEffect {
    public RebirthCooldownEffect() {
        super(MobEffectCategory.NEUTRAL, 0x3a0d52);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return false;
    }
}
