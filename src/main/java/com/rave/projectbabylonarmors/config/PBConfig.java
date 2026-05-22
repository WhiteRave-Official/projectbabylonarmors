package com.rave.projectbabylonarmors.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class PBConfig {

    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue ENABLE_VANILLA_ARMOR_RECIPES;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("recipes");
        ENABLE_VANILLA_ARMOR_RECIPES = builder
                .comment("Enable vanilla armor crafting recipes and netherite armor upgrade recipes.")
                .define("enable_vanilla_armor_recipes", false);
        builder.pop();

        SPEC = builder.build();
    }

    private PBConfig() {
    }
}
