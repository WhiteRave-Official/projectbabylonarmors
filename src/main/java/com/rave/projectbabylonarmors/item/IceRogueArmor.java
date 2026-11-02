package com.rave.projectbabylonarmors.item;

import com.rave.projectbabylonarmors.client.geo.renderer.IceRogueGeoRenderers;
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

public abstract class IceRogueArmor extends ProjectBabylonArmorItem implements GeoItem {
    private static final ArmorMaterial MATERIAL = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 73;
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
            return SoundEvents.ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.DIAMOND);
        }

        @Override
        public String getName() {
            return "icerogue";
        }

        @Override
        public float getToughness() {
            return 2f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0f;
        }
    };

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public IceRogueArmor(ArmorItem.Type type, Item.Properties properties) {
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
                PBAGeoArmorRenderer<?> renderer = IceRogueGeoRenderers.getRendererForStack(stack);
                if (renderer == null) {
                    return defaultModel;
                }

                renderer.prepForRender(living, stack, slot, defaultModel);
                return renderer;
            }
        });
    }

    public static class Helmet extends IceRogueArmor {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ice_rogue_helmet.png";
        }
    }

    public static class Chestplate extends IceRogueArmor {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ice_rogue_chestplate.png";
        }
    }

    public static class Leggings extends IceRogueArmor {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ice_rogue_leggings.png";
        }
    }

    public static class Boots extends IceRogueArmor {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "project_babylon_armors:textures/entities/ice_rogue_boots.png";
        }
    }
}
