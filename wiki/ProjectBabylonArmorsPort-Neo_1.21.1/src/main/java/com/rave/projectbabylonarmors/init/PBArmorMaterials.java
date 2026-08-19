package com.rave.projectbabylonarmors.init;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.config.PBArmorStats;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

/**
 * 1.21 registered ArmorMaterials. Defense, enchantment value, toughness and knockback
 * resistance come from the user-editable PBArmorStats config file.
 */
public final class PBArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, ProjectBabylonArmors.MODID);

    private PBArmorMaterials() {
    }

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(String name, String setKey,
                                                                          Holder<SoundEvent> equipSound, ItemLike repairItem) {
        return ARMOR_MATERIALS.register(name, () -> {
            PBArmorStats.SetStats stats = PBArmorStats.get(setKey);
            return new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        for (ArmorItem.Type type : ArmorItem.Type.values()) {
                            map.put(type, stats.defenseFor(type));
                        }
                    }),
                    stats.enchantmentValue(),
                    equipSound,
                    () -> Ingredient.of(repairItem),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(ProjectBabylonArmors.MODID, name))),
                    stats.toughness(),
                    stats.knockbackResistance()
            );
        });
    }

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DIAMONDMAGE =
            register("diamondmage", "diamond_mage", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DIAMONDROGUE =
            register("diamondrogue", "diamond_rogue", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DIAMONDTANK =
            register("diamondtank", "diamond_tank", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DIAMONDWARRIOR =
            register("diamondwarrior", "diamond_warrior", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DRAGONSTEELMAGE =
            register("dragonsteelmage", "dragonsteel_mage", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DRAGONSTEELROGUE =
            register("dragonsteelrogue", "dragonsteel_rogue", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DRAGONSTEELTANK =
            register("dragonsteeltank", "dragonsteel_tank", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> DRAGONSTEELWARRIOR =
            register("dragonsteelwarrior", "dragonsteel_warrior", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ETHEREALMAGE =
            register("etherealmage", "ethereal_mage", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ETHEREALROGUE =
            register("etherealrogue", "ethereal_rogue", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ETHEREALTANK =
            register("etherealtank", "ethereal_tank", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ETHEREALWARRIOR =
            register("etherealwarrior", "ethereal_warrior", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GOLDENMAGE =
            register("goldenmage", "golden_mage", SoundEvents.ARMOR_EQUIP_GOLD, Items.GOLD_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GOLDENROGUE =
            register("goldenrogue", "golden_rogue", SoundEvents.ARMOR_EQUIP_GOLD, Items.GOLD_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GOLDENTANK =
            register("goldentank", "golden_tank", SoundEvents.ARMOR_EQUIP_GOLD, Items.GOLD_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GOLDENWARRIOR =
            register("goldenwarrior", "golden_warrior", SoundEvents.ARMOR_EQUIP_GOLD, Items.GOLD_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ICEMAGE =
            register("icemage", "ice_mage", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ICEROGUE =
            register("icerogue", "ice_rogue", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ICETANK =
            register("icetank", "ice_tank", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ICEWARRIOR =
            register("icewarrior", "ice_warrior", SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> IRONMAGE =
            register("ironmage", "iron_mage", SoundEvents.ARMOR_EQUIP_IRON, Items.IRON_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> IRONROGUE =
            register("ironrogue", "iron_rogue", SoundEvents.ARMOR_EQUIP_IRON, Items.IRON_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> IRONTANK =
            register("irontank", "iron_tank", SoundEvents.ARMOR_EQUIP_IRON, Items.IRON_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> IRONWARRIOR =
            register("ironwarrior", "iron_warrior", SoundEvents.ARMOR_EQUIP_IRON, Items.IRON_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NETHERITEMAGE =
            register("netheritemage", "netherite_mage", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NETHERITEROGUE =
            register("netheriterogue", "netherite_rogue", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NETHERITETANK =
            register("netheritetank", "netherite_tank", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NETHERITEWARRIOR =
            register("netheritewarrior", "netherite_warrior", SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT);

}
