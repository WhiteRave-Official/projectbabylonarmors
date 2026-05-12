package com.rave.projectbabylonarmors.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.UUID;

public abstract class ProjectBabylonArmorItem extends ArmorItem {
    private static final ResourceLocation SPELL_RESIST_ATTRIBUTE_ID = ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "spell_resist");
    private static final UUID[] MAGIC_ARMOR_MODIFIER_UUIDS = new UUID[]{
            UUID.fromString("56f6ae88-2bd8-4c71-9b11-8fdb1d0af201"),
            UUID.fromString("5b43846e-2ca8-4340-a8f6-09c0c3f0c7b2"),
            UUID.fromString("3d503d52-4f6e-4d4b-8596-98f6dd8486c3"),
            UUID.fromString("3bd4d84c-fdb3-4d8c-9652-8b67234cd2d4")
    };
    private static final UUID[] MOVEMENT_SPEED_MODIFIER_UUIDS = new UUID[]{
            UUID.fromString("0c204f72-0ea4-4fb0-9e77-9a6e6f278701"),
            UUID.fromString("348ae9d8-e3f6-4d95-a520-4c9f0e224702"),
            UUID.fromString("7da6571c-0638-4be0-95d6-9364386d1703"),
            UUID.fromString("f6f2fc67-b214-4629-85ae-fb8e7ce64704")
    };

    private final Type armorType;

    protected ProjectBabylonArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
        this.armorType = type;
    }

    protected Type getArmorType() {
        return armorType;
    }

    protected double getMovementSpeedPenalty() {
        return 0.0D;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        Multimap<Attribute, AttributeModifier> defaults = super.getDefaultAttributeModifiers(slot);
        if (slot != armorType.getSlot()) {
            return defaults;
        }

        double magicArmorBonus = getMagicArmorBonus();
        double movementSpeedPenalty = getMovementSpeedPenalty();
        Attribute spellResistAttribute = ForgeRegistries.ATTRIBUTES.getValue(SPELL_RESIST_ATTRIBUTE_ID);
        boolean hasMagicArmorBonus = magicArmorBonus > 0.0D && spellResistAttribute != null;
        boolean hasMovementPenalty = movementSpeedPenalty != 0.0D;

        if (!hasMagicArmorBonus && !hasMovementPenalty) {
            return defaults;
        }

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(defaults);

        if (hasMagicArmorBonus) {
            builder.put(spellResistAttribute, new AttributeModifier(
                    MAGIC_ARMOR_MODIFIER_UUIDS[armorType.getSlot().getIndex()],
                    "Armor magic resist",
                    magicArmorBonus,
                    AttributeModifier.Operation.ADDITION
            ));
        }

        if (hasMovementPenalty) {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(
                    MOVEMENT_SPEED_MODIFIER_UUIDS[armorType.getSlot().getIndex()],
                    "Tank armor movement penalty",
                    movementSpeedPenalty,
                    AttributeModifier.Operation.MULTIPLY_TOTAL
            ));
        }

        return builder.build();
    }

    protected double getMagicArmorBonus() {
        return 0.0D;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        ArmorSetBonusManager.appendTooltip(stack, tooltip, Screen.hasShiftDown(), Minecraft.getInstance().player);
    }
}