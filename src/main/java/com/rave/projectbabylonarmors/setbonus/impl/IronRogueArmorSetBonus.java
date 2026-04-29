package com.rave.projectbabylonarmors.setbonus.impl;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.init.PBAttributes;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

import java.util.List;
import java.util.UUID;

public class IronRogueArmorSetBonus implements ArmorSetBonus {

    private static final UUID CRIT_CHANCE_BONUS_UUID = UUID.fromString("e6a7dab7-f1a2-4d39-95c3-613c39837692");
    private static final UUID MOVEMENT_SPEED_BONUS_UUID = UUID.fromString("60e9698d-f6b4-42b7-b2fb-cd2ccae45ed7");
    private static final UUID ATTACK_SPEED_BONUS_UUID = UUID.fromString("406f73df-e555-44ad-a129-72e3f63f9820");
    private static final String CRIT_CHANCE_BONUS_NAME = "iron_rogue_set_crit_chance_bonus";
    private static final String MOVEMENT_SPEED_BONUS_NAME = "iron_rogue_set_movement_speed_bonus";
    private static final String ATTACK_SPEED_BONUS_NAME = "iron_rogue_set_attack_speed_bonus";

    @Override
    public ArmorSetBonusType getType() {
        return ArmorSetBonusType.CLASS;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("tooltip.project_babylon_armors.bonus.assassin_school.name");
    }

    @Override
    public ResourceLocation getFrameTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/frame/class/rogue_class_frame.png");
    }

    @Override
    public ResourceLocation getIconTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/icon/class/rogue_class_icon.png");
    }

    @Override
    public void apply(Player player) {
        applyModifier(player.getAttribute(PBAttributes.CRIT_CHANCE.get()), CRIT_CHANCE_BONUS_UUID, CRIT_CHANCE_BONUS_NAME,
                0.10D, AttributeModifier.Operation.ADDITION);
        applyModifier(player.getAttribute(Attributes.MOVEMENT_SPEED), MOVEMENT_SPEED_BONUS_UUID, MOVEMENT_SPEED_BONUS_NAME,
                0.10D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        applyModifier(player.getAttribute(Attributes.ATTACK_SPEED), ATTACK_SPEED_BONUS_UUID, ATTACK_SPEED_BONUS_NAME,
                0.05D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void remove(Player player) {
        removeModifier(player.getAttribute(PBAttributes.CRIT_CHANCE.get()), CRIT_CHANCE_BONUS_UUID);
        removeModifier(player.getAttribute(Attributes.MOVEMENT_SPEED), MOVEMENT_SPEED_BONUS_UUID);
        removeModifier(player.getAttribute(Attributes.ATTACK_SPEED), ATTACK_SPEED_BONUS_UUID);
    }

    @Override
    public boolean isApplied(Player player) {
        return hasModifier(player.getAttribute(PBAttributes.CRIT_CHANCE.get()), CRIT_CHANCE_BONUS_UUID)
                && hasModifier(player.getAttribute(Attributes.MOVEMENT_SPEED), MOVEMENT_SPEED_BONUS_UUID)
                && hasModifier(player.getAttribute(Attributes.ATTACK_SPEED), ATTACK_SPEED_BONUS_UUID);
    }

    @Override
    public List<Component> getTooltipLines() {
        return List.of(
                Component.translatable("tooltip.project_babylon_armors.bonus.assassin_school.crit_chance").withStyle(ChatFormatting.BLUE),
                Component.translatable("tooltip.project_babylon_armors.bonus.assassin_school.movement_speed").withStyle(ChatFormatting.BLUE),
                Component.translatable("tooltip.project_babylon_armors.bonus.assassin_school.attack_speed").withStyle(ChatFormatting.BLUE)
        );
    }

    private static void applyModifier(AttributeInstance attribute, UUID uuid, String name, double amount,
                                      AttributeModifier.Operation operation) {
        if (attribute == null || attribute.getModifier(uuid) != null) {
            return;
        }

        attribute.addTransientModifier(new AttributeModifier(uuid, name, amount, operation));
    }

    private static void removeModifier(AttributeInstance attribute, UUID uuid) {
        if (attribute == null || attribute.getModifier(uuid) == null) {
            return;
        }

        attribute.removeModifier(uuid);
    }

    private static boolean hasModifier(AttributeInstance attribute, UUID uuid) {
        return attribute != null && attribute.getModifier(uuid) != null;
    }
}
