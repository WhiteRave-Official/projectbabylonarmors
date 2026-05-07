package com.rave.projectbabylonarmors.command;

import com.mojang.brigadier.CommandDispatcher;
import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.setbonus.DragonsteelMaterialBonuses;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ArmorsDebugCommands {
    private ArmorsDebugCommands() {
    }

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        register(event.getDispatcher());
    }

    private static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("pbarmors")
                .requires(source -> source.hasPermission(2))
                .then(Commands.literal("reset_rebirth")
                        .executes(context -> resetRebirth(context.getSource(), java.util.List.of(context.getSource().getEntityOrException())))
                        .then(Commands.argument("targets", EntityArgument.entities())
                                .executes(context -> resetRebirth(context.getSource(), EntityArgument.getEntities(context, "targets"))))));
    }

    private static int resetRebirth(CommandSourceStack source, Collection<? extends Entity> targets) {
        int resetCount = 0;

        for (Entity target : targets) {
            if (target instanceof LivingEntity livingEntity) {
                DragonsteelMaterialBonuses.resetRebirthCooldown(livingEntity);
                resetCount++;
            }
        }

        if (resetCount == 0) {
            source.sendFailure(Component.literal("No living entities found to reset Rebirth cooldown."));
            return 0;
        }

        if (resetCount == 1) {
            source.sendSuccess(() -> Component.literal("Rebirth cooldown reset."), true);
        } else {
            int finalResetCount = resetCount;
            source.sendSuccess(() -> Component.literal("Rebirth cooldown reset for " + finalResetCount + " entities."), true);
        }

        return resetCount;
    }
}