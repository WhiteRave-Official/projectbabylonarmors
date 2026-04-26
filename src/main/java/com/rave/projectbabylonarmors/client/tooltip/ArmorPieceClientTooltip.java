package com.rave.projectbabylonarmors.client.tooltip;

import com.rave.projectbabylonarmors.setbonus.ArmorPieceTooltipData;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import org.joml.Matrix4f;

public class ArmorPieceClientTooltip implements ClientTooltipComponent {

    private static final int ICON_SIZE = 16;
    private static final int ICON_TEXT_GAP = 4;
    private final ArmorPieceTooltipData data;

    public ArmorPieceClientTooltip(ArmorPieceTooltipData data) {
        this.data = data;
    }

    @Override
    public int getHeight() {
        return ICON_SIZE;
    }

    @Override
    public int getWidth(Font font) {
        return ICON_SIZE + ICON_TEXT_GAP + font.width(createLineComponent());
    }

    @Override
    public void renderText(Font font, int x, int y, Matrix4f matrix, MultiBufferSource.BufferSource bufferSource) {
        FormattedCharSequence text = createLineComponent().getVisualOrderText();
        font.drawInBatch(text, x + ICON_SIZE + ICON_TEXT_GAP, y + 4, 0xFFFFFF, false, matrix, bufferSource,
                Font.DisplayMode.NORMAL, 0, 15728880);
    }

    @Override
    public void renderImage(Font font, int x, int y, GuiGraphics guiGraphics) {
        guiGraphics.renderItem(data.stack(), x, y);
    }

    private Component createLineComponent() {
        ChatFormatting stateColor = data.equipped() ? ChatFormatting.GREEN : ChatFormatting.DARK_GRAY;
        String stateText = data.equipped() ? "Equipped" : "Missing";
        return data.label().copy().withStyle(ChatFormatting.GRAY)
                .append(Component.literal(": ").withStyle(ChatFormatting.GRAY))
                .append(Component.literal(stateText).withStyle(stateColor));
    }
}
