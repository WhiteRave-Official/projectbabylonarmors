package com.rave.projectbabylonarmors.setbonus.impl;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import yesman.epicfight.world.entity.ai.attribute.EpicFightAttributes;

import java.util.List;
import java.util.UUID;

public class IronTankArmorSetBonus implements ArmorSetBonus {

    private static final UUID HEALTH_BONUS_UUID = UUID.fromString("59a8d9f8-4ae1-4cc0-904e-51760f2d671a");
    private static final UUID IMPACT_BONUS_UUID = UUID.fromString("337f34ea-2a25-418d-98c5-7bf9246279fa");
    private static final String HEALTH_BONUS_NAME = "iron_tank_set_health_bonus";
    private static final String IMPACT_BONUS_NAME = "iron_tank_set_impact_bonus";

    @Override
    public ArmorSetBonusType getType() {
        return ArmorSetBonusType.CLASS;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("tooltip.project_babylon_armors.bonus.iron_bulwark.name");
    }

    @Override
    public ResourceLocation getFrameTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/frame/class/tank_class_frame.png");
    }

    @Override
    public ResourceLocation getIconTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/icon/class/tank_class_icon.png");
    }

    @Override
    public void apply(Player player) {
        applyModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID, HEALTH_BONUS_NAME,
                0.15D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        applyModifier(player.getAttribute(EpicFightAttributes.IMPACT.get()), IMPACT_BONUS_UUID, IMPACT_BONUS_NAME,
                0.15D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void remove(Player player) {
        removeModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID);
        removeModifier(player.getAttribute(EpicFightAttributes.IMPACT.get()), IMPACT_BONUS_UUID);

        if (player.getHealth() > player.getMaxHealth()) {
            player.setHealth(player.getMaxHealth());
        }
    }

    @Override
    public boolean isApplied(Player player) {
        return hasModifier(player.getAttribute(Attributes.MAX_HEALTH), HEALTH_BONUS_UUID)
                && hasModifier(player.getAttribute(EpicFightAttributes.IMPACT.get()), IMPACT_BONUS_UUID);
    }

    @Override
    public List<Component> getTooltipLines() {
        return List.of(
                Component.translatable("tooltip.project_babylon_armors.bonus.iron_bulwark.health").withStyle(ChatFormatting.BLUE),
                Component.translatable("tooltip.project_babylon_armors.bonus.iron_bulwark.impact").withStyle(ChatFormatting.BLUE)
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
