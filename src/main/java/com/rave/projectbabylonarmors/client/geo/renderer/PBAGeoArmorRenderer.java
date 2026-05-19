package com.rave.projectbabylonarmors.client.geo.renderer;

import com.rave.projectbabylonarmors.client.geo.model.PBAFixedGeoArmorModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public abstract class PBAGeoArmorRenderer<T extends Item & GeoItem> extends GeoArmorRenderer<T> implements PBAGeoArmorBoneBridge {
    protected PBAGeoArmorRenderer(GeoModel<T> model) {
        super(model);
    }

    @Override
    protected void grabRelevantBones(BakedGeoModel bakedModel) {
        super.grabRelevantBones(bakedModel);
        this.head = bakedModel.getBone("Head").orElse(this.head);
        this.body = bakedModel.getBone("Body").orElse(this.body);
        this.rightArm = bakedModel.getBone("RightArm").orElse(this.rightArm);
        this.leftArm = bakedModel.getBone("LeftArm").orElse(this.leftArm);
        this.rightLeg = bakedModel.getBone("RightLeg").orElse(this.rightLeg);
        this.leftLeg = bakedModel.getBone("LeftLeg").orElse(this.leftLeg);
        this.rightBoot = bakedModel.getBone("RightBoot").orElse(null);
        this.leftBoot = bakedModel.getBone("LeftBoot").orElse(null);
        remapSlotBones();
    }

    @SuppressWarnings("unchecked")
    private PBAFixedGeoArmorModel<T> getFixedArmorModel() {
        return (PBAFixedGeoArmorModel<T>) this.getGeoModel();
    }

    public BakedGeoModel getEpicFightBakedModel() {
        BakedGeoModel bakedModel = this.getGeoModel().getBakedModel(getFixedArmorModel().getFixedModelResource());
        this.grabRelevantBones(bakedModel);
        resetBoneRotations();
        return bakedModel;
    }

    public ResourceLocation getEpicFightTextureLocation() {
        return getFixedArmorModel().getFixedTextureResource();
    }

    public GeoBone getHeadBone() {
        return this.head;
    }

    public GeoBone getBodyBone() {
        return this.body;
    }

    public GeoBone getRightArmBone() {
        return this.rightArm;
    }

    public GeoBone getLeftArmBone() {
        return this.leftArm;
    }

    public GeoBone getRightLegBone() {
        return this.rightLeg;
    }

    public GeoBone getLeftLegBone() {
        return this.leftLeg;
    }

    public GeoBone getRightBootBone() {
        return this.rightBoot;
    }

    public GeoBone getLeftBootBone() {
        return this.leftBoot;
    }

    protected void remapSlotBones() {
    }

    @Override
    public void prepareForEpicFightBake() {
        resetBoneRotations();
    }

    private void resetBoneRotations() {
        resetBone(this.head);
        resetBone(this.body);
        resetBone(this.rightArm);
        resetBone(this.leftArm);
        resetBone(this.rightLeg);
        resetBone(this.leftLeg);
        resetBone(this.rightBoot);
        resetBone(this.leftBoot);
    }

    private static void resetBone(GeoBone bone) {
        if (bone == null) {
            return;
        }

        bone.setRotX(0.0F);
        bone.setRotY(0.0F);
        bone.setRotZ(0.0F);
    }
}
