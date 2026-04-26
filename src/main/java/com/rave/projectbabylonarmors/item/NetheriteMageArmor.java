package com.rave.projectbabylonarmors.item;


import com.rave.projectbabylonarmors.client.model.NetheriteMageHelmet;
import com.rave.projectbabylonarmors.client.model.NetheriteMageChestplate;
import com.rave.projectbabylonarmors.client.model.NetheriteMageLeggings;
import com.rave.projectbabylonarmors.client.model.NetheriteMageBoots;
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

public abstract class NetheriteMageArmor extends ProjectBabylonArmorItem {

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
            return SoundEvents.ARMOR_EQUIP_NETHERITE;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.NETHERITE_INGOT);
        }

        @Override
        public String getName() {
            return "netheritemage";
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
    public NetheriteMageArmor(ArmorItem.Type type, Item.Properties properties) {
        super(MATERIAL, type, properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                return NetheriteMageArmor.buildArmorModel(slot, defaultModel);
            }
        });
    }

    @OnlyIn(Dist.CLIENT)
    private static HumanoidModel buildArmorModel(EquipmentSlot slot, HumanoidModel defaultModel) {
        ModelPart empty = new ModelPart(Collections.emptyList(), Collections.emptyMap());

        if (slot == EquipmentSlot.HEAD) {
            NetheriteMageHelmet model = new NetheriteMageHelmet(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(NetheriteMageHelmet.LAYER_LOCATION));
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
            NetheriteMageChestplate model = new NetheriteMageChestplate(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(NetheriteMageChestplate.LAYER_LOCATION));
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
            NetheriteMageLeggings model = new NetheriteMageLeggings(Minecraft.getInstance().getEntityModels()
                    .bakeLayer(NetheriteMageLeggings.LAYER_LOCATION));
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

        NetheriteMageBoots model = new NetheriteMageBoots(Minecraft.getInstance().getEntityModels()
                .bakeLayer(NetheriteMageBoots.LAYER_LOCATION));
        HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                Map.of(
                        "left_leg", model.Left_boot,
                        "right_leg", model.Right_boot,
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

    public static class Helmet extends NetheriteMageArmor {

        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/netherite_mage_hat.png";
        }

    }

    public static class Chestplate extends NetheriteMageArmor {

        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/netherite_mage_hood.png";
        }

    }

    public static class Leggings extends NetheriteMageArmor {

        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/netherite_mage_leggings.png";
        }

    }

    public static class Boots extends NetheriteMageArmor {

        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/netherite_mage_boots.png";
        }

    }

}



