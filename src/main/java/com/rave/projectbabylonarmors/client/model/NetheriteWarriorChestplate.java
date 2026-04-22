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


public class NetheriteWarriorChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_warrior_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public NetheriteWarriorChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(15, 2).addBox(-2.075F, 13.9F, -4.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 2).addBox(-4.5F, 0.7F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 2).mirror()
                        .addBox(2.5F, 0.7F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 3).addBox(-3.975F, 0.7F, -1.75F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
                        .addBox(-3.975F, 0.7F, 0.65F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3).addBox(-4.2F, 0.7F, 0.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
                        .addBox(-4.0F, 0.7F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 108).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.95F, 11.55F, 0.325F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 123).mirror().addBox(-3.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.65F, 10.85F, 2.2F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 122).mirror().addBox(-1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.65F, 10.85F, 1.35F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 122).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.65F, 10.85F, 1.35F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 108).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.05F, 11.55F, 0.3F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 123).addBox(1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.65F, 10.85F, 2.2F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 109).addBox(1.0F, -3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.05F, 11.55F, 1.2F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 125).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.025F, 4.25F, 1.1F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(110, 96).addBox(-1.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1F, 1.275F, -0.2F, -0.4743F, -0.6408F, 0.7257F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(112, 90).addBox(1.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.075F, 1.05F, -2.15F, 0.0175F, -0.7767F, -0.0087F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 100).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.075F, 1.05F, -2.15F, 0.0175F, 0.7767F, 0.0087F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(110, 98).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, 1.275F, -0.2F, -0.4743F, 0.6408F, -0.7257F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 13).addBox(1.0F, -4.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.8F, 9.825F, -2.4F, 0.0F, 0.0F, 0.8814F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-3.0F, -4.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.65F, 9.825F, -2.4F, 0.0F, 0.0F, -0.8814F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 13).mirror().addBox(-2.0F, -4.0F, 4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 13.25F, -2.4F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 51).addBox(-3.0F, -11.0F, 4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.85F, 11.725F, -2.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 33).mirror().addBox(-3.0F, -11.0F, 4.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.2F, 12.425F, -2.5F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(2.0F, -11.0F, 4.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.725F, 11.725F, -2.4F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 13).addBox(2.0F, -5.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.8F, 5.65F, -2.375F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-3.0F, -5.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.675F, 5.6F, -2.375F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 33).mirror().addBox(-3.0F, -5.0F, 4.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 125).mirror()
                .addBox(-3.0F, -5.0F, -0.225F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 5.65F, -2.375F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 125).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 5.65F, 2.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(122, 80).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 5.65F, 1.525F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(121, 83).addBox(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 5.65F, 0.05F, 0.0F, 1.5621F, 0.0087F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(19, 17).addBox(-1.0F, -5.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.35F, 7.575F, -1.725F, 0.0F, 0.829F, 0.0087F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(121, 42).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3F, 7.575F, -0.05F, 0.0F, -1.5621F, 0.0087F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(122, 25).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.35F, 7.575F, 1.525F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(122, 0).addBox(1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.35F, 7.575F, 2.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(122, 0).mirror().addBox(-3.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.35F, 7.575F, 2.4F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-1.0F, -5.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.35F, 7.575F, -1.725F, 0.0F, -0.829F, -0.0087F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(122, 25).mirror().addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.35F, 7.575F, 1.525F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(121, 42).mirror().addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.3F, 7.575F, -0.05F, 0.0F, 1.5621F, -0.0087F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(121, 83).mirror().addBox(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.1F, 5.65F, 0.05F, 0.0F, -1.5621F, -0.0087F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 5.65F, 1.525F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(122, 111).addBox(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 5.65F, -1.525F, 0.0F, 0.829F, 0.0087F));
        PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(122, 111).mirror().addBox(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 5.65F, -1.525F, 0.0F, -0.829F, -0.0087F));
        PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(62, 125).mirror().addBox(-3.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.275F, 3.35F, 6.125F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(121, 51).mirror().addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.25F, 3.35F, -1.075F, -3.1416F, 1.0908F, 3.1329F));
        PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(124, 74).mirror().addBox(0.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.35F, 3.35F, 0.35F, 0.0F, 1.5708F, -0.0087F));
        PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(121, 51).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.25F, 3.35F, -1.075F, -3.1416F, -1.0908F, -3.1329F));
        PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(124, 74).addBox(-1.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.35F, 3.35F, 0.35F, 0.0F, -1.5708F, 0.0087F));
        PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(104, 65).addBox(-1.0F, -5.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.075F, 3.35F, 0.5F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(71, 125).addBox(1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.975F, 3.35F, 6.125F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 125).addBox(1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.275F, 3.35F, 6.125F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(24, 112).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.075F, 3.35F, 1.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(76, 106).addBox(-3.0F, -5.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 3.35F, 0.525F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(110, 98).addBox(-2.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, 7.525F, -0.2F, 0.4743F, 0.6408F, 0.7257F));
        PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(38, 78).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 78).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 76).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 78).addBox(-6.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(10.075F, 12.075F, -0.925F, 0.0873F, -0.0004F, 0.0087F));
        PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 78).addBox(5.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.075F, 12.075F, -0.925F, 0.0873F, 0.0004F, -0.0087F));
        PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 0).addBox(-8.0F, -10.0F, 4.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.475F, 9.9F, -0.7F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(96, 49).addBox(-6.0F, -10.0F, 4.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 27.1F, 0.4F, 0.0873F, -0.0004F, 0.0087F));
        PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(44, 112).mirror().addBox(-4.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(11.775F, 23.25F, 0.075F, 0.0718F, 0.0497F, -0.6003F));
        PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(44, 112).addBox(2.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.775F, 23.25F, 0.075F, 0.0718F, -0.0497F, 0.6003F));
        PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(44, 58).addBox(0.0F, -5.0F, -5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 7.75F, -0.85F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 111).addBox(-1.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.375F, 2.05F, -0.425F, 0.0175F, -0.7767F, -0.0087F));
        PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(64, 111).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.225F, 2.05F, -0.275F, 0.0175F, 0.7767F, 0.0087F));
        PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 111).addBox(-2.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.225F, 6.75F, -0.275F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(56, 111).addBox(-1.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 2.05F, -0.825F, 0.0175F, -0.7767F, -0.0087F));
        PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 74).addBox(-1.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 3.05F, -0.8F, 0.0175F, -0.7767F, -0.0087F));
        PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(108, 76).addBox(-3.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 3.05F, -0.8F, 0.0175F, 0.7767F, 0.0087F));
        PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 111).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 2.05F, -0.825F, 0.0175F, 0.7767F, 0.0087F));
        PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 111).addBox(-2.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 6.75F, -0.825F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(108, 76).addBox(-3.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 5.75F, -0.8F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(108, 72).addBox(-1.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 4.05F, -0.8F, 0.0175F, -0.7767F, -0.0087F));
        PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(108, 78).addBox(-3.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 4.05F, -0.8F, 0.0175F, 0.7767F, 0.0087F));
        PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(108, 78).addBox(-3.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 4.75F, -0.8F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(108, 80).addBox(-3.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 3.75F, -0.8F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r71 = Body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(108, 82).addBox(-3.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 2.75F, -0.8F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r72 = Body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(108, 84).addBox(-3.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, 1.75F, -0.8F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r73 = Body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(112, 100).addBox(-3.0F, 1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.075F, 7.75F, -2.15F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r74 = Body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(110, 96).addBox(-1.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1F, 7.525F, -0.2F, 0.4743F, -0.6408F, -0.7257F));
        PartDefinition cube_r75 = Body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.825F, 12.8F, 0.525F, 1.5708F, 0.0F, 0.1745F));
        PartDefinition cube_r76 = Body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 78).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.825F, 12.8F, -1.125F, -1.5708F, 0.0F, 0.1745F));
        PartDefinition cube_r77 = Body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.825F, 12.8F, -4.775F, 1.5708F, 0.0F, 0.1745F));
        PartDefinition cube_r78 = Body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.325F, 11.7F, 0.125F, 1.5708F, 0.0F, 0.3491F));
        PartDefinition cube_r79 = Body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(70, 78).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.325F, 12.0F, -1.125F, -1.5708F, 0.0F, 0.3491F));
        PartDefinition cube_r80 = Body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 96).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.325F, 12.0F, -4.575F, 1.5708F, 0.0F, 0.3491F));
        PartDefinition cube_r81 = Body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.325F, 11.7F, 0.125F, 1.5708F, 0.0F, -0.3491F));
        PartDefinition cube_r82 = Body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.325F, 12.0F, -1.125F, -1.5708F, 0.0F, -0.3491F));
        PartDefinition cube_r83 = Body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.325F, 12.0F, -4.575F, 1.5708F, 0.0F, -0.3491F));
        PartDefinition cube_r84 = Body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.825F, 12.8F, -1.125F, -1.5708F, 0.0F, -0.1745F));
        PartDefinition cube_r85 = Body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.825F, 12.8F, 0.525F, 1.5708F, 0.0F, -0.1745F));
        PartDefinition cube_r86 = Body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(36, 96).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.825F, 12.8F, -4.775F, 1.5708F, 0.0F, -0.1745F));
        PartDefinition cube_r87 = Body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.775F, 15.4F, -3.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r88 = Body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(121, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.775F, 14.7F, -4.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r89 = Body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 111).addBox(-1.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.375F, 6.75F, -0.425F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r90 = Body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 111).addBox(-1.0F, 1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 6.75F, -0.825F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r91 = Body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(108, 74).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 5.75F, -0.8F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r92 = Body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(108, 72).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 4.75F, -0.8F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r93 = Body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(108, 30).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 3.75F, -0.8F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r94 = Body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 2.75F, -0.8F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 25).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 1.75F, -0.8F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 107).addBox(-3.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, 0.25F, -0.275F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(104, 68).addBox(2.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.15F, 0.25F, -0.275F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(112, 90).addBox(1.0F, 1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.075F, 7.75F, -2.15F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(0.0F, -5.0F, -5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.125F, 6.15F, 1.775F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(48, 50).addBox(-1.0F, -5.0F, -5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.125F, 6.15F, 1.775F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(44, 50).addBox(-1.0F, -5.0F, -5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, 7.75F, -0.85F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(50, 112).addBox(-0.4F, -3.725F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 62).addBox(-0.4F, -3.725F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r102 = RightArm.addOrReplaceChild("cube_r102",
                CubeListBuilder.create().texOffs(112, 45).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 49).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.975F, 0.5F, -2.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r103 = RightArm.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(110, 93).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 0.575F, 0.45F, -0.637F, 0.0F, 1.5708F));
        PartDefinition cube_r104 = RightArm.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(110, 42).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 0.575F, -0.45F, 0.637F, 0.0F, 1.5708F));
        PartDefinition cube_r105 = RightArm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(112, 102).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.6F, 0.5F, -0.85F, 0.829F, 0.0F, 1.5708F));
        PartDefinition cube_r106 = RightArm.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(44, 114).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, -3.75F, -1.6F, -0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r107 = RightArm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(18, 112).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.95F, -2.65F, -0.95F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r108 = RightArm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 112).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.9F, -3.55F, -0.95F, 0.0F, 1.5708F, 0.6981F));
        PartDefinition cube_r109 = RightArm.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(108, 26).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -4.45F, 1.4F, 3.1416F, 0.0F, -1.5708F));
        PartDefinition cube_r110 = RightArm.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(24, 108).addBox(-4.0F, -1.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -4.45F, -1.4F, -3.1416F, 0.0F, -1.5708F));
        PartDefinition cube_r111 = RightArm.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(110, 110).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -4.25F, -0.325F, -3.1416F, -0.7418F, -1.5708F));
        PartDefinition cube_r112 = RightArm.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(104, 110).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -4.25F, 0.325F, 3.1416F, 0.7418F, -1.5708F));
        PartDefinition cube_r113 = RightArm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(108, 68).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8F, -2.35F, -0.475F, 0.0F, 1.5708F, 1.5708F));
        PartDefinition cube_r114 = RightArm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(46, 99).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -3.95F, -0.95F, 0.0F, 1.5708F, 1.5708F));
        PartDefinition cube_r115 = RightArm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(114, 60).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, -4.15F, -0.65F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r116 = RightArm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(104, 57).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.325F, 2.5F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r117 = RightArm.addOrReplaceChild("cube_r117",
                CubeListBuilder.create().texOffs(36, 99).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 113).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.825F, 0.5F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r118 = RightArm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 103).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.325F, 9.1F, 0.625F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r119 = RightArm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(97, 26).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.825F, 7.1F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r120 = RightArm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(104, 61).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.325F, 2.5F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r121 = RightArm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(104, 2).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.325F, 9.1F, -0.625F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r122 = RightArm.addOrReplaceChild("cube_r122",
                CubeListBuilder.create().texOffs(102, 123).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 97).addBox(-1.0F, 1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.7F, 6.5F, 0.625F, 1.5708F, 0.0F, 0.3927F));
        PartDefinition cube_r123 = RightArm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(55, 123).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.95F, 7.65F, 0.6F, 1.5708F, 0.0F, 0.3927F));
        PartDefinition cube_r124 = RightArm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(46, 123).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.95F, 7.65F, -0.6F, -1.5708F, 0.0F, 0.3927F));
        PartDefinition cube_r125 = RightArm.addOrReplaceChild("cube_r125",
                CubeListBuilder.create().texOffs(60, 27).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 27).addBox(0.0F, 1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.7F, 6.5F, -0.625F, -1.5708F, 0.0F, 0.3927F));
        PartDefinition cube_r126 = RightArm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(4, 113).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.325F, 0.5F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r127 = RightArm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(84, 114).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, -3.75F, 1.6F, 0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r128 = RightArm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(80, 114).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, -4.15F, 0.65F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r129 = RightArm.addOrReplaceChild("cube_r129",
                CubeListBuilder.create().texOffs(114, 63).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 57).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.975F, 0.5F, 2.0F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r130 = RightArm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(112, 105).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.6F, 0.5F, 0.85F, -0.829F, 0.0F, 1.5708F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 112).mirror().addBox(-0.6F, -3.725F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 62).mirror()
                .addBox(-0.6F, -3.725F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r131 = LeftArm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 49).mirror()
                .addBox(0.0F, -2.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.975F, 0.5F, -2.0F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r132 = LeftArm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(110, 93).mirror().addBox(0.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 0.575F, 0.45F, -0.637F, 0.0F, -1.5708F));
        PartDefinition cube_r133 = LeftArm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(110, 42).mirror().addBox(0.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 0.575F, -0.45F, 0.637F, 0.0F, -1.5708F));
        PartDefinition cube_r134 = LeftArm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(112, 102).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.6F, 0.5F, -0.85F, 0.829F, 0.0F, -1.5708F));
        PartDefinition cube_r135 = LeftArm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 114).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.6F, -3.75F, -1.6F, -0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r136 = LeftArm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(18, 112).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.95F, -2.65F, -0.95F, 0.0F, -1.5708F, 0.0F));
        PartDefinition cube_r137 = LeftArm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(12, 112).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.9F, -3.55F, -0.95F, 0.0F, -1.5708F, -0.6981F));
        PartDefinition cube_r138 = LeftArm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(108, 26).mirror().addBox(1.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, -4.45F, 1.4F, 3.1416F, 0.0F, 1.5708F));
        PartDefinition cube_r139 = LeftArm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(24, 108).mirror().addBox(1.0F, -1.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, -4.45F, -1.4F, -3.1416F, 0.0F, 1.5708F));
        PartDefinition cube_r140 = LeftArm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(110, 110).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, -4.25F, -0.325F, -3.1416F, 0.7418F, 1.5708F));
        PartDefinition cube_r141 = LeftArm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(104, 110).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, -4.25F, 0.325F, 3.1416F, -0.7418F, 1.5708F));
        PartDefinition cube_r142 = LeftArm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(108, 68).mirror().addBox(-1.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, -2.35F, -0.475F, 0.0F, -1.5708F, -1.5708F));
        PartDefinition cube_r143 = LeftArm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, -3.95F, -0.95F, 0.0F, -1.5708F, -1.5708F));
        PartDefinition cube_r144 = LeftArm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(114, 60).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.6F, -4.15F, -0.65F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r145 = LeftArm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(104, 57).mirror().addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 2.5F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r146 = LeftArm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(36, 99).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 113).mirror()
                .addBox(1.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.825F, 0.5F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r147 = LeftArm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 103).mirror().addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 9.1F, 0.625F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r148 = LeftArm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.825F, 7.1F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r149 = LeftArm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 2.5F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r150 = LeftArm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(104, 2).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 9.1F, -0.625F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r151 = LeftArm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(102, 123).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 97).mirror()
                .addBox(-3.0F, 1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7F, 6.5F, 0.625F, 1.5708F, 0.0F, -0.3927F));
        PartDefinition cube_r152 = LeftArm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(55, 123).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.95F, 7.65F, 0.6F, 1.5708F, 0.0F, -0.3927F));
        PartDefinition cube_r153 = LeftArm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(46, 123).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.95F, 7.65F, -0.6F, -1.5708F, 0.0F, -0.3927F));
        PartDefinition cube_r154 = LeftArm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 27).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 27).mirror()
                .addBox(-3.0F, 1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7F, 6.5F, -0.625F, -1.5708F, 0.0F, -0.3927F));
        PartDefinition cube_r155 = LeftArm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(4, 113).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.325F, 0.5F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r156 = LeftArm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 114).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.6F, -3.75F, 1.6F, 0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r157 = LeftArm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(80, 114).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.6F, -4.15F, 0.65F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r158 = LeftArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(114, 63).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(114, 57).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.975F, 0.5F, 2.0F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r159 = LeftArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(112, 105).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.6F, 0.5F, 0.85F, -0.829F, 0.0F, -1.5708F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
