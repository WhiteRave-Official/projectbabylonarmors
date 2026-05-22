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


public class IceWarriorChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_warrior_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public IceWarriorChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, 0.0F, -1.9F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(124, 0).addBox(-4.2F, 0.0F, 1.1F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0).mirror()
                        .addBox(3.2F, 0.0F, 1.1F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(120, 16).mirror().addBox(0.2F, 3.0F, -2.6F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(120, 16)
                        .addBox(-3.2F, 3.0F, -2.6F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 97).addBox(-0.5F, 3.1F, -3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 51).mirror()
                        .addBox(-4.1F, 0.725F, -2.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 51).addBox(3.1F, 0.725F, -2.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 66).mirror()
                        .addBox(-1.725F, 9.975F, -3.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(122, 66).addBox(-0.275F, 9.975F, -3.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
                        .addBox(-4.0F, 0.0F, -2.2F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 22).addBox(3.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 22).mirror()
                        .addBox(-4.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 22).mirror().addBox(-4.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 65)
                        .addBox(1.7F, -1.0F, -2.8F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(66, 65).mirror().addBox(-3.7F, -1.0F, -2.8F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 36)
                        .addBox(-3.5F, -1.0F, 3.2F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-4.0F, -4.0F, 4.0F, 5.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.6F, 4.9F, 0.0F, 0.2611F, 0.0151F, -0.0859F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -4.0F, 4.0F, 5.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6F, 4.9F, 0.0F, 0.2611F, -0.0151F, 0.0859F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
                CubeListBuilder.create().texOffs(74, 19).addBox(-3.0F, -4.0F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 25).addBox(-3.0F, -4.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3F, 15.3F, -2.6F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
                CubeListBuilder.create().texOffs(74, 13).addBox(-2.0F, -4.0F, -5.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 46).addBox(-2.0F, -4.0F, -2.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.3F, 15.3F, 1.9F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 24).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.3F, 14.4F, -2.5F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 16).addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3F, 14.4F, -2.5F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 16).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, 14.3F, -2.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, 13.6F, -3.3F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 87).addBox(-3.0F, -4.0F, -5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.5F, 18.6F, 0.1F, -0.3341F, -0.103F, -0.288F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 86).addBox(-1.0F, -4.0F, -5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.6F, 0.2F, -0.3341F, 0.103F, 0.288F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.5F, 4.9F, -2.1F, 0.1666F, -0.0522F, 0.3011F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, 4.9F, -2.1F, 0.1666F, 0.0522F, -0.3011F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(110, 0).addBox(-5.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 2.7F, -2.4F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 0).addBox(0.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 2.7F, -2.4F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(118, 80).addBox(-5.0F, -2.0F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 4.0F, -1.0F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(118, 80).mirror().addBox(1.0F, -2.0F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, 4.0F, -1.0F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(120, 95).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.3F, 10.175F, -1.925F, 0.0F, -0.0362F, -0.9407F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(120, 95).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.3F, 10.175F, -1.925F, 0.0F, 0.0362F, 0.9407F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(8, 74).mirror().addBox(-1.0F, 0.9F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(13, 44)
                .addBox(-0.1F, -0.5F, -2.4F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 45).addBox(-0.1F, -0.5F, 0.4F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.3F, 2.0F, 0.0F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 32).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.3F, -3.4F, 2.0F, 0.0F, 0.0F, -1.0472F));
        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(104, 96).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.65F, -4.5F, 2.875F, 0.0F, -0.6545F, -0.1222F));
        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(103, 107).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.65F, -4.5F, -2.875F, 0.0F, 0.6545F, -0.1222F));
        PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(118, 71).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.35F, -3.5F, 2.875F, 0.0F, -0.6545F, -0.1222F));
        PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(118, 107).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.35F, -3.5F, -2.875F, 0.0F, 0.6545F, -0.1222F));
        PartDefinition cube_r24 = LeftArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 114).addBox(-6.0F, -2.0F, -3.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.525F, 0.875F, 1.425F, -0.496F, 0.2682F, 0.4117F));
        PartDefinition cube_r25 = LeftArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 121).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.025F, 0.875F, 1.325F, -0.496F, 0.2682F, 0.4117F));
        PartDefinition cube_r26 = LeftArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(116, 100).mirror().addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0674F, 1.8F, -0.7829F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r27 = LeftArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 121).addBox(-6.0F, -2.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.425F, 0.375F, -0.825F, 0.496F, -0.2682F, 0.4117F));
        PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(32, 112).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.025F, 0.875F, -1.575F, 0.496F, -0.2682F, 0.4117F));
        PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 19).addBox(1.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.1F, -2.15F, 2.0F, 0.0F, 0.0F, -1.6581F));
        PartDefinition cube_r30 = LeftArm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 93).addBox(0.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.725F, 0.1F, 1.975F, 0.0F, 0.0F, -1.1781F));
        PartDefinition cube_r31 = LeftArm.addOrReplaceChild("cube_r31",
                CubeListBuilder.create().texOffs(86, 123).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 123).addBox(-2.0F, -3.0F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 0.2F, 4.0F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r32 = LeftArm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(88, 40).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.625F, 1.275F, 1.975F, 0.0F, 0.0F, -0.3491F));
        PartDefinition cube_r33 = LeftArm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 71).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, -0.5F, 1.975F, 0.0F, 0.0F, -0.5672F));
        PartDefinition cube_r34 = LeftArm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(84, 71).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.9F, -0.225F, 2.0F, 0.0F, 0.0F, -0.829F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(8, 74).addBox(-5.0F, 0.9F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(13, 44).mirror()
                        .addBox(-3.9F, -0.5F, -2.4F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 45).mirror().addBox(-3.9F, -0.5F, 0.4F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-4.3F, 2.0F, 0.0F));
        PartDefinition cube_r35 = RightArm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.3F, -3.4F, 2.0F, 0.0F, 0.0F, 1.0472F));
        PartDefinition cube_r36 = RightArm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(104, 96).mirror().addBox(-0.5F, -1.5F, -3.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.65F, -4.5F, 2.875F, 0.0F, 0.6545F, 0.1222F));
        PartDefinition cube_r37 = RightArm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(103, 107).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.65F, -4.5F, -2.875F, 0.0F, -0.6545F, 0.1222F));
        PartDefinition cube_r38 = RightArm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(118, 71).mirror().addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.35F, -3.5F, 2.875F, 0.0F, 0.6545F, 0.1222F));
        PartDefinition cube_r39 = RightArm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(118, 107).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.35F, -3.5F, -2.875F, 0.0F, -0.6545F, 0.1222F));
        PartDefinition cube_r40 = RightArm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 114).mirror().addBox(-1.0F, -2.0F, -3.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.525F, 0.875F, 1.425F, -0.496F, -0.2682F, -0.4117F));
        PartDefinition cube_r41 = RightArm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(66, 121).mirror().addBox(-1.0F, -2.0F, -3.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.025F, 0.875F, 1.325F, -0.496F, -0.2682F, -0.4117F));
        PartDefinition cube_r42 = RightArm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(116, 100).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0674F, 1.8F, -0.7829F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r43 = RightArm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(95, 121).mirror().addBox(-1.0F, -2.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.425F, 0.375F, -0.825F, 0.496F, 0.2682F, -0.4117F));
        PartDefinition cube_r44 = RightArm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 112).mirror().addBox(-1.0F, -2.0F, -1.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.025F, 0.875F, -1.575F, 0.496F, 0.2682F, -0.4117F));
        PartDefinition cube_r45 = RightArm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-5.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.1F, -2.15F, 2.0F, 0.0F, 0.0F, 1.6581F));
        PartDefinition cube_r46 = RightArm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.725F, 0.1F, 1.975F, 0.0F, 0.0F, 1.1781F));
        PartDefinition cube_r47 = RightArm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(86, 123).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 123).mirror()
                .addBox(-1.0F, -3.0F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2F, 4.0F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r48 = RightArm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.625F, 1.275F, 1.975F, 0.0F, 0.0F, 0.3491F));
        PartDefinition cube_r49 = RightArm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, -0.5F, 1.975F, 0.0F, 0.0F, 0.5672F));
        PartDefinition cube_r50 = RightArm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.9F, -0.225F, 2.0F, 0.0F, 0.0F, 0.829F));
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
