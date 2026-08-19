package com.rave.projectbabylonarmors.item;

import com.rave.projectbabylonarmors.client.ClientSetBonusTooltip;
import com.rave.projectbabylonarmors.config.PBArmorStats;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.api.distmarker.Dist;

import java.util.List;

public abstract class ProjectBabylonArmorItem extends ArmorItem {
    private static final ResourceLocation SPELL_RESIST_ATTRIBUTE_ID = ResourceLocation.fromNamespaceAndPath("irons_spellbooks", "spell_resist");

    private final Type armorType;
    private final String setKey;

    protected ProjectBabylonArmorItem(String setKey, Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties.durability(type.getDurability(PBArmorStats.get(setKey).durabilityMultiplier())));
        this.armorType = type;
        this.setKey = setKey;
    }

    protected Type getArmorType() {
        return armorType;
    }

    protected double getMovementSpeedPenalty() {
        return PBArmorStats.runtime(setKey).speedPenaltyFor(armorType);
    }

    protected double getMagicArmorBonus() {
        return PBArmorStats.runtime(setKey).magicArmorBonus();
    }

    /**
     * Builds ALL armor attribute modifiers from the runtime stats (datapack override or
     * startup config) instead of the values baked into the registered ArmorMaterial, so
     * defense/toughness/knockback changes apply on /reload without a restart.
     */
    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers(ItemStack stack) {
        PBArmorStats.SetStats stats = PBArmorStats.runtime(setKey);
        EquipmentSlotGroup slotGroup = EquipmentSlotGroup.bySlot(armorType.getSlot());
        String slotName = armorType.getSlot().getName();
        ResourceLocation vanillaStyleId = ResourceLocation.withDefaultNamespace("armor." + armorType.getName());

        ItemAttributeModifiers.Builder builder = ItemAttributeModifiers.builder();
        builder.add(Attributes.ARMOR,
                new AttributeModifier(vanillaStyleId, stats.defenseFor(armorType), AttributeModifier.Operation.ADD_VALUE), slotGroup);
        builder.add(Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(vanillaStyleId, stats.toughness(), AttributeModifier.Operation.ADD_VALUE), slotGroup);

        if (stats.knockbackResistance() != 0.0f) {
            builder.add(Attributes.KNOCKBACK_RESISTANCE,
                    new AttributeModifier(vanillaStyleId, stats.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), slotGroup);
        }

        double magicArmorBonus = stats.magicArmorBonus();
        Holder<Attribute> spellResistAttribute = BuiltInRegistries.ATTRIBUTE.getHolder(SPELL_RESIST_ATTRIBUTE_ID).orElse(null);
        if (magicArmorBonus > 0.0D && spellResistAttribute != null) {
            builder.add(spellResistAttribute, new AttributeModifier(
                    ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "armor_magic_resist_" + slotName),
                    magicArmorBonus,
                    AttributeModifier.Operation.ADD_VALUE
            ), slotGroup);
        }

        double movementSpeedPenalty = stats.speedPenaltyFor(armorType);
        if (movementSpeedPenalty != 0.0D) {
            builder.add(Attributes.MOVEMENT_SPEED, new AttributeModifier(
                    ResourceLocation.fromNamespaceAndPath("project_babylon_armors", "tank_movement_penalty_" + slotName),
                    movementSpeedPenalty,
                    AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
            ), slotGroup);
        }

        return builder.build();
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            ClientSetBonusTooltip.append(stack, tooltip);
        }
    }
}
