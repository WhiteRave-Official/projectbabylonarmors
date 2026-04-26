package com.rave.projectbabylonarmors.client.tooltip;

import com.mojang.datafixers.util.Either;
import com.rave.projectbabylonarmors.setbonus.ArmorPieceTooltipData;
import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.setbonus.ArmorSetBonusManager;
import com.rave.projectbabylonarmors.setbonus.ArmorSetTooltipData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ArmorSetTooltipEvents {

    private ArmorSetTooltipEvents() {
    }

    @SubscribeEvent
    public static void onGatherTooltipComponents(RenderTooltipEvent.GatherComponents event) {
        if (!Screen.hasShiftDown()) {
            return;
        }

        ArmorSetTooltipData data = ArmorSetBonusManager.createTooltipData(event.getItemStack(), Minecraft.getInstance().player);
        if (data == null) {
            return;
        }

        List<Either<net.minecraft.network.chat.FormattedText, net.minecraft.world.inventory.tooltip.TooltipComponent>> elements = event.getTooltipElements();
        int setTooltipStart = elements.size() - ArmorSetBonusManager.getExpandedTooltipLineCount(data);
        if (setTooltipStart < 0) {
            return;
        }

        for (int i = setTooltipStart; i < elements.size(); i++) {
            Either<net.minecraft.network.chat.FormattedText, net.minecraft.world.inventory.tooltip.TooltipComponent> element = elements.get(i);
            if (element.left().isEmpty()) {
                continue;
            }

            String line = element.left().get().getString();
            ArmorSetTooltipData.ArmorPieceEntry piece = findArmorPieceForLine(data, line);
            if (piece == null) {
                continue;
            }

            elements.set(i, Either.right(new ArmorPieceTooltipData(piece.stack(), piece.label(), piece.equipped())));
        }
    }

    @Mod.EventBusSubscriber(modid = ProjectBabylonArmors.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static final class ModBusEvents {

        private ModBusEvents() {
        }

        @SubscribeEvent
        public static void onRegisterTooltipFactories(RegisterClientTooltipComponentFactoriesEvent event) {
            event.register(ArmorSetTooltipData.class, ArmorSetClientTooltip::new);
            event.register(ArmorPieceTooltipData.class, ArmorPieceClientTooltip::new);
        }
    }

    private static ArmorSetTooltipData.ArmorPieceEntry findArmorPieceForLine(ArmorSetTooltipData data, String line) {
        if (line.contains("Helmet:")) {
            return data.armorPieces().get(0);
        }
        if (line.contains("Chestplate:")) {
            return data.armorPieces().get(1);
        }
        if (line.contains("Leggings:")) {
            return data.armorPieces().get(2);
        }
        if (line.contains("Boots:")) {
            return data.armorPieces().get(3);
        }
        return null;
    }
}
