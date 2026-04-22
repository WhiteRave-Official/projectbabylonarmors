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


public class NetheriteMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_mage_helmet"), "main");
    public final ModelPart Head;

    public NetheriteMageHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 70).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4855F, -9.6027F, 10.0358F, 2.3238F, 0.029F, 0.2112F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 70).addBox(2.0F, -2.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.875F, -10.725F, -2.4F, 2.2636F, 1.3271F, -1.5207F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 14).addBox(0.0F, -2.0F, 2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, -9.975F, -2.2F, 2.2636F, 1.3271F, -1.5207F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 70).addBox(2.0F, -2.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.675F, -13.2F, 12.3F, -2.3741F, 0.0812F, 0.2027F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 66).addBox(1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.075F, -12.575F, 12.3F, -2.3741F, 0.0812F, 0.2027F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 60).addBox(3.0F, -3.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -14.575F, 13.0F, -2.7248F, 0.0633F, 0.2089F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 67).addBox(2.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, -16.675F, 10.6F, -2.1663F, 0.0633F, 0.2089F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 59).addBox(1.0F, -2.0F, 2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -17.375F, 7.8F, -1.8172F, 0.0633F, 0.2089F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 59).addBox(1.0F, -2.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, -16.675F, 3.3F, -1.3069F, 0.0189F, 0.2174F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -2.0F, 0.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, -14.675F, 0.7F, -0.8706F, 0.0189F, 0.2174F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 25).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, -11.675F, -1.0F, -0.3906F, 0.0189F, 0.2174F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4F, -8.575F, 0.1F, -0.0852F, 0.0189F, 0.2174F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -2.0F, -4.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, -7.875F, -0.4F, -0.0852F, 0.0189F, 0.2174F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 23).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.5F, -8.0F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 69).addBox(0.08F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.7035F, -6.15F, 9.086F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(62, 11).addBox(-2.64F, -1.0F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.325F, -5.324F, 8.135F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 70).addBox(-2.0F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.7285F, -4.498F, 8.986F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(66, 66).addBox(-1.64F, -1.0F, -2.08F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.0675F, -3.908F, 7.589F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 67).addBox(-1.64F, -1.0F, -2.08F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.3915F, -3.436F, 4.484F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 51).addBox(-2.64F, -1.0F, -1.18F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.06F, -3.436F, 0.0F, 0.0F, -1.5708F, 0.2182F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(66, 54).addBox(-1.64F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.2415F, -3.318F, -4.809F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 67).addBox(-2.64F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6175F, -3.672F, -7.239F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 70).addBox(-2.0F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.9945F, -4.5275F, -9.236F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 39).addBox(-2.64F, -1.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3F, -5.442F, -9.515F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 69).addBox(0.08F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9945F, -6.2975F, -9.236F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 0).addBox(-2.64F, -1.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.4175F, -6.976F, -7.264F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 67).addBox(-2.36F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.4415F, -8.182F, -4.859F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 3).addBox(-2.36F, 0.0F, -1.18F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.21F, -8.064F, 0.0F, 0.0F, 1.5708F, 0.2182F));
        PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 57).addBox(-2.36F, 0.0F, -2.08F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.5415F, -8.064F, 4.484F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 66).addBox(-2.64F, -1.0F, -2.08F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.5675F, -6.751F, 7.014F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r31 = Head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(58, 39).addBox(-2.64F, -1.0F, 0.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.225F, -5.792F, -9.515F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(32, 35).addBox(-2.64F, -1.0F, 0.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.225F, -5.692F, -9.515F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 70).addBox(-2.0F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8035F, -4.848F, 8.986F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 8).addBox(-7.0F, -1.0F, -1.18F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8035F, -4.748F, 8.986F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 66).addBox(-1.64F, -1.0F, -2.08F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.1425F, -4.258F, 7.589F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 49).addBox(-1.64F, -1.0F, -7.08F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.1425F, -4.158F, 7.589F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 67).addBox(-2.36F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.3665F, -8.532F, -4.859F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(58, 28).addBox(-2.36F, 0.0F, 0.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.3665F, -8.432F, -4.859F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 3).addBox(-2.36F, 0.0F, -1.18F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.135F, -8.414F, 0.0F, 0.0F, 1.5708F, 0.2182F));
        PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(24, 43).addBox(-2.36F, 0.0F, -1.18F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.135F, -8.314F, 0.0F, 0.0F, 1.5708F, 0.2182F));
        PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 57).addBox(-2.36F, 0.0F, -2.08F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.4665F, -8.514F, 4.584F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 59).addBox(-2.36F, 0.0F, -7.08F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.4665F, -8.314F, 4.484F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(14, 67).addBox(-1.64F, -1.0F, -2.08F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.4665F, -3.786F, 4.484F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(44, 51).addBox(-1.64F, -1.0F, -7.08F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.4665F, -3.686F, 4.484F, 0.0F, 1.1606F, 0.2182F));
        PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 51).addBox(-2.64F, -1.0F, -1.18F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.135F, -3.786F, 0.0F, 0.0F, -1.5708F, 0.2182F));
        PartDefinition cube_r46 = Head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 41).addBox(-2.64F, -1.0F, -1.18F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.135F, -3.686F, 0.0F, 0.0F, -1.5708F, 0.2182F));
        PartDefinition cube_r47 = Head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 54).addBox(-1.64F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.3165F, -3.668F, -4.809F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r48 = Head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(22, 51).addBox(-1.64F, -1.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.3165F, -3.568F, -4.809F, 0.0F, -1.1606F, 0.2182F));
        PartDefinition cube_r49 = Head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 67).addBox(-2.64F, -1.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6925F, -4.022F, -7.239F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r50 = Head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 20).addBox(-2.64F, -1.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6925F, -3.922F, -7.239F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r51 = Head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(8, 70).addBox(-2.0F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0695F, -4.8775F, -9.236F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r52 = Head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(58, 36).addBox(-7.0F, -1.0F, -1.18F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0695F, -4.6025F, -9.236F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r53 = Head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 66).addBox(-2.64F, -1.0F, -2.08F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.4925F, -7.101F, 7.014F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r54 = Head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(48, 43).addBox(-2.64F, -1.0F, -7.08F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.4925F, -7.001F, 7.014F, 0.0F, -0.7505F, 0.2182F));
        PartDefinition cube_r55 = Head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 0).addBox(-2.64F, -1.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.3425F, -7.326F, -7.264F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r56 = Head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 0).addBox(-2.64F, -1.0F, 0.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.3425F, -7.101F, -7.264F, 0.0F, 0.7505F, 0.2182F));
        PartDefinition cube_r57 = Head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 69).addBox(0.08F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9195F, -6.6475F, -9.236F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r58 = Head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 20).addBox(0.08F, -1.0F, -1.18F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9195F, -6.5475F, -9.236F, 0.0F, -1.2915F, 0.2182F));
        PartDefinition cube_r59 = Head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(66, 69).addBox(0.08F, -1.0F, -1.18F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6285F, -6.5F, 9.036F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r60 = Head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(40, 8).addBox(0.08F, -1.0F, -1.18F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6285F, -6.4F, 9.086F, 0.0F, 1.2915F, 0.2182F));
        PartDefinition cube_r61 = Head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(62, 11).addBox(-2.64F, -1.0F, -0.9F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.25F, -5.674F, 8.135F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r62 = Head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(36, 12).addBox(-2.64F, -1.0F, -5.9F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.25F, -5.574F, 8.135F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r63 = Head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.0F, -4.1F, 0.0F, 0.0F, 1.5708F, 0.2182F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
