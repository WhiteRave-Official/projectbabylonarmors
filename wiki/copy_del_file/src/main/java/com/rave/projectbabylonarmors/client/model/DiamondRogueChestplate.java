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


public class DiamondRogueChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_rogue_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public DiamondRogueChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -1.8F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -2.2F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
                        .addBox(-5.0F, -2.6F, 5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-5.0F, -0.4F, 2.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 86)
                        .addBox(-4.1F, 0.5F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 86).mirror().addBox(3.1F, 0.5F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 75)
                        .addBox(3.1F, 0.4F, 1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 75).mirror().addBox(-4.1F, 0.4F, 1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 88)
                        .addBox(-2.025F, 6.5F, 1.725F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109).addBox(-3.5F, -0.2F, 1.625F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
                        .addBox(-3.5F, 2.8F, 1.475F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 77).addBox(-0.5F, -0.1F, -3.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 91)
                        .addBox(-0.5F, -0.6F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.0F, 2.9F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90)
                        .addBox(-3.0F, 13.0F, -3.15F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 5).addBox(-6.0F, -2.6F, 4.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 106)
                        .addBox(-8.0F, -1.3F, 3.5F, 7.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 103).addBox(-8.0F, -1.3F, 0.5F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
                CubeListBuilder.create().texOffs(52, 62).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 52).addBox(-11.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, 1.3F, 0.3F, 0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 3).addBox(-3.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, 1.4F, -7.1F, 0.0F, 0.3491F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-1.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.9F, 1.4F, -7.1F, 0.0F, -0.3491F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 41).mirror().addBox(-2.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.6F, 1.4F, 0.8F, 0.0F, -1.8762F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 41).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6F, 1.4F, 0.8F, 0.0F, 1.8762F, 0.0F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 14.2F, -3.4F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -3.1F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
                CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 124).mirror().addBox(-5.0F, 0.0F, 4.2F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.2F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
                CubeListBuilder.create().texOffs(80, 124).addBox(0.0F, 0.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 43).addBox(0.0F, 0.0F, -6.2F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.75F, 12.0F, 3.0F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, 14.2F, -2.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.25F, 6.8F, 1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.25F, 6.8F, 1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 78).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.375F, 6.975F, -1.525F, -0.0602F, 0.0362F, 0.9407F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 78).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 6.975F, -1.525F, -0.0602F, -0.0362F, -0.9407F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(1.0F, -7.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.8F, 6.9F, -2.6F, 0.0F, -0.3491F, 0.0F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 6).addBox(-4.0F, -7.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.8F, 6.9F, -2.6F, 0.0F, 0.3491F, 0.0F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
                CubeListBuilder.create().texOffs(66, 10).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 66).addBox(-8.95F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.975F, 2.3F, 1.3F, 0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(101, 32).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 12.7F, 2.6F, 0.6109F, 0.0F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(86, 98).addBox(-0.8F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 39).addBox(-0.8F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 113)
                        .addBox(-1.5F, 8.4F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 45).addBox(-1.05F, -1.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 43)
                        .addBox(-1.45F, 5.3F, -0.675F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 26).addBox(2.45F, 8.3F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 51)
                        .addBox(2.45F, 5.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 68).addBox(2.45F, 5.3F, -2.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 43)
                        .addBox(-1.45F, 5.3F, -2.3F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(91, 90).addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -3.6F, 3.175F, 1.0865F, 0.2618F, 0.0F));
        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 83).addBox(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.425F, -3.6F, 5.125F, 1.4399F, 0.2618F, 0.0F));
        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 9).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.25F, -0.4F, 4.1F, 1.0008F, 0.2939F, 0.0015F));
        PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 93).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.675F, 1.25F, 2.325F, 0.4524F, 0.2794F, -0.0114F));
        PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(33, 93).addBox(0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.15F, 0.2F, 0.325F, 0.1469F, 0.2794F, -0.0114F));
        PartDefinition cube_r24 = LeftArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 57).addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.425F, -3.75F, 4.975F, 2.0508F, 0.2618F, 0.0F));
        PartDefinition cube_r25 = LeftArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 122).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.8F, -1.45F, 2.55F, 0.6954F, 0.2939F, 0.0015F));
        PartDefinition cube_r26 = LeftArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(24, 28).addBox(-5.0F, -2.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.6F, -1.8F, -2.9F, 0.0F, 0.0F, -0.3229F));
        PartDefinition cube_r27 = LeftArm.addOrReplaceChild("cube_r27",
                CubeListBuilder.create().texOffs(50, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 69).addBox(-2.0F, -3.0F, 4.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 1.0F, -2.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28",
                CubeListBuilder.create().texOffs(74, 33).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 33).addBox(-4.0F, 0.0F, 1.8F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.25F, 5.3F, -2.4F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29",
                CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.0F, -2.0F, 3.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 6.4F, -1.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r30 = LeftArm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 8.8F, -0.8F, -1.5708F, -0.7854F, 1.5708F));
        PartDefinition cube_r31 = LeftArm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(116, 103).addBox(0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 3.25F, 3.625F, 1.2654F, 0.2618F, 0.0F));
        PartDefinition cube_r32 = LeftArm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 63).addBox(1.0F, -4.0F, 1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.025F, -2.55F, 3.675F, 1.309F, 0.2618F, 0.0F));
        PartDefinition cube_r33 = LeftArm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(100, 124).addBox(0.0F, -4.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, 2.2F, -1.575F, 0.0073F, 0.2778F, -0.0135F));
        PartDefinition cube_r34 = LeftArm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 124).addBox(0.0F, -4.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.15F, 0.0F, -3.075F, -0.2981F, 0.2778F, -0.0135F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-3.2F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 98).mirror()
                        .addBox(-3.2F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 102).mirror().addBox(-3.65F, -3.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
