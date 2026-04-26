package com.rave.projectbabylonarmors.client.tooltip;

import com.rave.projectbabylonarmors.setbonus.ArmorSetBonusType;
import com.rave.projectbabylonarmors.setbonus.ArmorSetTooltipData;
import net.minecraft.client.gui.Font.DisplayMode;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.client.renderer.MultiBufferSource;
import org.joml.Matrix4f;

public class ArmorSetClientTooltip implements ClientTooltipComponent {

    private static final int ICON_SIZE = 16;
    private static final int LINE_SPACING = 2;
    private static final int SECTION_GAP = 4;
    private static final int ICON_TEXT_GAP = 4;
    private final ArmorSetTooltipData data;

    public ArmorSetClientTooltip(ArmorSetTooltipData data) {
        this.data = data;
    }

    @Override
    public int getHeight() {
        Font font = Minecraft.getInstance().font;
        int height = font.lineHeight * 3 + SECTION_GAP;
        height += data.armorPieces().size() * (Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING);
        height += SECTION_GAP;
        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            height += Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING;
            height += bonus.descriptionLines().size() * (font.lineHeight + LINE_SPACING);
            height += SECTION_GAP;
        }
        return height;
    }

    @Override
    public int getWidth(Font font) {
        int width = Math.max(font.width(Component.literal("Set: ").append(data.setName())), font.width("Pieces: 4/4"));
        width = Math.max(width, font.width("Armor Pieces"));
        for (ArmorSetTooltipData.ArmorPieceEntry piece : data.armorPieces()) {
            width = Math.max(width, ICON_SIZE + ICON_TEXT_GAP + font.width(piece.label().copy()
                    .append(Component.literal(piece.equipped() ? " Equipped" : " Missing"))));
        }
        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            width = Math.max(width, ICON_SIZE + ICON_TEXT_GAP + font.width(Component.literal(bonus.type().getTitle() + ": ").append(bonus.displayName())));
            for (Component line : bonus.descriptionLines()) {
                width = Math.max(width, ICON_SIZE + ICON_TEXT_GAP + font.width(line));
            }
        }
        return width;
    }

    @Override
    public void renderText(Font font, int x, int y, Matrix4f matrix, MultiBufferSource.BufferSource bufferSource) {
        int currentY = y;
        drawText(font, Component.literal("Set: ").withStyle(ChatFormatting.GOLD).append(data.setName()), x, currentY, matrix, bufferSource);
        currentY += font.lineHeight + LINE_SPACING;
        drawText(font, Component.literal("Pieces: " + data.matchedPieces() + "/4").withStyle(ChatFormatting.YELLOW), x, currentY, matrix, bufferSource);
        currentY += font.lineHeight + SECTION_GAP;

        drawText(font, Component.literal("Armor Pieces").withStyle(ChatFormatting.GOLD), x, currentY, matrix, bufferSource);
        currentY += font.lineHeight + LINE_SPACING;

        for (ArmorSetTooltipData.ArmorPieceEntry piece : data.armorPieces()) {
            Component state = Component.literal(piece.equipped() ? " Equipped" : " Missing")
                    .withStyle(piece.equipped() ? ChatFormatting.GREEN : ChatFormatting.DARK_GRAY);
            drawText(font, piece.label().copy().withStyle(ChatFormatting.GRAY).append(state),
                    x + ICON_SIZE + ICON_TEXT_GAP, currentY + 4, matrix, bufferSource);
            currentY += Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING;
        }

        currentY += SECTION_GAP;

        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            drawText(font,
                    Component.literal(bonus.type().getTitle() + ": ").withStyle(ChatFormatting.GOLD)
                            .append(bonus.displayName().copy().withStyle(ChatFormatting.AQUA)),
                    x + ICON_SIZE + ICON_TEXT_GAP, currentY + 4, matrix, bufferSource);
            currentY += Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING;

            for (Component line : bonus.descriptionLines()) {
                drawText(font, line, x + ICON_SIZE + ICON_TEXT_GAP, currentY, matrix, bufferSource);
                currentY += font.lineHeight + LINE_SPACING;
            }

            currentY += SECTION_GAP;
        }
    }

    @Override
    public void renderImage(Font font, int x, int y, GuiGraphics guiGraphics) {
        int currentY = y + font.lineHeight * 3 + SECTION_GAP;

        for (ArmorSetTooltipData.ArmorPieceEntry piece : data.armorPieces()) {
            guiGraphics.renderItem(piece.stack(), x, currentY - 1);
            currentY += Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING;
        }

        currentY += SECTION_GAP;

        for (ArmorSetTooltipData.BonusEntry bonus : data.bonuses()) {
            guiGraphics.blit(bonus.iconTexture(), x, currentY, 0, 0, ICON_SIZE, ICON_SIZE, ICON_SIZE, ICON_SIZE);
            currentY += Math.max(font.lineHeight, ICON_SIZE) + LINE_SPACING;
            currentY += bonus.descriptionLines().size() * (font.lineHeight + LINE_SPACING);
            currentY += SECTION_GAP;
        }
    }

    private static void drawText(Font font, Component component, int x, int y, Matrix4f matrix,
                                 MultiBufferSource.BufferSource bufferSource) {
        FormattedCharSequence sequence = component.getVisualOrderText();
        font.drawInBatch(sequence, x, y, 0xFFFFFF, false, matrix, bufferSource, DisplayMode.NORMAL, 0, 15728880);
    }
}
