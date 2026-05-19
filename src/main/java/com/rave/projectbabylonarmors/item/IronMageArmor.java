package com.rave.projectbabylonarmors.item;

import com.rave.projectbabylonarmors.client.geo.renderer.IronMageGeoRenderers;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
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
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public abstract class IronMageArmor extends ProjectBabylonArmorItem implements GeoItem {
    private static final ArmorMaterial MATERIAL = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 39;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return new int[]{1, 3, 4, 1}[type.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 9;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_IRON;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.IRON_INGOT);
        }

        @Override
        public String getName() {
            return "ironmage";
        }

        @Override
        public float getToughness() {
            return 0.25f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0f;
        }
    };

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public IronMageArmor(ArmorItem.Type type, Item.Properties properties) {
        super(MATERIAL, type, properties);
    }

    @Override
    protected double getMagicArmorBonus() {
        return 0.5D;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel<?> defaultModel) {
                PBAGeoArmorRenderer<?> renderer = IronMageGeoRenderers.getRendererForStack(stack);
                if (renderer == null) {
                    return defaultModel;
                }

                renderer.prepForRender(living, stack, slot, defaultModel);
                return renderer;
            }
        });
    }

    public static class Helmet extends IronMageArmor {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/iron_mage_hat.png";
        }
    }

    public static class Chestplate extends IronMageArmor {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/iron_mage_chestplate.png";
        }
    }

    public static class Leggings extends IronMageArmor {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/iron_mage_leggings.png";
        }
    }

    public static class Boots extends IronMageArmor {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/iron_mage_boots.png";
        }
    }
}
