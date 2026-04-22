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


public class EtherealTankChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ethereal_tank_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public EtherealTankChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 52)
                        .addBox(-1.5F, -0.6F, -3.45F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 29).addBox(-2.0F, 8.1F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77).mirror()
                        .addBox(-4.1F, 2.5F, -2.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 76).addBox(-0.5F, 2.0F, -3.1F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 77)
                        .addBox(3.1F, 2.5F, -2.3F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77).addBox(-4.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77)
                        .addBox(3.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 88).addBox(-2.025F, 9.2F, 1.725F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
                        .addBox(-3.5F, 0.5F, 1.525F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(-3.5F, 5.5F, 1.525F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 64)
                        .addBox(-0.5F, 9.85F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 68).addBox(-3.5F, 7.25F, -3.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 1).mirror()
                        .addBox(-1.0F, 9.1F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 90).addBox(-3.0F, 15.3F, -3.3F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 9)
                        .addBox(-1.5F, 16.2F, -3.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 9).addBox(-1.5F, 16.2F, 3.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 9)
                        .addBox(-1.5F, 2.2F, 2.7F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 15.3F, 3.3F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.0F, -2.15F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.0F, 2.15F, -0.1003F, -0.3166F, 0.3127F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 18.0F, 2.15F, -0.1003F, 0.3166F, -0.3127F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, 2.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 10.1F, 1.75F, 0.1003F, -0.3166F, -0.3127F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, 2.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 10.1F, 1.75F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, 2.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 10.1F, -1.75F, -0.1003F, 0.3166F, -0.3127F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, 2.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 10.1F, -1.75F, -0.1003F, -0.3166F, 0.3127F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 18.0F, -2.05F, 0.1003F, -0.3166F, -0.3127F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.0F, -1.85F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.6F, 1.4F, 0.6F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 119).addBox(1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 1.4F, 4.1F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 1.4F, 0.6F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.25F, 9.5F, 1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.25F, 9.5F, 1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(0.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, 1.8F, -2.3F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 17).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 1.8F, -2.3F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 14.8F, -3.5F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(4, 78).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.375F, 12.075F, -1.425F, -0.0602F, 0.0362F, 0.9407F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(4, 78).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 12.075F, -1.425F, -0.0602F, -0.0362F, -0.9407F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 6).addBox(-4.0F, -10.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.8F, 11.6F, -2.5F, 0.0F, 0.3491F, 0.0F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(1.0F, -10.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.8F, 11.6F, -2.5F, 0.0F, -0.3491F, 0.0F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 3).addBox(-3.3562F, -2.0F, -1.725F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.9F, -4.3037F, 0.583F, 0.6956F, 0.3999F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(84, 52).addBox(-1.5F, -2.0F, -0.9463F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.9F, -4.3037F, 0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(70, 32).addBox(0.3562F, -2.0F, -1.725F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.9F, -4.3037F, 0.583F, -0.6956F, -0.3999F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 3).addBox(-3.3562F, -1.0F, -1.725F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.4F, -2.5037F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(70, 32).addBox(0.3562F, -1.0F, -1.725F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.4F, -2.5037F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(25, 71).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.025F, 2.275F, -2.5F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.975F, 2.275F, -2.5F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(42, 39).addBox(-0.8F, -1.0F, -2.2F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 113).addBox(-0.8F, -1.0F, -0.8F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 119).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.75F, 9.1F, -2.55F, -0.0002F, 0.0209F, -0.0077F));
        PartDefinition cube_r30 = LeftArm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(80, 6).addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -5.1659F, -0.7F, 0.0F, 0.0F, -0.0873F));
        PartDefinition cube_r31 = LeftArm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(80, 6).addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -5.1659F, 0.7F, 3.1416F, 0.0F, 3.0543F));
        PartDefinition cube_r32 = LeftArm.addOrReplaceChild("cube_r32",
                CubeListBuilder.create().texOffs(112, 35).addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 35).addBox(-1.0F, -2.5841F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.7F, 2.9341F, 0.5F, 0.0F, 0.0F, -0.0873F));
        PartDefinition cube_r33 = LeftArm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 99).addBox(-1.0F, -3.2439F, -5.5845F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -4.1159F, -0.9F, 1.117F, 0.0F, -0.0873F));
        PartDefinition cube_r34 = LeftArm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(108, 21).addBox(-1.0F, -3.2439F, -2.4155F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -4.1159F, 0.7F, -1.117F, 0.0F, -0.0873F));
        PartDefinition cube_r35 = LeftArm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(94, 19).addBox(-1.0F, -2.5841F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -1.7159F, 0.0F, 0.0F, 0.0F, 0.4189F));
        PartDefinition cube_r36 = LeftArm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 49).addBox(-1.0F, -2.5841F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8F, -5.0159F, 0.0F, 0.0F, 0.0F, 1.1519F));
        PartDefinition cube_r37 = LeftArm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(47, 22).addBox(-1.0F, -3.2439F, -3.5845F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -1.7159F, 0.0F, 0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r38 = LeftArm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(23, 60).addBox(-1.0F, -3.2439F, -3.5845F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -0.7159F, -1.55F, 0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r39 = LeftArm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 11).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.5291F, 1.5677F, -3.6392F, 1.6458F, -0.6983F, -0.0566F));
        PartDefinition cube_r40 = LeftArm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 60).addBox(-1.0F, -3.2439F, 1.5845F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -0.7159F, 1.55F, -0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r41 = LeftArm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(7, 11).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.5291F, 1.5677F, 3.6392F, -1.6458F, 0.6983F, -0.0566F));
        PartDefinition cube_r42 = LeftArm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(93, 56).addBox(-1.0F, -3.2439F, -0.4155F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -1.7159F, 0.0F, -0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r43 = LeftArm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(35, 92).addBox(3.0F, -3.2439F, -4.5845F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -2.7159F, 0.0F, 0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r44 = LeftArm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 18).addBox(3.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -2.7159F, 0.0F, 0.0F, 0.0F, 0.4189F));
        PartDefinition cube_r45 = LeftArm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(82, 88).addBox(3.0F, -3.2439F, -0.4155F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -2.7159F, 0.0F, -0.7854F, 0.0F, 0.4189F));
        PartDefinition cube_r46 = LeftArm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(45, 3).addBox(-1.0F, -3.2439F, -1.5845F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.6F, 0.3841F, 0.0F, 0.7854F, 0.0F, 0.8552F));
        PartDefinition cube_r47 = LeftArm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 102).addBox(-1.0F, -2.5841F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.6F, 0.3841F, 0.0F, 0.0F, 0.0F, 0.8552F));
        PartDefinition cube_r48 = LeftArm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 61).addBox(-1.0F, -3.2439F, -0.4155F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.6F, 0.3841F, 0.0F, -0.7854F, 0.0F, 0.8552F));
        PartDefinition cube_r49 = LeftArm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 119).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.95F, 0.6F, -2.55F, 0.0F, 0.0F, 0.2443F));
        PartDefinition cube_r50 = LeftArm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(62, 119).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.95F, 5.3F, -2.55F, 0.0F, 0.0F, 0.2443F));
        PartDefinition cube_r51 = LeftArm.addOrReplaceChild("cube_r51",
                CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 5.7F, 1.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-3.2F, -1.0F, -2.2F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 113).mirror()
                .addBox(-3.2F, -1.0F, -0.8F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r52 = RightArm.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-3.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.75F, 9.1F, -2.55F, -0.0002F, -0.0209F, 0.0077F));
        PartDefinition cube_r53 = RightArm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, -5.1659F, -0.7F, 0.0F, 0.0F, 0.0873F));
        PartDefinition cube_r54 = RightArm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, -5.1659F, 0.7F, 3.1416F, 0.0F, -3.0543F));
        PartDefinition cube_r55 = RightArm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(112, 35).mirror().addBox(-1.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 35).mirror()
                .addBox(-1.0F, -2.5841F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.7F, 2.9341F, 0.5F, 0.0F, 0.0F, 0.0873F));
        PartDefinition cube_r56 = RightArm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(31, 99).mirror().addBox(-1.0F, -3.2439F, -5.5845F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, -4.1159F, -0.9F, 1.117F, 0.0F, 0.0873F));
        PartDefinition cube_r57 = RightArm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(108, 21).mirror().addBox(-1.0F, -3.2439F, -2.4155F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, -4.1159F, 0.7F, -1.117F, 0.0F, 0.0873F));
        PartDefinition cube_r58 = RightArm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 19).mirror().addBox(-5.0F, -2.5841F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.3F, -1.7159F, 0.0F, 0.0F, 0.0F, -0.4189F));
        PartDefinition cube_r59 = RightArm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-3.0F, -2.5841F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, -5.0159F, 0.0F, 0.0F, 0.0F, -1.1519F));
        PartDefinition cube_r60 = RightArm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-5.0F, -3.2439F, -3.5845F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.3F, -1.7159F, 0.0F, 0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r61 = RightArm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-5.0F, -3.2439F, -3.5845F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.3F, -0.7159F, -1.55F, 0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r62 = RightArm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(7, 11).mirror().addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.5291F, 1.5677F, -3.6392F, 1.6458F, 0.6983F, 0.0566F));
        PartDefinition cube_r63 = RightArm.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(23, 60).mirror().addBox(-5.0F, -3.2439F, 1.5845F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.3F, -0.7159F, 1.55F, -0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r64 = RightArm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(7, 11).mirror().addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.5291F, 1.5677F, 3.6392F, -1.6458F, -0.6983F, 0.0566F));
        PartDefinition cube_r65 = RightArm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-5.0F, -3.2439F, -0.4155F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.3F, -1.7159F, 0.0F, -0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r66 = RightArm.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-5.0F, -3.2439F, -4.5845F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, -2.7159F, 0.0F, 0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r67 = RightArm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-5.0F, -2.5841F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, -2.7159F, 0.0F, 0.0F, 0.0F, -0.4189F));
        PartDefinition cube_r68 = RightArm.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 88).mirror().addBox(-5.0F, -3.2439F, -0.4155F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, -2.7159F, 0.0F, -0.7854F, 0.0F, -0.4189F));
        PartDefinition cube_r69 = RightArm.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 3).mirror().addBox(-3.0F, -3.2439F, -1.5845F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.6F, 0.3841F, 0.0F, 0.7854F, 0.0F, -0.8552F));
        PartDefinition cube_r70 = RightArm.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(14, 102).mirror().addBox(-3.0F, -2.5841F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.6F, 0.3841F, 0.0F, 0.0F, 0.0F, -0.8552F));
        PartDefinition cube_r71 = RightArm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 61).mirror().addBox(-3.0F, -3.2439F, -0.4155F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.6F, 0.3841F, 0.0F, -0.7854F, 0.0F, -0.8552F));
        PartDefinition cube_r72 = RightArm.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-3.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.95F, 0.6F, -2.55F, 0.0F, 0.0F, -0.2443F));
        PartDefinition cube_r73 = RightArm.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-3.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.95F, 5.3F, -2.55F, 0.0F, 0.0F, -0.2443F));
        PartDefinition cube_r74 = RightArm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 73).mirror()
                .addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.7F, 1.9F, 0.0F, 0.0F, -0.7854F));
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
