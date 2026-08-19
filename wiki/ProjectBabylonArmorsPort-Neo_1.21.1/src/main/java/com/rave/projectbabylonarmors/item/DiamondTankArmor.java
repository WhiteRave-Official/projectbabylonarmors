package com.rave.projectbabylonarmors.item;

import com.rave.projectbabylonarmors.client.geo.renderer.DiamondTankGeoRenderers;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorRenderer;
import com.rave.projectbabylonarmors.init.PBArmorMaterials;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public abstract class DiamondTankArmor extends ProjectBabylonArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public DiamondTankArmor(ArmorItem.Type type, Item.Properties properties) {
        super("diamond_tank", PBArmorMaterials.DIAMONDTANK, type, properties);
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
                PBAGeoArmorRenderer<?> renderer = DiamondTankGeoRenderers.getRendererForStack(stack);
                if (renderer == null) {
                    return defaultModel;
                }

                renderer.prepForRender(living, stack, slot, defaultModel);
                return renderer;
            }
        });
    }

    public static class Helmet extends DiamondTankArmor {
        public Helmet() {
            super(ArmorItem.Type.HELMET, new Item.Properties());
        }

        @Override
        public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
            return ResourceLocation.parse("project_babylon_armors:textures/entities/diamond_tank_helmet.png");
        }
    }

    public static class Chestplate extends DiamondTankArmor {
        public Chestplate() {
            super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
        }

        @Override
        public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
            return ResourceLocation.parse("project_babylon_armors:textures/entities/diamond_tank_chestplate.png");
        }
    }

    public static class Leggings extends DiamondTankArmor {
        public Leggings() {
            super(ArmorItem.Type.LEGGINGS, new Item.Properties());
        }

        @Override
        public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
            return ResourceLocation.parse("project_babylon_armors:textures/entities/diamond_tank_leggings.png");
        }
    }

    public static class Boots extends DiamondTankArmor {
        public Boots() {
            super(ArmorItem.Type.BOOTS, new Item.Properties());
        }

        @Override
        public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
            return ResourceLocation.parse("project_babylon_armors:textures/entities/diamond_tank_boots.png");
        }
    }
}
