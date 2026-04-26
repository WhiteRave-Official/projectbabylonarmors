package com.rave.projectbabylonarmors.setbonus.impl;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.setbonus.ArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

import java.util.List;
import java.util.UUID;

public class IronWarriorArmorSetBonus implements ArmorSetBonus {

    private static final UUID DAMAGE_BONUS_UUID = UUID.fromString("9f7d0dfa-f5ac-4cc2-8f22-dc11ca4f4d71");
    private static final UUID HEALTH_BONUS_UUID = UUID.fromString("d5c06e47-48ad-4503-a3bf-a0b14bfe12f2");
    private static final String DAMAGE_BONUS_NAME = "iron_warrior_set_damage_bonus";
    private static final String HEALTH_BONUS_NAME = "iron_warrior_set_health_bonus";

    @Override
    public ArmorSetBonusType getType() {
        return ArmorSetBonusType.CLASS;
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Iron Knight");
    }

    @Override
    public ResourceLocation getIconTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/set_bonus/class/iron_knight.png");
    }

    @Override
    public void apply(Player player) {
        applyModifier(player.getAttribute(Attributes.ATTACK_DAMAGE), DAMAGE_BONUS_UUID, DAMAGE_BONUS_NAME);
        applyModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID, HEALTH_BONUS_NAME);
    }

    @Override
    public void remove(Player player) {
        removeModifier(player.getAttribute(Attributes.ATTACK_DAMAGE), DAMAGE_BONUS_UUID);
        removeModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID);

        if (player.getHealth() > player.getMaxHealth()) {
            player.setHealth(player.getMaxHealth());
        }
    }

    @Override
    public boolean isApplied(Player player) {
        return hasModifier(player.getAttribute(Attributes.ATTACK_DAMAGE), DAMAGE_BONUS_UUID)
                && hasModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID);
    }

    @Override
    public List<Component> getTooltipLines() {
        return List.of(
                Component.literal("      +10% damage").withStyle(ChatFormatting.BLUE),
                Component.literal("      +10% max health").withStyle(ChatFormatting.BLUE)
        );
    }

    private static void applyModifier(AttributeInstance attribute, UUID uuid, String name) {
        if (attribute == null || attribute.getModifier(uuid) != null) {
            return;
        }

        AttributeModifier modifier = new AttributeModifier(uuid, name, 0.10D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        attribute.addTransientModifier(modifier);
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
