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

public class IronTankChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_tank_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public IronTankChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -1.8F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 77).addBox(3.1F, 1.1F, 1.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77).mirror()
                        .addBox(-4.1F, 1.1F, 1.7F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 108).addBox(-0.725F, 8.9F, 1.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 108).mirror()
                        .addBox(-1.275F, 8.9F, 1.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 109).addBox(-3.5F, 0.5F, 1.325F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
                        .addBox(-3.5F, 5.5F, 1.325F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109).addBox(-3.5F, 4.15F, -2.625F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 112)
                        .addBox(-3.5F, 5.15F, -2.625F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(-3.5F, 7.125F, -2.625F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77)
                        .addBox(-3.8F, 0.3F, -2.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 85).mirror().addBox(-0.9F, 0.4F, 1.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 85)
                        .addBox(-4.1F, 0.4F, 1.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77).mirror().addBox(2.8F, 0.3F, -2.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 88)
                        .addBox(-0.025F, 9.1F, -2.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 88).mirror().addBox(-0.975F, 9.1F, -2.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 90)
                        .addBox(-3.0F, 13.0F, 2.5F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.0F, -3.65F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 3).addBox(-3.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 0.4F, -6.0F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6F, 0.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(87, 8).addBox(-2.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, 1.825F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 0).addBox(-4.0F, -2.0F, 4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4F, 6.9F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
                CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).addBox(-5.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.7F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -3.1F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
                CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).mirror().addBox(0.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.75F, 12.0F, -3.7F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 32).addBox(0.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3F, 0.4F, -6.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.25F, 9.4F, -1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.25F, 9.4F, -1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 9.2F, 1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 9.2F, 1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 1.7F, -2.8F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 1.7F, -2.8F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 2.0F, -2.2F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, -1.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 2.0F, -2.2F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(40, 37).addBox(-0.8F, -2.0F, -1.7F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 40).addBox(-0.8F, -2.0F, -2.4F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 102)
                        .addBox(-0.5F, -1.675F, -3.475F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 26).addBox(2.65F, 8.3F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 68)
                        .addBox(2.65F, 5.3F, -2.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 74).addBox(-1.35F, 8.3F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 85)
                        .addBox(-1.25F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 43).addBox(-1.45F, 5.3F, -2.475F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 43)
                        .addBox(-1.45F, 5.3F, -0.6F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 22).addBox(-1.25F, 5.3F, 1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 74)
                        .addBox(-0.55F, 8.3F, 1.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 51).addBox(2.65F, 5.3F, 1.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 33)
                        .addBox(0.25F, 5.3F, -2.6F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 33).addBox(0.25F, 5.3F, -0.4F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(88, 28).addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.425F, -0.225F, -2.85F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(39, 102).addBox(-4.0F, -1.0F, -1.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.5F, -3.125F, -2.475F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(39, 102).addBox(-4.0F, 0.0F, -1.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.5F, 0.625F, -2.475F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 28).addBox(-4.0F, -2.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.425F, -2.15F, -2.875F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22",
                CubeListBuilder.create().texOffs(50, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 69).addBox(-2.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 1.0F, 2.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23",
                CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.9F, 7.0F, 1.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-3.2F, -2.0F, -1.7F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 40).mirror()
                        .addBox(-3.2F, -2.0F, -2.4F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 102).mirror().addBox(-5.5F, -1.675F, -3.475F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 26)
                        .mirror().addBox(-3.65F, 8.3F, -2.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 68).mirror().addBox(-3.65F, 5.3F, -2.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 74)
                        .mirror().addBox(-2.65F, 8.3F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 85).mirror().addBox(-2.75F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 43)
                        .mirror().addBox(0.45F, 5.3F, -2.475F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 43).mirror().addBox(0.45F, 5.3F, -0.6F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 22)
                        .mirror().addBox(0.25F, 5.3F, 1.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 74).mirror().addBox(-3.45F, 8.3F, 1.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 51)
                        .mirror().addBox(-3.65F, 5.3F, 1.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 33).mirror().addBox(-4.25F, 5.3F, -2.6F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 33)
                        .mirror().addBox(-4.25F, 5.3F, -0.4F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.425F, -0.225F, -2.85F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 102).mirror().addBox(-2.0F, -1.0F, -1.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.5F, -3.125F, -2.475F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(39, 102).mirror().addBox(-2.0F, 0.0F, -1.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.5F, 0.625F, -2.475F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(25, 28).mirror().addBox(-1.0F, -2.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.425F, -2.15F, -2.875F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 69).mirror()
                .addBox(-1.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 2.6F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r29 = RightArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 73).mirror()
                .addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 7.0F, 1.9F, 0.0F, 0.0F, -0.7854F));
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
