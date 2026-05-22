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


public class DiamondMageChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_mage_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public DiamondMageChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -2.4F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 23).mirror().addBox(3.3F, 0.0F, -2.4F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(3, 23).addBox(-4.3F, 0.0F, -2.4F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 20)
                        .addBox(3.3F, 0.0F, -1.7F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 20).mirror().addBox(-4.3F, 0.0F, -1.7F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 59)
                        .addBox(-5.0F, -2.6F, 4.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-5.0F, -0.4F, 2.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(115, 90)
                        .addBox(-3.0F, 13.0F, 2.5F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.0F, -3.25F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
                CubeListBuilder.create().texOffs(52, 62).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 52).addBox(-9.0F, -2.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 1.3F, 0.3F, 0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-3.0F, -2.0F, 4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.525F, 1.4F, 0.05F, 0.0F, -1.5708F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(89, 30).addBox(-2.0F, -2.0F, 4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.525F, 1.4F, 0.05F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 14.2F, -3.1F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -2.8F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(81, 125).addBox(0.0F, 0.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.25F, 10.5F, 2.4F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(81, 125).mirror().addBox(-5.0F, 0.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.55F, 10.5F, 2.45F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.45F, 10.8F, -3.1F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.45F, 10.8F, -3.1F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
                CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(81, 125).mirror().addBox(-5.0F, 0.0F, 4.95F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.3F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
                CubeListBuilder.create().texOffs(81, 125).addBox(0.0F, 0.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 43).addBox(0.0F, 0.0F, -5.9F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.75F, 12.0F, 2.6F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, 14.2F, -2.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 96).addBox(-3.0F, 0.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.7F, 5.8F, -2.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 96).addBox(-3.0F, 0.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 5.8F, -2.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(107, 113).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.825F, 0.675F, -2.0F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(107, 113).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.825F, 0.675F, -2.0F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(21, 111).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 12.7F, 2.6F, 0.6109F, 0.0F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(102, 75).addBox(-0.7F, -2.7F, -0.6F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(109, 58).addBox(-0.7F, -2.7F, -2.4F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 113)
                        .addBox(-0.8F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 39).addBox(-0.8F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 27).mirror()
                        .addBox(-1.525F, -2.7F, -2.4F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(99, 98).mirror().addBox(-1.525F, -2.7F, -0.6F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(97, 107).mirror()
                .addBox(-1.0F, 0.0F, -3.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.625F, 4.275F, 1.475F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -0.175F, -1.45F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, 6.825F, -1.45F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(97, 107).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(97, 107).mirror()
                .addBox(-1.0F, 0.0F, 2.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.625F, -2.725F, -1.475F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(100, 39).mirror().addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.625F, 4.275F, -1.5F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(100, 39).mirror().addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.625F, -2.725F, -1.5F, 0.0F, 0.0F, -1.5708F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(102, 75).mirror().addBox(-3.3F, -2.7F, -0.6F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 58).mirror()
                        .addBox(-3.3F, -2.7F, -2.4F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 113).mirror().addBox(-3.2F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 39)
                        .mirror().addBox(-3.2F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 27).addBox(0.525F, -2.7F, -2.4F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 98)
                        .addBox(0.525F, -2.7F, -0.6F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24",
                CubeListBuilder.create().texOffs(97, 107).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 107).addBox(0.0F, 0.0F, -3.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.625F, 4.275F, 1.475F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(98, 68).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -0.175F, -1.45F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 68).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, 6.825F, -1.45F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27",
                CubeListBuilder.create().texOffs(97, 107).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 107).addBox(0.0F, 0.0F, 2.95F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.625F, -2.725F, -1.475F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(100, 39).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.625F, 4.275F, -1.5F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r29 = RightArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(100, 39).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.625F, -2.725F, -1.5F, 0.0F, 0.0F, 1.5708F));
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
