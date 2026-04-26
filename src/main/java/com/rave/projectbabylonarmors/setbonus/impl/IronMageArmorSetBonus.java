package com.rave.projectbabylonarmors.setbonus.impl;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.setbonus.ArmorSetBonus;
import com.rave.projectbabylonarmors.setbonus.ArmorSetBonusType;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

import java.util.List;
import java.util.UUID;

public class IronMageArmorSetBonus implements ArmorSetBonus {

    private static final UUID MAX_MANA_BONUS_UUID = UUID.fromString("1f27889e-0a1d-4f90-b5a2-461968a0d13e");
    private static final UUID SPELL_POWER_BONUS_UUID = UUID.fromString("0cae9fc8-34a4-497d-ad4f-b92e3db747b8");
    private static final String MAX_MANA_BONUS_NAME = "iron_mage_set_max_mana_bonus";
    private static final String SPELL_POWER_BONUS_NAME = "iron_mage_set_spell_power_bonus";

    @Override
    public ArmorSetBonusType getType() {
        return ArmorSetBonusType.CLASS;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("tooltip.project_babylon_armors.bonus.iron_arcanist.name");
    }

    @Override
    public ResourceLocation getFrameTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/frame/class/mage_class_frame.png");
    }

    @Override
    public ResourceLocation getIconTexture() {
        return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, "textures/gui/tooltip/icon/class/mage_class_icon.png");
    }

    @Override
    public void apply(Player player) {
        applyModifier(player.getAttribute(AttributeRegistry.MAX_MANA.get()), MAX_MANA_BONUS_UUID, MAX_MANA_BONUS_NAME,
                50.0D, AttributeModifier.Operation.ADDITION);
        applyModifier(player.getAttribute(AttributeRegistry.SPELL_POWER.get()), SPELL_POWER_BONUS_UUID, SPELL_POWER_BONUS_NAME,
                0.15D, AttributeModifier.Operation.MULTIPLY_BASE);
    }

    @Override
    public void remove(Player player) {
        removeModifier(player.getAttribute(AttributeRegistry.MAX_MANA.get()), MAX_MANA_BONUS_UUID);
        removeModifier(player.getAttribute(AttributeRegistry.SPELL_POWER.get()), SPELL_POWER_BONUS_UUID);
    }

    @Override
    public boolean isApplied(Player player) {
        return hasModifier(player.getAttribute(AttributeRegistry.MAX_MANA.get()), MAX_MANA_BONUS_UUID)
                && hasModifier(player.getAttribute(AttributeRegistry.SPELL_POWER.get()), SPELL_POWER_BONUS_UUID);
    }

    @Override
    public List<Component> getTooltipLines() {
        return List.of(
                Component.translatable("tooltip.project_babylon_armors.bonus.iron_arcanist.mana").withStyle(ChatFormatting.BLUE),
                Component.translatable("tooltip.project_babylon_armors.bonus.iron_arcanist.spell_power").withStyle(ChatFormatting.BLUE)
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
