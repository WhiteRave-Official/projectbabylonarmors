package com.rave.projectbabylonarmors.client.geo.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.rave.projectbabylonarmors.client.geo.model.PBAFixedGeoArmorModel;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.cache.object.GeoCube;
import software.bernie.geckolib.cache.object.GeoQuad;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.RenderUtils;

public abstract class PBAGeoArmorRenderer<T extends Item & GeoItem> extends GeoArmorRenderer<T> implements PBAGeoArmorBoneBridge {
    private boolean runtimeFaceCullingSuppressed;

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
        ResourceLocation modelLocation = getFixedArmorModel().getFixedModelResource();
        ResourceLocation textureLocation = getFixedArmorModel().getFixedTextureResource();        BakedGeoModel bakedModel = this.getGeoModel().getBakedModel(modelLocation);
        if (bakedModel == null) {            return null;
        }

        this.grabRelevantBones(bakedModel);
        resetBoneRotations();        return bakedModel;
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

    void setRuntimeFaceCullingSuppressed(boolean suppressed) {
        this.runtimeFaceCullingSuppressed = suppressed;
    }

    @Override
    public void renderCubesOfBone(PoseStack poseStack, GeoBone bone, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        if (bone.isHidden()) {
            return;
        }

        String boneName = bone.getName();
        for (GeoCube cube : bone.getCubes()) {
            poseStack.pushPose();
            RenderUtils.translateToPivotPoint(poseStack, cube);
            RenderUtils.rotateMatrixAroundCube(poseStack, cube);
            RenderUtils.translateAwayFromPivotPoint(poseStack, cube);
            Matrix3f normalisedPoseState = poseStack.last().normal();
            Matrix4f poseState = poseStack.last().pose();

            for (GeoQuad quad : cube.quads()) {
                if (quad == null || (!this.runtimeFaceCullingSuppressed && PBAGeoArmorRenderCullingHelper.shouldCullQuad(boneName, cube, quad, bone.getCubes()))) {
                    continue;
                }

                Vector3f normal = normalisedPoseState.transform(new Vector3f(quad.normal()));
                RenderUtils.fixInvertedFlatCube(cube, normal);
                this.createVerticesOfQuad(quad, poseState, normal, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            }

            poseStack.popPose();
        }
    }

    @Override
    public void prepareForEpicFightBake() {        resetBoneRotations();    }

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
