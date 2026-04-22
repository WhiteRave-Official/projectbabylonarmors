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


public class NetheriteRogueChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_rogue_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public NetheriteRogueChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(79, 0).addBox(-2.075F, 12.5F, -4.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 39).addBox(-4.2F, 0.0F, 1.15F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 39)
                        .addBox(2.375F, 0.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52).mirror().addBox(2.975F, 0.0F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 52)
                        .addBox(-3.975F, 0.0F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, 38).addBox(-4.0F, 0.0F, -3.275F, 8.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
                        .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(124, 0).mirror().addBox(-4.5125F, 0.325F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 0)
                        .addBox(3.5125F, 0.325F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 52).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 20).addBox(-6.0F, -10.0F, 4.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 27.1F, 0.4F, 0.0873F, -0.0004F, 0.0087F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 53).addBox(-6.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(10.075F, 12.075F, -0.925F, 0.0873F, -0.0004F, 0.0087F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 52).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 58).addBox(2.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.775F, 23.25F, 0.075F, 0.0718F, -0.0497F, 0.6003F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 58).mirror().addBox(-4.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(11.575F, 23.25F, 0.075F, 0.0718F, 0.0497F, -0.6003F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 72).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8875F, 1.6F, -2.525F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 72).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8875F, 1.6F, -2.525F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(4, 72).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8875F, 2.6F, -2.475F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 72).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8875F, 2.6F, -2.475F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 72).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8875F, 3.6F, -2.45F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(4, 72).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8875F, 3.6F, -2.45F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 72).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8875F, 4.6F, -2.375F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 72).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8875F, 4.6F, -2.375F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.3125F, 7.2F, -2.7F, 0.0F, 0.0F, 1.9635F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 79).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.8625F, 5.35F, -2.7F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3125F, 7.2F, -2.7F, 0.0F, 0.0F, -1.9635F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(8, 79).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.8625F, 5.35F, -2.7F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0F, 1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.8125F, 1.05F, -2.7F, 0.0F, 0.0F, -0.2618F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(50, 69).addBox(0.0F, 1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8125F, 1.05F, -2.7F, 0.0F, 0.0F, 0.2618F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 53).addBox(5.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.075F, 12.075F, -0.925F, 0.0873F, 0.0004F, -0.0087F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 52).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 12.2F, -0.925F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 2).addBox(-1.0F, -5.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.025F, 4.25F, 0.2F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 66).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.025F, 4.25F, 1.1F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 5).addBox(-3.0F, -5.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.975F, 4.25F, 0.225F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 22).addBox(-1.0F, -4.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 4.55F, -0.5F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 75).addBox(1.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 4.55F, 0.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(64, 22).addBox(-3.0F, -4.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 4.55F, -0.275F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 15).addBox(-3.0F, -5.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 3.55F, -0.375F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(74, 22).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 3.55F, 0.5F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 8).addBox(-1.0F, -5.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 3.55F, -0.4F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(54, 0).addBox(-8.0F, -10.0F, 4.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.475F, 9.9F, -1.1F, 0.0873F, 0.0004F, 0.0F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 12).mirror()
                .addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.4F, 11.9F, 0.525F, 1.5708F, 0.0F, -0.0175F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 29).mirror()
                .addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.4F, 11.9F, -1.125F, -1.5708F, 0.0F, -0.0175F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 12).mirror()
                .addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.425F, 11.9F, -4.775F, 1.5708F, 0.0F, -0.0436F));
        PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(68, 29).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 11.9F, -1.125F, -1.5708F, 0.0F, 0.0175F));
        PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 11.9F, 0.525F, 1.5708F, 0.0F, 0.0175F));
        PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.425F, 11.9F, -4.775F, 1.5708F, 0.0F, 0.0436F));
        PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 10.2F, 0.425F, 1.5708F, 0.0F, -0.3316F));
        PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 10.2F, -1.125F, -1.5708F, 0.0F, -0.3316F));
        PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.025F, 10.2F, -4.575F, 1.5708F, 0.0F, -0.3578F));
        PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.025F, 10.2F, -4.575F, 1.5708F, 0.0F, 0.3578F));
        PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(68, 29).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 10.2F, -1.125F, -1.5708F, 0.0F, 0.3316F));
        PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 10.2F, 0.425F, 1.5708F, 0.0F, 0.3316F));
        PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45",
                CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(28, 12).mirror().addBox(3.1F, -3.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.05F, 12.9F, -0.7F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(30, 0).addBox(2.0F, -3.0F, -1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 12.5F, -5.65F, -1.5708F, 0.0F, 0.2182F));
        PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 24).mirror()
                .addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.225F, 12.5F, -0.725F, -1.5708F, 0.0F, 0.2182F));
        PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.425F, 12.5F, -5.325F, -1.5708F, 0.0F, 0.2182F));
        PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.95F, 12.9F, -0.725F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-3.0F, -3.0F, -1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.2F, 12.5F, -5.65F, -1.5708F, 0.0F, -0.2182F));
        PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.225F, 12.5F, -5.325F, -1.5708F, 0.0F, -0.2182F));
        PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.225F, 12.5F, -0.65F, -1.5708F, 0.0F, 0.5323F));
        PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.225F, 10.5F, -0.65F, -1.5708F, 0.0F, 0.5323F));
        PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 24).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.025F, 10.5F, -0.65F, -1.5708F, 0.0F, -0.5323F));
        PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 24).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.025F, 12.5F, -0.65F, -1.5708F, 0.0F, -0.5323F));
        PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56",
                CubeListBuilder.create().texOffs(26, 24).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.225F, 12.5F, -0.725F, -1.5708F, 0.0F, -0.2182F));
        PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(42, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.775F, 13.8F, -3.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 73).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.825F, 1.1F, -3.7F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(42, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.825F, 1.1F, -3.8F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(14, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.775F, 13.1F, -4.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -8.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.475F, 1.025F, 1.275F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(36, 39).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.475F, 2.55F, 1.275F, 0.0F, 0.0F, -1.0821F));
        PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(50, 29).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.825F, -1.45F, 0.875F, 0.0F, 0.0F, -1.5533F));
        PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(36, 51).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.075F, 2.25F, 0.9F, 0.0F, 0.0F, -0.8552F));
        PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(36, 39).mirror().addBox(-1.0F, -8.0F, -5.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.425F, 2.55F, 1.275F, 0.0F, 0.0F, 1.0821F));
        PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(50, 29).mirror().addBox(-1.0F, -5.0F, -5.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.825F, -1.45F, 0.875F, 0.0F, 0.0F, 1.5533F));
        PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(36, 51).mirror().addBox(-1.0F, -6.0F, -5.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.075F, 2.25F, 0.9F, 0.0F, 0.0F, 0.8552F));
        PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(76, 44).addBox(-3.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, 0.25F, -0.275F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r69 = Body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 71).addBox(0.0F, -5.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 6.65F, 1.75F, -0.0175F, 0.7767F, -0.0087F));
        PartDefinition cube_r70 = Body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 76).addBox(2.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.15F, 0.25F, -0.275F, -0.0175F, -0.7767F, 0.0087F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-3.2F, 0.2F, -2.525F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 25)
                .addBox(0.0F, -3.225F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 69).addBox(0.0F, -3.225F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.2F, 1.2F, 0.0F));
        PartDefinition cube_r71 = RightArm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(76, 41).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.925F, 1.0F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r72 = RightArm.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 67).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.925F, 2.5F, 1.1F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r73 = RightArm.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(62, 53).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 1.1F, -0.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r74 = RightArm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.925F, 2.5F, -0.875F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r75 = RightArm.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 6.8F, -0.7F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r76 = RightArm.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(62, 53).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.325F, 5.5F, -0.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r77 = RightArm.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 67).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 5.2F, 0.55F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r78 = RightArm.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 5.2F, -0.7F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r79 = RightArm.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(62, 67).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 6.8F, 0.55F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r80 = RightArm.addOrReplaceChild("cube_r80",
                CubeListBuilder.create().texOffs(36, 75).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 18).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.575F, 1.0F, -2.0F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r81 = RightArm.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 76).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.2F, 1.0F, 0.85F, -0.829F, 0.0F, 1.5708F));
        PartDefinition cube_r82 = RightArm.addOrReplaceChild("cube_r82",
                CubeListBuilder.create().texOffs(74, 29).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 74).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.575F, 1.0F, 2.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r83 = RightArm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 35).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -3.65F, 0.65F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r84 = RightArm.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(76, 38).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -3.25F, 1.6F, 0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r85 = RightArm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(40, 76).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.925F, 1.0F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r86 = RightArm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(68, 75).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -3.65F, -0.65F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r87 = RightArm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 18).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -3.45F, -0.95F, 0.0F, 1.5708F, 1.5708F));
        PartDefinition cube_r88 = RightArm.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(68, 44).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, -1.85F, -0.475F, 0.0F, 1.5708F, 1.5708F));
        PartDefinition cube_r89 = RightArm.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 60).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -3.75F, 0.325F, 3.1416F, 0.7418F, -1.5708F));
        PartDefinition cube_r90 = RightArm.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(54, 71).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -3.75F, -0.325F, -3.1416F, -0.7418F, -1.5708F));
        PartDefinition cube_r91 = RightArm.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(68, 36).addBox(-4.0F, -1.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -3.95F, -1.4F, -3.1416F, 0.0F, -1.5708F));
        PartDefinition cube_r92 = RightArm.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(68, 40).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.6F, -3.95F, 1.4F, 3.1416F, 0.0F, -1.5708F));
        PartDefinition cube_r93 = RightArm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 71).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, -3.05F, -0.95F, 0.0F, 1.5708F, 0.6981F));
        PartDefinition cube_r94 = RightArm.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(28, 70).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.55F, -2.15F, -0.95F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r95 = RightArm.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(32, 75).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -3.25F, -1.6F, -0.7418F, 0.0F, 0.0F));
        PartDefinition cube_r96 = RightArm.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(70, 11).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6F, 1.0F, -0.45F, 0.637F, 0.0F, 1.5708F));
        PartDefinition cube_r97 = RightArm.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(14, 70).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6F, 1.025F, 0.45F, -0.637F, 0.0F, 1.5708F));
        PartDefinition cube_r98 = RightArm.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(76, 46).addBox(3.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.225F, -0.5F, 0.55F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r99 = RightArm.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(76, 46).addBox(3.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.25F, -0.5F, -0.55F, -1.5708F, 0.0F, 0.0F));
        PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-8.0F, -25.0F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.2F, 25.2F, 0.375F, 0.0F, -3.1416F, 0.0F));
        PartDefinition cube_r100 = RightArm.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-1.0F, -3.0F, -5.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.025F, 5.175F, -0.85F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r101 = RightArm.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 75).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.2F, 1.0F, -0.85F, 0.829F, 0.0F, 1.5708F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 62).addBox(-0.6F, -0.6F, -2.525F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r102 = LeftArm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 74).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.975F, 0.2F, 2.0F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r103 = LeftArm.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(62, 67).mirror().addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.925F, 6.0F, 0.55F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r104 = LeftArm.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.525F, 4.7F, -0.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r105 = LeftArm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(62, 67).mirror().addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.925F, 4.4F, 0.55F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r106 = LeftArm.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.925F, 6.0F, -0.7F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r107 = LeftArm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.925F, 4.4F, -0.7F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r108 = LeftArm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 64).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.95F, -4.375F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r109 = LeftArm.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(74, 33).addBox(-3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.75F, -0.125F, 2.525F, 1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r110 = LeftArm.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(68, 48).addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.275F, 0.125F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r111 = LeftArm.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(68, 48).addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.275F, 0.125F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r112 = LeftArm.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 33).addBox(-3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.75F, -0.125F, -1.575F, 1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r113 = LeftArm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(70, 64).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.95F, -4.375F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r114 = LeftArm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(62, 60).addBox(0.0F, -3.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.125F, 0.175F, -0.85F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r115 = LeftArm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(22, 70).addBox(-3.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.6F, -0.075F, 1.15F, -1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r116 = LeftArm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 15).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.325F, -0.4F, 0.45F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r117 = LeftArm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 15).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.325F, -0.4F, -0.55F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r118 = LeftArm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(76, 18).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 75).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 0.2F, 2.0F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r119 = LeftArm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(14, 76).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.6F, 0.2F, 0.85F, -0.829F, 0.0F, -1.5708F));
        PartDefinition cube_r120 = LeftArm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 0.2F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r121 = LeftArm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.325F, 0.2F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r122 = LeftArm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.6F, 0.2F, -0.85F, 0.829F, 0.0F, -1.5708F));
        PartDefinition cube_r123 = LeftArm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(9, 33).mirror().addBox(-3.0F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9F, -4.325F, -0.875F, -1.5708F, 0.0F, 0.0F));
        PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(42, 62).addBox(4.0F, -25.0F, -2.0F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.4F, 24.4F, 0.375F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r124 = LeftArm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(60, 8).addBox(0.0F, -3.0F, -5.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.225F, 4.375F, -0.85F, -1.5708F, 0.0F, 0.0F));
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
