package com.rave.projectbabylonarmors.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class PBConfig {

    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue ENABLE_VANILLA_ARMOR_RECIPES;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

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
