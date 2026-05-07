package com.rave.projectbabylonarmors.item;


import com.rave.projectbabylonarmors.client.model.GoldenTankHelmet;
import com.rave.projectbabylonarmors.client.model.GoldenTankChestplate;
import com.rave.projectbabylonarmors.client.model.GoldenTankLeggings;
import com.rave.projectbabylonarmors.client.model.GoldenTankBoots;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;

public abstract class GoldenTankArmor extends ProjectBabylonArmorItem {

    private static final ArmorMaterial MATERIAL = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 100;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return new int[]{3, 6, 8, 3}[type.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 9;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GOLD;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.GOLD_INGOT);
        }

        @Override
        public String getName() {
            return "goldentank";
        }

        @Override
        public float getToughness() {
            return 3f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.0f;
        }
    };
    public GoldenTankArmor(ArmorItem.Type type, Item.Properties properties) {
        super(MATERIAL, type, properties);
    }
    @Override
    protected double getMagicArmorBonus() {
        return 2.5D;
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                return GoldenTankArmor.buildArmorModel(slot, defaultModel);
            }
        });
    }

    @OnlyIn(Dist.CLIENT)
    private static HumanoidModel buildArmorModel(EquipmentSlot slot, HumanoidModel defaultModel) {
        ModelPart empty = new ModelPart(Collections.emptyList(), Collections.emptyMap());

        if (slot == EquipmentSlot.HEAD) {
            GoldenTankHelmet model = new GoldenTankHelmet(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(GoldenTankHelmet.LAYER_LOCATION));
            HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                    Map.of(
                            "head", model.Head,
                            "hat", empty,
                            "body", empty,
                            "right_arm", empty,
                            "left_arm", empty,
                            "right_leg", empty,
                            "left_leg", empty
                    )));
            armorModel.crouching = defaultModel.crouching;
            armorModel.riding = defaultModel.riding;
            armorModel.young = defaultModel.young;
            return armorModel;
        }

        if (slot == EquipmentSlot.CHEST) {
            GoldenTankChestplate model = new GoldenTankChestplate(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(GoldenTankChestplate.LAYER_LOCATION));
            HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                    Map.of(
                            "body", model.Body,
                            "left_arm", model.LeftArm,
                            "right_arm", model.RightArm,
                            "head", empty,
                            "hat", empty,
                            "right_leg", empty,
                            "left_leg", empty
                    )));
            armorModel.crouching = defaultModel.crouching;
            armorModel.riding = defaultModel.riding;
            armorModel.young = defaultModel.young;
            return armorModel;
        }

        if (slot == EquipmentSlot.LEGS) {
            GoldenTankLeggings model = new GoldenTankLeggings(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(GoldenTankLeggings.LAYER_LOCATION));
            HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                    Map.of(
                            "left_leg", model.LeftLeg,
                            "right_leg", model.RightLeg,
                            "head", empty,
                            "hat", empty,
                            "body", empty,
                            "right_arm", empty,
                            "left_arm", empty
                    )));
            armorModel.crouching = defaultModel.crouching;
            armorModel.riding = defaultModel.riding;
            armorModel.young = defaultModel.young;
            return armorModel;
        }

        GoldenTankBoots model = new GoldenTankBoots(Minecraft.getInstance().getEntityModels()
                .bakeLayer(GoldenTankBoots.LAYER_LOCATION));
        HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                Map.of(
                        "left_leg", model.LeftBoot,
                        "right_leg", model.RightBoot,
                        "head", empty,
                        "hat", empty,
                        "body", empty,
                        "right_arm", empty,
                        "left_arm", empty
                )));
        armorModel.crouching = defaultModel.crouching;
        armorModel.riding = defaultModel.riding;
        armorModel.young = defaultModel.young;
        return armorModel;
    }

    public static class Helmet extends GoldenTankArmor {

        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/golden_tank_helmet.png";
        }

    }

    public static class Chestplate extends GoldenTankArmor {

        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/golden_tank_chestplate.png";
        }

    }

    public static class Leggings extends GoldenTankArmor {

        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/golden_tank_leggings.png";
        }

    }

    public static class Boots extends GoldenTankArmor {

        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/golden_tank_boots.png";
        }

    }

}




