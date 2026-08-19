package com.rave.projectbabylonarmors.setbonus;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonmaterials.init.PBAttributes;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonus;
import com.rave.projectbabylonmaterials.setbonus.ArmorSetBonusType;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import yesman.epicfight.registry.entries.EpicFightAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public final class ClassArmorSetBonuses {

    private static final String LINE_PERCENT_KEY = "tooltip.project_babylon_armors.bonus.line.percent";
    private static final String LINE_FLAT_KEY = "tooltip.project_babylon_armors.bonus.line.flat";

    private ClassArmorSetBonuses() {
    }

    public static ArmorSetBonus warrior(String setId, String displayNameKey, double healthPercent, double damagePercent, Double staminaPercent) {
        List<ModifierSpec> modifiers = new ArrayList<>();
        modifiers.add(percentTotal(setId, "max_health", player -> getAttributeSafely(player, Attributes.MAX_HEALTH), healthPercent, BonusStat.MAX_HEALTH));
        modifiers.add(percentTotal(setId, "attack_damage", player -> getAttributeSafely(player, Attributes.ATTACK_DAMAGE), damagePercent, BonusStat.ATTACK_DAMAGE));

        if (staminaPercent != null) {
            modifiers.add(percentTotal(setId, "max_stamina", player -> getAttributeSafely(player, EpicFightAttributes.MAX_STAMINA), staminaPercent, BonusStat.MAX_STAMINA));
        }

        return new ConfigurableArmorSetBonus(Role.WARRIOR, displayNameKey, modifiers);
    }

    public static ArmorSetBonus tank(String setId, String displayNameKey, double healthPercent, double impactPercent, Double staminaPercent) {
        List<ModifierSpec> modifiers = new ArrayList<>();
        modifiers.add(percentTotal(setId, "max_health", player -> getAttributeSafely(player, Attributes.MAX_HEALTH), healthPercent, BonusStat.MAX_HEALTH));
        modifiers.add(percentTotal(setId, "impact", player -> getAttributeSafely(player, EpicFightAttributes.IMPACT), impactPercent, BonusStat.IMPACT));

        if (staminaPercent != null) {
            modifiers.add(percentTotal(setId, "max_stamina", player -> getAttributeSafely(player, EpicFightAttributes.MAX_STAMINA), staminaPercent, BonusStat.MAX_STAMINA));
        }

        return new ConfigurableArmorSetBonus(Role.TANK, displayNameKey, modifiers);
    }

    public static ArmorSetBonus rogue(String setId, String displayNameKey, double critChancePercent, double movementSpeedPercent,
                                      double attackSpeedPercent, Double staminaRegenPercent, Double critDamagePercent) {
        List<ModifierSpec> modifiers = new ArrayList<>();
        modifiers.add(percentAddition(setId, "crit_chance", player -> getAttributeSafely(player, PBAttributes.CRIT_CHANCE), critChancePercent, BonusStat.CRIT_CHANCE));
        modifiers.add(percentTotal(setId, "movement_speed", player -> getAttributeSafely(player, Attributes.MOVEMENT_SPEED), movementSpeedPercent, BonusStat.MOVEMENT_SPEED));
        modifiers.add(percentTotal(setId, "attack_speed", player -> getAttributeSafely(player, Attributes.ATTACK_SPEED), attackSpeedPercent, BonusStat.ATTACK_SPEED));

        if (staminaRegenPercent != null) {
            modifiers.add(percentTotal(setId, "stamina_regen", player -> getAttributeSafely(player, EpicFightAttributes.STAMINA_REGEN), staminaRegenPercent, BonusStat.STAMINA_RECOVERY));
        }

        if (critDamagePercent != null) {
            modifiers.add(percentAddition(setId, "crit_damage", player -> getAttributeSafely(player, PBAttributes.CRIT_DAMAGE), critDamagePercent, BonusStat.CRIT_DAMAGE));
        }

        return new ConfigurableArmorSetBonus(Role.ROGUE, displayNameKey, modifiers);
    }

    public static ArmorSetBonus mage(String setId, String displayNameKey, double maxManaFlat, double spellPowerPercent,
                                     Double manaRegenPercent, Double cooldownReductionPercent, Double castSpeedPercent) {
        List<ModifierSpec> modifiers = new ArrayList<>();
        modifiers.add(flatAddition(setId, "max_mana", player -> getAttributeSafely(player, AttributeRegistry.MAX_MANA), maxManaFlat, BonusStat.MAX_MANA));
        modifiers.add(percentBase(setId, "spell_power", player -> getAttributeSafely(player, AttributeRegistry.SPELL_POWER), spellPowerPercent, BonusStat.SPELL_POWER));

        if (manaRegenPercent != null) {
            modifiers.add(percentBase(setId, "mana_regen", player -> getAttributeSafely(player, AttributeRegistry.MANA_REGEN), manaRegenPercent, BonusStat.MANA_REGEN));
        }

        if (cooldownReductionPercent != null) {
            modifiers.add(percentBase(setId, "cooldown_reduction", player -> getAttributeSafely(player, AttributeRegistry.COOLDOWN_REDUCTION), cooldownReductionPercent, BonusStat.COOLDOWN_REDUCTION));
        }

        if (castSpeedPercent != null) {
            modifiers.add(percentBase(setId, "cast_time_reduction", player -> getAttributeSafely(player, AttributeRegistry.CAST_TIME_REDUCTION), castSpeedPercent, BonusStat.CAST_SPEED));
        }

        return new ConfigurableArmorSetBonus(Role.MAGE, displayNameKey, modifiers);
    }

    private static ModifierSpec percentTotal(String setId, String suffix, Function<LivingEntity, AttributeInstance> resolver,
                                             double displayAmount, BonusStat stat) {
        return new ModifierSpec(
                idFor(setId, suffix),
                resolver,
                displayAmount / 100.0D,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL,
                stat,
                displayAmount,
                LineType.PERCENT
        );
    }

    private static ModifierSpec percentBase(String setId, String suffix, Function<LivingEntity, AttributeInstance> resolver,
                                            double displayAmount, BonusStat stat) {
        return new ModifierSpec(
                idFor(setId, suffix),
                resolver,
                displayAmount / 100.0D,
                AttributeModifier.Operation.ADD_MULTIPLIED_BASE,
                stat,
                displayAmount,
                LineType.PERCENT
        );
    }

    private static ModifierSpec percentAddition(String setId, String suffix, Function<LivingEntity, AttributeInstance> resolver,
                                                double displayAmount, BonusStat stat) {
        return new ModifierSpec(
                idFor(setId, suffix),
                resolver,
                displayAmount / 100.0D,
                AttributeModifier.Operation.ADD_VALUE,
                stat,
                displayAmount,
                LineType.PERCENT
        );
    }

    private static ModifierSpec flatAddition(String setId, String suffix, Function<LivingEntity, AttributeInstance> resolver,
                                             double displayAmount, BonusStat stat) {
        return new ModifierSpec(
                idFor(setId, suffix),
                resolver,
                displayAmount,
                AttributeModifier.Operation.ADD_VALUE,
                stat,
                displayAmount,
                LineType.FLAT
        );
    }

    private static ResourceLocation idFor(String setId, String suffix) {
        return ResourceLocation.fromNamespaceAndPath("project_babylon_armors", (setId + "-" + suffix).replace('_', '-'));
    }

    private static AttributeInstance getAttributeSafely(LivingEntity entity, Holder<Attribute> attribute) {
        try {
            return entity.getAttribute(attribute);
        } catch (IllegalArgumentException ignored) {
            return null;
        }
    }

    private static Component tooltipLine(ModifierSpec spec) {
        String lineKey = spec.lineType() == LineType.PERCENT ? LINE_PERCENT_KEY : LINE_FLAT_KEY;
        return Component.translatable(lineKey, formatAmount(spec.displayAmount()), Component.translatable(spec.stat().translationKey()))
                .withStyle(ChatFormatting.BLUE);
    }

    private static String formatAmount(double amount) {
        if (Math.rint(amount) == amount) {
            return Integer.toString((int) amount);
        }

        return String.format(Locale.ROOT, "%.1f", amount);
    }

    private enum LineType {
        PERCENT,
        FLAT
    }

    private enum Role {
        WARRIOR(
                "textures/gui/tooltip/frame/class/warrior_class_frame.png",
                "textures/gui/tooltip/icon/class/warrior_class_icon.png"
        ),
        MAGE(
                "textures/gui/tooltip/frame/class/mage_class_frame.png",
                "textures/gui/tooltip/icon/class/mage_class_icon.png"
        ),
        ROGUE(
                "textures/gui/tooltip/frame/class/rogue_class_frame.png",
                "textures/gui/tooltip/icon/class/rogue_class_icon.png"
        ),
        TANK(
                "textures/gui/tooltip/frame/class/tank_class_frame.png",
                "textures/gui/tooltip/icon/class/tank_class_icon.png"
        );

        private final String framePath;
        private final String iconPath;

        Role(String framePath, String iconPath) {
            this.framePath = framePath;
            this.iconPath = iconPath;
        }
    }

    private enum BonusStat {
        MAX_HEALTH("tooltip.project_babylon_armors.stat.max_health"),
        ATTACK_DAMAGE("tooltip.project_babylon_armors.stat.attack_damage"),
        IMPACT("tooltip.project_babylon_armors.stat.impact"),
        MAX_STAMINA("tooltip.project_babylon_armors.stat.max_stamina"),
        CRIT_CHANCE("tooltip.project_babylon_armors.stat.crit_chance"),
        MOVEMENT_SPEED("tooltip.project_babylon_armors.stat.movement_speed"),
        ATTACK_SPEED("tooltip.project_babylon_armors.stat.attack_speed"),
        STAMINA_RECOVERY("tooltip.project_babylon_armors.stat.stamina_recovery"),
        CRIT_DAMAGE("tooltip.project_babylon_armors.stat.crit_damage"),
        MAX_MANA("tooltip.project_babylon_armors.stat.max_mana"),
        SPELL_POWER("tooltip.project_babylon_armors.stat.spell_power"),
        MANA_REGEN("tooltip.project_babylon_armors.stat.mana_regen"),
        COOLDOWN_REDUCTION("tooltip.project_babylon_armors.stat.cooldown_reduction"),
        CAST_SPEED("tooltip.project_babylon_armors.stat.cast_speed");

        private final String translationKey;

        BonusStat(String translationKey) {
            this.translationKey = translationKey;
        }

        public String translationKey() {
            return translationKey;
        }
    }

    private record ModifierSpec(ResourceLocation id, Function<LivingEntity, AttributeInstance> resolver, double amount,
                                AttributeModifier.Operation operation, BonusStat stat, double displayAmount,
                                LineType lineType) {
    }

    private static final class ConfigurableArmorSetBonus implements ArmorSetBonus {
        private final Role role;
        private final String displayNameKey;
        private final List<ModifierSpec> modifiers;

        private ConfigurableArmorSetBonus(Role role, String displayNameKey, List<ModifierSpec> modifiers) {
            this.role = role;
            this.displayNameKey = displayNameKey;
            this.modifiers = List.copyOf(modifiers);
        }

        @Override
        public ArmorSetBonusType getType() {
            return ArmorSetBonusType.CLASS;
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable(displayNameKey);
        }

        @Override
        public ResourceLocation getFrameTexture() {
            return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, role.framePath);
        }

        @Override
        public ResourceLocation getIconTexture() {
            return ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, role.iconPath);
        }

        @Override
        public void apply(LivingEntity entity) {
            for (ModifierSpec modifier : modifiers) {
                AttributeInstance attribute = modifier.resolver().apply(entity);
                if (attribute == null || attribute.hasModifier(modifier.id())) {
                    continue;
                }

                attribute.addTransientModifier(new AttributeModifier(
                        modifier.id(),
                        modifier.amount(),
                        modifier.operation()
                ));
            }
        }

        @Override
        public void remove(LivingEntity entity) {
            for (ModifierSpec modifier : modifiers) {
                AttributeInstance attribute = modifier.resolver().apply(entity);
                if (attribute != null && attribute.hasModifier(modifier.id())) {
                    attribute.removeModifier(modifier.id());
                }
            }

            if (entity.getHealth() > entity.getMaxHealth()) {
                entity.setHealth(entity.getMaxHealth());
            }
        }

        @Override
        public boolean isApplied(LivingEntity entity) {
            for (ModifierSpec modifier : modifiers) {
                AttributeInstance attribute = modifier.resolver().apply(entity);
                if (attribute == null || !attribute.hasModifier(modifier.id())) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public List<Component> getTooltipLines() {
            return modifiers.stream().map(ClassArmorSetBonuses::tooltipLine).toList();
        }
    }
}
