package com.rave.projectbabylonarmors.item;


import com.rave.projectbabylonarmors.client.model.EtherealTankHelmet;
import com.rave.projectbabylonarmors.client.model.EtherealTankChestplate;
import com.rave.projectbabylonarmors.client.model.EtherealTankLeggings;
import com.rave.projectbabylonarmors.client.model.EtherealTankBoots;
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

public abstract class EtherealTankArmor extends ProjectBabylonArmorItem {

    private static final ArmorMaterial MATERIAL = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 15;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 9;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.DIAMOND);
        }

        @Override
        public String getName() {
            return "etherealtank";
        }

        @Override
        public float getToughness() {
            return 0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0f;
        }
    };
    public EtherealTankArmor(ArmorItem.Type type, Item.Properties properties) {
        super(MATERIAL, type, properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                return EtherealTankArmor.buildArmorModel(slot, defaultModel);
            }
        });
    }

    @OnlyIn(Dist.CLIENT)
    private static HumanoidModel buildArmorModel(EquipmentSlot slot, HumanoidModel defaultModel) {
        ModelPart empty = new ModelPart(Collections.emptyList(), Collections.emptyMap());

        if (slot == EquipmentSlot.HEAD) {
            EtherealTankHelmet model = new EtherealTankHelmet(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(EtherealTankHelmet.LAYER_LOCATION));
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
            EtherealTankChestplate model = new EtherealTankChestplate(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(EtherealTankChestplate.LAYER_LOCATION));
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
            EtherealTankLeggings model = new EtherealTankLeggings(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(EtherealTankLeggings.LAYER_LOCATION));
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

        EtherealTankBoots model = new EtherealTankBoots(Minecraft.getInstance().getEntityModels()
                .bakeLayer(EtherealTankBoots.LAYER_LOCATION));
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

    public static class Helmet extends EtherealTankArmor {

        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ethereal_tank_helmet.png";
        }

    }

    public static class Chestplate extends EtherealTankArmor {

        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ethereal_tank_chestplate.png";
        }

    }

    public static class Leggings extends EtherealTankArmor {

        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ethereal_tank_leggings.png";
        }

    }

    public static class Boots extends EtherealTankArmor {

        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ethereal_tank_boots.png";
        }

    }

}



