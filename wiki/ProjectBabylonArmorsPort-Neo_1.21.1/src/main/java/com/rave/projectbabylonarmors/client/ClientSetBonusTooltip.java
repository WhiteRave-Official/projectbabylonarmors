package com.rave.projectbabylonarmors.client;

import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import java.util.List;

/**
 * Client-only indirection so ProjectBabylonArmorItem never references client
 * classes directly (the dedicated server verifier would try to load them).
 */
public final class ClientSetBonusTooltip {
    private ClientSetBonusTooltip() {
    }

    public static void append(ItemStack stack, List<Component> tooltip) {
        ArmorSetBonusManager.appendTooltip(stack, tooltip, Screen.hasShiftDown(), Minecraft.getInstance().player);
    }
}
