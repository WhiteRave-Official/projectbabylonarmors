package com.rave.projectbabylonarmors.handler;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.config.PBConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID)
public final class VanillaRecipeToggleHandler {
    private static final Set<ResourceLocation> DISABLED_RECIPE_IDS = Set.of(
            ResourceLocation.parse("minecraft:leather_helmet"),
            ResourceLocation.parse("minecraft:leather_chestplate"),
            ResourceLocation.parse("minecraft:leather_leggings"),
            ResourceLocation.parse("minecraft:leather_boots"),
            ResourceLocation.parse("minecraft:iron_helmet"),
            ResourceLocation.parse("minecraft:iron_chestplate"),
            ResourceLocation.parse("minecraft:iron_leggings"),
            ResourceLocation.parse("minecraft:iron_boots"),
            ResourceLocation.parse("minecraft:golden_helmet"),
            ResourceLocation.parse("minecraft:golden_chestplate"),
            ResourceLocation.parse("minecraft:golden_leggings"),
            ResourceLocation.parse("minecraft:golden_boots"),
            ResourceLocation.parse("minecraft:diamond_helmet"),
            ResourceLocation.parse("minecraft:diamond_chestplate"),
            ResourceLocation.parse("minecraft:diamond_leggings"),
            ResourceLocation.parse("minecraft:diamond_boots"),
            ResourceLocation.parse("minecraft:turtle_helmet"),
            ResourceLocation.parse("minecraft:netherite_helmet_smithing"),
            ResourceLocation.parse("minecraft:netherite_chestplate_smithing"),
            ResourceLocation.parse("minecraft:netherite_leggings_smithing"),
            ResourceLocation.parse("minecraft:netherite_boots_smithing")
    );

    private VanillaRecipeToggleHandler() {
    }

    @SubscribeEvent
    public static void onServerStarted(ServerStartedEvent event) {
        if (PBConfig.ENABLE_VANILLA_ARMOR_RECIPES.get()) {
            return;
        }

        MinecraftServer server = event.getServer();
        RecipeManager recipeManager = server.getRecipeManager();
        List<Recipe<?>> filteredRecipes = recipeManager.getRecipes().stream()
                .filter(recipe -> !DISABLED_RECIPE_IDS.contains(recipe.getId()))
                .collect(Collectors.toList());

        int removedCount = recipeManager.getRecipes().size() - filteredRecipes.size();
        if (removedCount > 0) {
            recipeManager.replaceRecipes(filteredRecipes);
            ProjectBabylonArmors.LOGGER.info("Removed {} vanilla armor recipes because recipes.enable_vanilla_armor_recipes=false", removedCount);
        }
    }
}

