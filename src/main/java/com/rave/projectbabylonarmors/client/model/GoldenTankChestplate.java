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


public class GoldenTankChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "golden_tank_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public GoldenTankChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 16)
                        .addBox(-3.2F, 9.1F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 16).mirror().addBox(0.2F, 9.1F, -2.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 77)
                        .addBox(3.1F, 1.8F, -2.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 32).addBox(-1.5F, -0.6F, -3.15F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77)
                        .addBox(-4.1F, 1.8F, -2.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77).addBox(-4.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77)
                        .addBox(3.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 88).addBox(-2.025F, 9.2F, 1.725F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
                        .addBox(-3.5F, 0.5F, 1.625F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(-3.5F, 5.5F, 1.625F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 77)
                        .addBox(-0.5F, 6.2F, -3.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.0F, 2.5F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90)
                        .addBox(-3.0F, 13.0F, -3.65F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 41)
                .addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6F, 1.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 0).addBox(-4.0F, -2.0F, 4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.4F, 6.9F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 1.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
                CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).addBox(-5.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.7F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 14.2F, -3.4F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -3.1F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
                CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).mirror().addBox(0.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.75F, 12.0F, -3.7F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(99, 114).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.95F, -2.3F, 3.7F, 0.5394F, -0.1848F, 1.8686F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(35, 100).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.85F, -3.4F, 6.7F, 0.5236F, 0.2291F, 1.1961F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 92).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.95F, 0.1F, 6.2F, 0.2391F, 0.5194F, 0.4565F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 112).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.95F, 8.9F, 4.2F, -0.263F, -0.5086F, 0.5051F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 112).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.95F, 8.9F, 4.2F, -0.263F, 0.5086F, -0.5051F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 124).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.95F, 1.9F, 4.2F, -0.083F, 0.5618F, -0.1548F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 105).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-13.95F, -5.3F, 9.3F, 0.2391F, 0.5194F, 0.4565F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 105).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.95F, -5.3F, 9.3F, 0.2391F, -0.5194F, -0.4565F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 114).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-12.95F, 0.7F, 8.7F, -0.2391F, 0.5194F, -0.4565F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 114).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.95F, 0.7F, 8.7F, -0.2391F, -0.5194F, 0.4565F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(99, 114).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.95F, -2.3F, 3.7F, 0.5394F, 0.1848F, -1.8686F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 4.675F, -3.4F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 4.675F, -3.4F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 2.675F, -3.4F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 100).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.85F, -3.4F, 6.7F, 0.5236F, -0.2291F, -1.1961F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 92).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.95F, 0.1F, 6.2F, 0.2391F, -0.5194F, -0.4565F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 124).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.95F, 1.9F, 4.2F, -0.083F, -0.5618F, 0.1548F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.25F, 9.5F, 1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.25F, 9.5F, 1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(4, 78).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 11.275F, -1.425F, -0.0602F, -0.0362F, -0.9407F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(4, 78).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.375F, 11.275F, -1.425F, -0.0602F, 0.0362F, 0.9407F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 17).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 2.3F, -3.0F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(66, 59).addBox(0.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 2.3F, -3.0F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 2.675F, -3.4F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 3).addBox(-3.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3F, 1.4F, -6.0F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(0.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.3F, 1.4F, -6.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.8F, 11.2F, -2.5F, 0.0F, -0.3491F, 0.0F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 6).addBox(-4.0F, -5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.8F, 11.2F, -2.5F, 0.0F, 0.3491F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 39).addBox(-0.7F, -2.0F, -2.3F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
                .addBox(-0.7F, -2.0F, -0.7F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 26).addBox(-1.25F, 3.1F, -2.475F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r36 = LeftArm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 105).addBox(-3.0F, -2.0F, 1.0F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 1.1F, -3.5F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r37 = LeftArm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(100, 65).addBox(-1.0F, -2.0F, 1.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3F, -0.4F, -3.5F, 0.0F, 0.0F, -1.2654F));
        PartDefinition cube_r38 = LeftArm.addOrReplaceChild("cube_r38",
                CubeListBuilder.create().texOffs(30, 31).addBox(-2.0F, -3.0F, -4.0F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 31).addBox(-2.0F, -3.0F, -5.85F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.725F, -0.975F, 3.425F, 0.0F, 0.0F, -2.3998F));
        PartDefinition cube_r39 = LeftArm.addOrReplaceChild("cube_r39",
                CubeListBuilder.create().texOffs(50, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 69).addBox(-2.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 1.0F, 2.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-3.3F, -2.0F, -2.3F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 54).mirror()
                        .addBox(-3.3F, -2.0F, -0.7F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 26).mirror().addBox(-3.75F, 3.1F, -2.475F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r40 = RightArm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 105).mirror().addBox(-5.0F, -2.0F, 1.0F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.1F, 1.1F, -3.5F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r41 = RightArm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(100, 65).mirror().addBox(-5.0F, -2.0F, 1.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.3F, -0.4F, -3.5F, 0.0F, 0.0F, 1.2654F));
        PartDefinition cube_r42 = RightArm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(30, 31).mirror().addBox(-5.0F, -3.0F, -4.0F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 31).mirror()
                .addBox(-5.0F, -3.0F, -5.85F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.725F, -0.975F, 3.425F, 0.0F, 0.0F, 2.3998F));
        PartDefinition cube_r43 = RightArm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 69).mirror()
                .addBox(-1.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 2.6F, 0.0F, 0.0F, -0.7854F));
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
