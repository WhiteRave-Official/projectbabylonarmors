package com.rave.projectbabylonarmors.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;


public class NetheriteTankBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_tank_boots"), "main");
    public final ModelPart Right_boot;
    public final ModelPart Left_boot;

    public NetheriteTankBoots(ModelPart root) {
        this.Right_boot = root.getChild("Right_boot");
        this.Left_boot = root.getChild("Left_boot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Right_boot = partdefinition.addOrReplaceChild("Right_boot", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.95F, 10.1F, 3.3131F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-2.15F, 14.0F, -0.8881F));
        PartDefinition cube_r1 = Right_boot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 32).mirror().addBox(-3.0F, -8.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.05F, 11.6F, 2.3881F, -0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Right_boot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 32).mirror().addBox(-2.0F, -14.0F, 0.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.55F, 10.9F, -10.3119F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Right_boot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 15).mirror().addBox(-3.0F, -8.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 2).mirror()
                .addBox(-7.0F, -8.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.55F, 11.5F, -5.0369F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r4 = Right_boot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 40).mirror().addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.775F, 11.95F, -3.8619F, -0.2921F, -0.7203F, 0.1958F));
        PartDefinition cube_r5 = Right_boot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, -4.0F, -1.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.975F, 12.125F, -1.0619F, -3.1369F, -1.5282F, -3.1369F));
        PartDefinition cube_r6 = Right_boot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9F, 6.5F, -1.0869F, -3.1369F, -1.5282F, -3.1369F));
        PartDefinition cube_r7 = Right_boot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.0F, 6.5F, -1.0869F, -3.1369F, 1.5282F, 3.1369F));
        PartDefinition cube_r8 = Right_boot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 26).mirror().addBox(-5.0F, -4.0F, -1.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 12.125F, -1.0619F, -3.1369F, 1.5282F, 3.1369F));
        PartDefinition cube_r9 = Right_boot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 38).mirror().addBox(-2.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.875F, 11.95F, -3.8619F, -0.2921F, 0.7203F, -0.1958F));
        PartDefinition cube_r10 = Right_boot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, 11.75F, -4.9119F, -0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r11 = Right_boot.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.05F, 10.55F, 4.4381F, 0.48F, 0.0F, 0.0F));
        PartDefinition cube_r12 = Right_boot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 12).mirror().addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, 6.039F, -2.0972F, 0.48F, 0.0F, 0.0F));
        PartDefinition cube_r13 = Right_boot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-3.0F, -4.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, 9.8F, -4.4119F, -0.9163F, 0.0F, 0.0F));
        PartDefinition Left_boot = partdefinition.addOrReplaceChild("Left_boot", CubeListBuilder.create().texOffs(40, 40).addBox(-2.05F, 10.1F, 3.3131F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.15F, 14.0F, -0.8881F));
        PartDefinition cube_r14 = Left_boot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(18, 32).addBox(-1.0F, -8.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.05F, 11.6F, 2.3881F, -0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r15 = Left_boot.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(31, 32).addBox(-1.0F, -14.0F, 0.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.55F, 10.9F, -10.3119F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r16 = Left_boot.addOrReplaceChild("cube_r16",
                CubeListBuilder.create().texOffs(18, 15).addBox(2.0F, -8.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 2).addBox(6.0F, -8.0F, -6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.55F, 11.5F, -5.0369F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r17 = Left_boot.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 40).addBox(-2.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.775F, 11.95F, -3.8619F, -0.2921F, 0.7203F, -0.1958F));
        PartDefinition cube_r18 = Left_boot.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -4.0F, -1.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.975F, 12.125F, -1.0619F, -3.1369F, 1.5282F, 3.1369F));
        PartDefinition cube_r19 = Left_boot.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 27).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9F, 6.5F, -1.0869F, -3.1369F, 1.5282F, 3.1369F));
        PartDefinition cube_r20 = Left_boot.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 6.5F, -1.0869F, -3.1369F, -1.5282F, -3.1369F));
        PartDefinition cube_r21 = Left_boot.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(16, 26).addBox(-2.0F, -4.0F, -1.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 12.125F, -1.0619F, -3.1369F, -1.5282F, -3.1369F));
        PartDefinition cube_r22 = Left_boot.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1, 38).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.875F, 11.95F, -3.8619F, -0.2921F, -0.7203F, 0.1958F));
        PartDefinition cube_r23 = Left_boot.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 6).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 11.75F, -4.9119F, -0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r24 = Left_boot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(34, 18).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.05F, 10.55F, 4.4381F, 0.48F, 0.0F, 0.0F));
        PartDefinition cube_r25 = Left_boot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 12).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 6.039F, -2.0972F, 0.48F, 0.0F, 0.0F));
        PartDefinition cube_r26 = Left_boot.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 9.8F, -4.4119F, -0.9163F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
