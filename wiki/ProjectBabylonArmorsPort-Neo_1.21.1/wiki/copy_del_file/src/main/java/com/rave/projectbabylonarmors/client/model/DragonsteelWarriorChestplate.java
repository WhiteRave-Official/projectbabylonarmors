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


public class DragonsteelWarriorChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_warrior_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public DragonsteelWarriorChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
                        .addBox(-5.0F, -0.4F, 2.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(70, 32).addBox(-1.5F, -0.6F, -3.15F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77)
                        .addBox(3.1F, 2.6F, -2.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77).addBox(-4.1F, 2.6F, -2.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 77)
                        .addBox(-4.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77).addBox(3.1F, 1.1F, 1.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 88)
                        .addBox(-2.025F, 9.2F, 1.725F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 109).addBox(-3.5F, 0.5F, 1.525F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
                        .addBox(-3.5F, 5.5F, 1.525F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 76).addBox(-0.5F, 2.0F, -3.1F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 90)
                        .addBox(-3.0F, 13.6F, 3.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 14.4F, -3.0F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(92, 1)
                        .addBox(4.0F, -1.9F, -1.8F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 92).addBox(-6.0F, -1.9F, -1.8F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(35, 89)
                        .addBox(-6.0F, -1.9F, 3.2F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(111, 103).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.8F, 16.2F, 8.5F, -0.1309F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(97, 84).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.4F, 15.8F, 4.6F, -0.1745F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(93, 31).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 14.6F, 1.5F, -0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(104, 48).addBox(-2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 18.5F, 8.2F, -0.2618F, 0.0F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(104, 48).addBox(-2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 17.0F, 4.6F, -0.3316F, 0.0F, 0.0F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(104, 48).addBox(-2.0F, -6.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 15.0F, 1.5F, -0.4363F, 0.0F, 0.0F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
                CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.0F, -2.15F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.4F, 20.7F, 2.25F, -0.1003F, 0.3166F, -0.3127F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 20.7F, 2.25F, -0.1003F, -0.3166F, 0.3127F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 18.0F, 2.15F, -0.1003F, -0.3166F, 0.3127F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 18.0F, 2.15F, -0.1003F, 0.3166F, -0.3127F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.3F, 23.2F, 2.45F, -0.1003F, -0.3166F, 0.3127F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, 0.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.3F, 23.2F, 2.45F, -0.1003F, 0.3166F, -0.3127F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.3F, 23.2F, -2.45F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.3F, 23.2F, -2.45F, 0.1003F, -0.3166F, -0.3127F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 20.7F, -2.25F, 0.1003F, 0.3166F, 0.3127F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.4F, 20.7F, -2.25F, 0.1003F, -0.3166F, -0.3127F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, -5.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 18.0F, -2.15F, 0.1003F, -0.3166F, -0.3127F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.6F, 1.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 1.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21",
                CubeListBuilder.create().texOffs(59, 39).mirror().addBox(0.0F, 0.0F, 3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 43).addBox(0.0F, 0.0F, -2.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.75F, 12.0F, -1.7F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22",
                CubeListBuilder.create().texOffs(59, 39).addBox(-5.0F, 0.0F, 3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 36).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.75F, 12.0F, -1.7F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.25F, 9.5F, 1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.25F, 9.5F, 1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(4, 78).mirror().addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.375F, 12.075F, -1.425F, -0.0602F, 0.0362F, 0.9407F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -3.5F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(4, 78).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 12.075F, -1.425F, -0.0602F, -0.0362F, -0.9407F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(1.0F, -10.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.8F, 12.0F, -2.5F, 0.0F, -0.3491F, 0.0F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 3).addBox(-3.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3F, 1.4F, -6.0F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 32).addBox(0.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.3F, 1.4F, -6.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(25, 71).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.025F, 3.175F, -3.6F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(68, 17).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 4.5F, -2.1F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 59).addBox(0.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 4.5F, -2.1F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 59).addBox(0.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 2.3F, -2.5F, 0.6847F, 0.6591F, 0.4636F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(68, 17).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 2.3F, -2.5F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 71).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.975F, 3.175F, -3.6F, 0.6847F, -0.6591F, -0.4636F));
        PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 6).addBox(-4.0F, -10.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.8F, 12.0F, -2.5F, 0.0F, 0.3491F, 0.0F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(64, 121).mirror().addBox(-3.95F, 4.5F, -2.55F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 121).mirror()
                        .addBox(-3.95F, 4.5F, -0.45F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 39).mirror().addBox(-3.2F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 113)
                        .mirror().addBox(-3.2F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(89, 15).mirror().addBox(-4.2F, -2.6F, -2.4F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r38 = RightArm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(96, 27).mirror().addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.2F, -3.2F, 4.4F, 0.6284F, -0.3272F, -1.1544F));
        PartDefinition cube_r39 = RightArm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(116, 48).mirror().addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.9F, -1.5F, 2.4F, 0.2472F, -0.6599F, -0.3905F));
        PartDefinition cube_r40 = RightArm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(96, 27).mirror().addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.2F, -3.2F, -4.4F, -0.6284F, 0.3272F, -1.1544F));
        PartDefinition cube_r41 = RightArm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(116, 48).mirror().addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.9F, -1.5F, -2.4F, -0.2472F, 0.6599F, -0.3905F));
        PartDefinition cube_r42 = RightArm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(101, 78).mirror().addBox(-2.0F, -1.0F, -3.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 78).mirror()
                .addBox(-2.0F, -1.0F, -5.2F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.4F, 2.7F, 0.0F, 0.0F, -1.0821F));
        PartDefinition cube_r43 = RightArm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(3, 46).mirror().addBox(-2.0F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 98).mirror()
                .addBox(-2.0F, -1.0F, -5.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.725F, 0.55F, 2.65F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r44 = RightArm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(116, 101).mirror().addBox(-2.0F, 2.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(116, 101).mirror()
                .addBox(-2.0F, 2.0F, -5.1F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.925F, -0.45F, 2.65F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r45 = RightArm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(85, 95).mirror().addBox(-2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.425F, 1.45F, -2.45F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r46 = RightArm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 69).mirror()
                .addBox(-1.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 2.6F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r47 = RightArm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 73).mirror()
                .addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.4F, 1.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(64, 121).addBox(-1.05F, 4.5F, -2.55F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 121).addBox(-1.05F, 4.5F, -0.45F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 39)
                        .addBox(-0.8F, -2.0F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 113).addBox(-0.8F, -2.0F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(89, 15)
                        .addBox(-0.8F, -2.6F, -2.4F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r48 = LeftArm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 27).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -3.2F, 4.4F, 0.6284F, 0.3272F, 1.1544F));
        PartDefinition cube_r49 = LeftArm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(116, 48).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.9F, -1.5F, 2.4F, 0.2472F, 0.6599F, 0.3905F));
        PartDefinition cube_r50 = LeftArm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(96, 27).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -3.2F, -4.4F, -0.6284F, -0.3272F, 1.1544F));
        PartDefinition cube_r51 = LeftArm.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(116, 48).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.9F, -1.5F, -2.4F, -0.2472F, -0.6599F, 0.3905F));
        PartDefinition cube_r52 = LeftArm.addOrReplaceChild("cube_r52",
                CubeListBuilder.create().texOffs(101, 78).addBox(-5.0F, -1.0F, -3.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 78).addBox(-5.0F, -1.0F, -5.2F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -0.4F, 2.7F, 0.0F, 0.0F, 1.0821F));
        PartDefinition cube_r53 = LeftArm.addOrReplaceChild("cube_r53",
                CubeListBuilder.create().texOffs(3, 46).addBox(-3.0F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 98).addBox(-3.0F, -1.0F, -5.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.725F, 0.55F, 2.65F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r54 = LeftArm.addOrReplaceChild("cube_r54",
                CubeListBuilder.create().texOffs(116, 101).addBox(-3.0F, 2.0F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(116, 101).addBox(-3.0F, 2.0F, -5.1F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.925F, -0.45F, 2.65F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r55 = LeftArm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 95).addBox(2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.425F, 1.45F, -2.45F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r56 = LeftArm.addOrReplaceChild("cube_r56",
                CubeListBuilder.create().texOffs(50, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 69).addBox(-2.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 1.0F, 2.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r57 = LeftArm.addOrReplaceChild("cube_r57",
                CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.0F, -2.0F, -4.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 6.4F, 1.9F, 0.0F, 0.0F, 0.7854F));
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
