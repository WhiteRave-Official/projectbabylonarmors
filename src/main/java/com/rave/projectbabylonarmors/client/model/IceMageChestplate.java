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


public class IceMageChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_mage_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public IceMageChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 72).addBox(1.0F, -1.0F, -2.775F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 72).mirror()
                        .addBox(-3.0F, -1.0F, -2.775F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 117).addBox(-3.5F, -1.9F, -2.775F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(67, 118)
                        .addBox(-3.5F, 0.4F, -3.025F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 120).mirror().addBox(0.5F, 0.3F, -3.025F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(111, 7).mirror()
                        .addBox(-0.9F, 0.4F, 3.375F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(111, 7).addBox(-3.1F, 0.4F, 3.375F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -2.0F, -3.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.0F, -0.6F, -0.1F, 0.0F, 0.0F, 0.5672F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 28).mirror().addBox(-4.0F, -3.0F, -3.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.1F, -0.8F, 0.2F, 0.0F, 0.0F, -0.6109F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 117).addBox(-3.0F, -3.0F, -3.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.1F, -0.8F, 0.2F, 0.0F, 0.0F, 0.6109F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -3.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -0.6F, -0.1F, 0.0F, 0.0F, -0.5672F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.1F, 0.3F, -2.4F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(114, 66).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.95F, -4.1F, 4.1F, -0.0395F, -0.0184F, 1.1348F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 72).mirror().addBox(-2.0F, 0.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.2F, -7.3F, 4.2F, -0.041F, 0.0149F, 1.9196F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(110, 14).mirror().addBox(-2.0F, 0.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.775F, -7.3F, 4.2F, -0.041F, -0.0149F, 1.222F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 106).mirror().addBox(-3.0F, 0.0F, 0.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.85F, 2.2F, 3.9F, -0.0703F, -0.0474F, -0.1072F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(113, 40).mirror().addBox(-1.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-11.15F, 3.5F, 4.4F, -0.2091F, 0.2126F, -0.4293F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 50).mirror().addBox(-1.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-13.175F, 0.775F, 5.1F, 0.134F, 0.266F, 0.8328F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 59).mirror().addBox(-1.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-13.95F, -0.4F, 5.5F, -0.0603F, 0.2911F, 0.1515F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 77).mirror().addBox(-2.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.2F, -2.625F, 4.2F, -0.0218F, -0.0378F, 0.524F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 77).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.2F, -2.625F, 4.2F, -0.0218F, 0.0378F, -0.524F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(110, 14).addBox(-5.0F, 0.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.775F, -7.3F, 4.2F, -0.041F, 0.0149F, -1.222F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(112, 97).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, -3.5F, 4.4F, -0.0357F, -0.025F, -0.7854F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(112, 97).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.2F, -3.5F, 4.4F, -0.0357F, 0.025F, 0.7854F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-2.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 3.8F, 5.6F, 0.0078F, 0.1936F, -2.09F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(110, 102).addBox(-5.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 3.8F, 5.6F, 0.0078F, -0.1936F, 2.09F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(110, 102).addBox(-5.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.3F, 6.8F, 4.9F, 0.0078F, -0.1936F, 2.09F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-2.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.3F, 6.8F, 4.9F, 0.0078F, 0.1936F, -2.09F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(110, 72).addBox(-5.0F, 0.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.2F, -7.3F, 4.2F, -0.041F, -0.0149F, -1.9196F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(114, 66).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.95F, -4.1F, 4.1F, -0.0395F, 0.0184F, -1.1348F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(113, 40).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(11.15F, 3.5F, 4.4F, -0.2091F, -0.2126F, 0.4293F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(112, 50).addBox(-5.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.175F, 0.775F, 5.1F, 0.134F, -0.266F, -0.8328F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(112, 59).addBox(-5.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.95F, -0.4F, 5.5F, -0.0603F, -0.2911F, -0.1515F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 106).addBox(-5.0F, 0.0F, 0.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.85F, 2.2F, 3.9F, -0.0703F, 0.0474F, 0.1072F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.1F, 0.3F, -2.4F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.5F, 11.9F, -1.5F, 0.2539F, -0.0522F, 0.3011F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30",
                CubeListBuilder.create().texOffs(74, 19).addBox(-3.0F, -4.0F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 25).addBox(-3.0F, -4.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3F, 15.3F, -2.6F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31",
                CubeListBuilder.create().texOffs(72, 46).addBox(-2.0F, -4.0F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 13).addBox(-2.0F, -4.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.3F, 15.3F, -2.6F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 87).addBox(-3.0F, -4.0F, -5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.5F, 18.6F, 0.1F, -0.3341F, -0.103F, -0.288F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 86).addBox(-1.0F, -4.0F, -5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.6F, 0.2F, -0.3341F, 0.103F, 0.288F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 16).addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3F, 14.4F, -2.5F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(60, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, 13.6F, -3.3F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(42, 16).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, 14.3F, -2.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 24).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.3F, 14.4F, -2.5F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, 11.9F, -1.5F, 0.2539F, 0.0522F, -0.3011F));
        PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.5F, 4.9F, -1.1F, 0.1666F, -0.0522F, 0.3011F));
        PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.4F, 6.8F, -0.3F, 0.3142F, 0.0015F, -0.0086F));
        PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.5F, 4.9F, -1.2F, 0.1666F, 0.0522F, -0.3011F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(29, 101).addBox(-2.3181F, 2.9363F, -2.3125F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 101).addBox(-2.3181F, 2.9363F, -0.1125F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 87).addBox(-2.4181F, -6.0637F, -2.3125F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 87).addBox(-2.4181F, -6.0637F, -0.1125F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 85)
                        .addBox(-1.6181F, -5.1637F, -2.0125F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 105).mirror().addBox(0.9819F, -5.1637F, -2.1125F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(116, 105)
                        .mirror().addBox(0.9819F, -5.1637F, -0.3125F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 85).addBox(-1.6181F, -5.1637F, -0.4125F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 43)
                        .addBox(-1.2181F, -5.0637F, -1.7125F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.2181F, 5.0637F, -0.2875F));
        PartDefinition cube_r42 = LeftArm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 32).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0819F, -5.9637F, 2.3875F, 0.0F, 0.0F, -1.0472F));
        PartDefinition cube_r43 = LeftArm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(91, 19).addBox(1.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8819F, -4.7137F, 2.3875F, 0.0F, 0.0F, -1.6581F));
        PartDefinition cube_r44 = LeftArm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 93).addBox(0.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5069F, -2.4637F, 2.1875F, 0.0F, 0.0F, -1.1781F));
        PartDefinition cube_r45 = LeftArm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 40).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4069F, -1.2887F, 2.1875F, 0.0F, 0.0F, -0.3491F));
        PartDefinition cube_r46 = LeftArm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(40, 71).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.7819F, -3.0637F, 2.1875F, 0.0F, 0.0F, -0.5672F));
        PartDefinition cube_r47 = LeftArm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(84, 71).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6819F, -2.7887F, 2.3875F, 0.0F, 0.0F, -0.829F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(29, 101).mirror().addBox(-3.6819F, 2.9363F, -2.3125F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(29, 101).mirror()
                        .addBox(-3.6819F, 2.9363F, -0.1125F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 87).mirror().addBox(-3.5819F, -6.0637F, -2.3125F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 87)
                        .mirror().addBox(-3.5819F, -6.0637F, -0.1125F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 85).mirror().addBox(-1.3819F, -5.1637F, -2.0125F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(116, 105).addBox(-2.9819F, -5.1637F, -2.1125F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 105).addBox(-2.9819F, -5.1637F, -0.3125F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 85).mirror()
                        .addBox(-1.3819F, -5.1637F, -0.4125F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 43).mirror().addBox(-2.7819F, -5.0637F, -1.7125F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.2181F, 5.0637F, -0.2875F));
        PartDefinition cube_r48 = RightArm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.0819F, -5.9637F, 2.3875F, 0.0F, 0.0F, 1.0472F));
        PartDefinition cube_r49 = RightArm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-5.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8819F, -4.7137F, 2.3875F, 0.0F, 0.0F, 1.6581F));
        PartDefinition cube_r50 = RightArm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.5069F, -2.4637F, 2.1875F, 0.0F, 0.0F, 1.1781F));
        PartDefinition cube_r51 = RightArm.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.4069F, -1.2887F, 2.1875F, 0.0F, 0.0F, 0.3491F));
        PartDefinition cube_r52 = RightArm.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.7819F, -3.0637F, 2.1875F, 0.0F, 0.0F, 0.5672F));
        PartDefinition cube_r53 = RightArm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.6819F, -2.7887F, 2.3875F, 0.0F, 0.0F, 0.829F));
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
