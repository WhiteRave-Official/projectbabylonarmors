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


public class NetheriteMageChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_mage_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart bone;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public NetheriteMageChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.bone = this.Body.getChild("bone");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(52, 33).addBox(-1.95F, 12.6F, -3.875F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 10).addBox(-3.9F, 0.2F, 1.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 34).mirror()
                        .addBox(3.35F, 1.1F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 34).addBox(-4.25F, 1.1F, -1.9F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
                        .addBox(-3.0F, 0.7F, -3.125F, 7.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 23).addBox(-4.0F, 0.2F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 51)
                        .addBox(-0.5F, 2.1F, -3.9F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 10).addBox(-3.45F, -2.525F, 4.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 17)
                        .addBox(-4.25F, -2.525F, 3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 27).addBox(-2.375F, 1.475F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 17).mirror()
                        .addBox(3.45F, -2.525F, 3.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 14).addBox(-3.45F, -0.55F, 3.6F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 18).mirror().addBox(-4.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.925F, 0.05F, -3.175F, 0.0F, 0.0F, -1.1606F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 8).mirror().addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.7F, -1.0F, -2.6F, 0.0F, 0.0F, -0.8552F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 50).mirror().addBox(-5.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.9F, -0.3F, -2.9F, 0.0F, 0.0F, -0.8552F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-4.0F, -2.0F, -1.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(8.525F, -3.95F, -3.175F, 0.0F, 0.0F, -1.1606F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 18).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.05F, 0.05F, -3.175F, 0.0F, 0.0F, 1.1606F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 50).addBox(0.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.025F, -0.3F, -2.9F, 0.0F, 0.0F, 0.8552F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 9).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.125F, -0.5F, -2.5F, 0.0F, 0.0F, 0.8552F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 8).addBox(0.0F, -2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.625F, -1.0F, -2.5F, 0.0F, 0.0F, 0.8552F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -2.0F, -1.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.35F, -3.9F, -2.75F, 0.0F, 0.0F, -1.3788F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-4.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.35F, -2.9F, -2.75F, 0.0F, 0.0F, -1.3788F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.35F, -2.9F, -2.75F, 0.0F, 0.0F, 1.3788F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.35F, -3.9F, -2.75F, 0.0F, 0.0F, 1.3788F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 11).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.45F, -3.95F, -3.175F, 0.0F, 0.0F, 1.1606F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 31).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.675F, 14.0F, 3.1F, 0.0F, 0.0F, -0.6545F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.875F, 14.0F, 3.1F, 0.0F, 0.0F, 0.6545F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(-3.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 7.3F, -3.8F, 0.0F, 0.0F, -0.3491F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-3.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.55F, 4.825F, -3.725F, 0.0F, 0.0F, -1.0908F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 65).addBox(-1.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.625F, 4.825F, -3.725F, 0.0F, 0.0F, 1.0908F));
        PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 70).addBox(2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.55F, 7.3F, -3.8F, 0.0F, 0.0F, 0.3491F));
        PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(5.0F, -10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.7F, 29.0F, 0.475F, 0.0873F, 0.0004F, -0.1396F));
        PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(5.0F, -10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.425F, 28.9F, 0.4F, 0.0873F, 0.0004F, -0.1396F));
        PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(3.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.65F, 12.8F, -1.1F, 0.0873F, -0.0004F, -0.1309F));
        PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(3.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.4F, 15.25F, -0.9F, 0.0873F, -0.0004F, -0.1309F));
        PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(3.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.7F, 16.05F, -0.825F, 0.0873F, -0.0004F, -0.1309F));
        PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(3.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.075F, 14.75F, -0.875F, 0.0873F, -0.0004F, -0.1309F));
        PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 43).mirror().addBox(5.0F, -14.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.675F, 29.675F, 0.65F, 0.0805F, 0.0337F, -0.531F));
        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(-0.5055F, -2.0231F, -0.4737F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.8366F, 10.7934F, 3.3623F, 0.0932F, -0.0443F, 0.5457F));
        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 41).addBox(-6.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(11.975F, 12.275F, -0.925F, 0.0873F, -0.0004F, -0.1222F));
        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(28, 34).mirror().addBox(1.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.4F, 12.4F, -1.1F, 0.0873F, -0.0004F, -0.1309F));
        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 51).addBox(-6.0F, -12.0F, 4.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.075F, 12.275F, -0.925F, 0.0873F, -0.0004F, -0.1222F));
        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 65).addBox(-6.0F, -10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 29.0F, 0.475F, 0.0873F, -0.0004F, 0.1396F));
        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 65).addBox(-6.0F, -10.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.225F, 28.9F, 0.4F, 0.0873F, -0.0004F, 0.1396F));
        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 59).addBox(-0.4945F, -2.0231F, -0.4737F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.6366F, 10.7934F, 3.3623F, 0.0932F, 0.0443F, -0.5457F));
        PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 43).addBox(-6.0F, -14.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.475F, 29.675F, 0.65F, 0.0805F, -0.0337F, 0.531F));
        PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(5.0F, -12.0F, 4.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.875F, 12.275F, -0.925F, 0.0873F, 0.0004F, 0.1222F));
        PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 41).mirror().addBox(5.0F, -12.0F, 4.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-11.775F, 12.275F, -0.925F, 0.0873F, 0.0004F, 0.1222F));
        PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 8).mirror().addBox(-4.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(15.1F, 23.175F, 0.075F, 0.0718F, 0.0497F, -0.7312F));
        PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(52, 8).addBox(2.0F, -10.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-14.9F, 23.175F, 0.075F, 0.0718F, -0.0497F, 0.7312F));
        PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 46).addBox(-6.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.4F, 16.05F, -1.625F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 46).addBox(-6.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 15.25F, -1.7F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 46).addBox(-6.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 16.05F, -0.825F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 8).addBox(-6.0F, 2.0F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.275F, 14.75F, -0.875F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 46).addBox(-6.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.625F, 11.975F, -1.175F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 46).addBox(-6.0F, 2.0F, 5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, 15.25F, -0.9F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 50).addBox(-4.0F, 2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.75F, 12.8F, -1.1F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(28, 34).addBox(-4.0F, -12.0F, 4.0F, 3.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.2F, 12.4F, -1.1F, 0.0873F, 0.0004F, 0.1309F));
        PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(58, 11).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.025F, 5.05F, 0.5F, 0.0F, -0.829F, 0.0087F));
        PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 62).addBox(1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.025F, 5.05F, 1.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 14).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.975F, 5.05F, 0.525F, 0.0F, 0.829F, -0.0087F));
        PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 58).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.15F, 11.9F, -1.125F, -1.5708F, 0.0F, 0.0524F));
        PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.15F, 11.9F, 0.725F, 1.5708F, 0.0F, 0.0044F));
        PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(16, 58).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.2F, 11.9F, -1.125F, -1.5708F, 0.0F, -0.0175F));
        PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.2F, 11.9F, 0.725F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.15F, 11.9F, -4.775F, 1.5708F, 0.0F, 0.0436F));
        PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-5.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.225F, 11.9F, -4.775F, 1.5708F, 0.0F, -0.0436F));
        PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.725F, 5.125F, -3.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.725F, 4.4F, -4.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.725F, 13.925F, -3.6F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 62).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.725F, 13.2F, -4.2F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.725F, 2.1F, 2.8F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.725F, 2.1F, 2.8F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 60).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.825F, 2.1F, 3.8F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.825F, 2.1F, 3.8F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(22, 60).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.675F, 14.2F, 4.175F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(40, 54).addBox(-1.0F, -11.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.95F, 3.25F, 3.3F, 0.0F, 1.5708F, 1.5621F));
        PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-1.0F, -9.0F, -5.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 10.15F, 1.5F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -9.0F, -5.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 10.15F, 1.5F, 0.0F, 0.0F, 0.0087F));
        PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.3387F, 19.8208F, -0.3087F));
        PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 84).mirror().addBox(-6.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5863F, -3.6208F, 8.9087F, 0.0055F, -0.0017F, -1.5681F));
        PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -9.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 65).mirror().addBox(-6.0F, -9.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.6863F, -3.6208F, 8.9087F, 0.0055F, -0.0017F, -1.5681F));
        PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70",
                CubeListBuilder.create().texOffs(70, 54).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 60).mirror().addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, 0.775F, 2.7174F, -1.7258F, -0.656F, 3.0011F));
        PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 54).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 60).mirror()
                        .addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 118).mirror().addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, 0.775F, -2.1F, 1.7258F, 0.656F, 3.0011F));
        PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 49).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.8F, 1.6F, 0.9924F, -0.7113F, -1.459F, 1.7613F));
        PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 74).mirror().addBox(-6.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.0613F, -3.9208F, 2.5837F, -0.7405F, 0.1296F, -1.6372F));
        PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -5.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 78).addBox(-6.0F, -5.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.6863F, -3.4208F, -1.5913F, -1.2117F, 0.1296F, -1.6372F));
        PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.6863F, -3.4208F, 2.2087F, 1.2117F, -0.1296F, -1.6372F));
        PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 90).addBox(-6.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.0363F, -3.9958F, 2.3337F, -0.6488F, 0.1296F, -1.6372F));
        PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 0).mirror()
                .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0808F, -6.559F, -2.3391F, -0.3259F, 0.5845F, -0.7848F));
        PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78",
                CubeListBuilder.create().texOffs(29, 68).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.44F, 2.0467F, -2.8426F, -0.3722F, -0.1296F, -1.6372F));
        PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 55).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.9363F, -4.2208F, -4.6913F, 0.3434F, -0.1296F, -1.6372F));
        PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80",
                CubeListBuilder.create().texOffs(0, 26).addBox(-8.0F, -9.0F, -5.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 28).mirror().addBox(-8.0F, -9.0F, -5.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.6863F, -6.6208F, 7.0087F, 0.0061F, 0.2165F, -1.5681F));
        PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81",
                CubeListBuilder.create().texOffs(29, 68).addBox(-6.0F, -10.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 0).mirror().addBox(-6.0F, -10.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.8613F, 1.1542F, -3.6913F, -0.0966F, -0.6538F, -0.0772F));
        PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(5.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(89, 0).mirror()
                .addBox(5.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1137F, 1.7792F, -3.2163F, 0.0382F, 0.6589F, 0.2976F));
        PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(5.0F, -6.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 0).mirror()
                .addBox(5.0F, -6.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.5137F, 0.1042F, -1.8413F, 0.4217F, 0.5237F, 0.9664F));
        PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(108, 84).mirror().addBox(-1.0F, -0.5F, -5.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.675F, 0.725F, 1.35F, -1.275F, 1.2505F, 0.0012F));
        PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(120, 104).mirror().addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.55F, 0.725F, 0.0F, 2.2366F, 1.5214F, -2.7496F));
        PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.675F, 1.2F, -2.65F, 1.6936F, 0.0506F, 2.9123F));
        PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.4774F, 1.6F, 0.9924F, -1.4609F, 0.6918F, -2.5474F));
        PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.4774F, 1.6F, -0.375F, 1.4609F, -0.6918F, -2.5474F));
        PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, 1.6F, -0.375F, 1.4609F, 0.6918F, 2.5474F));
        PartDefinition cube_r90 = bone.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, 1.6F, 0.9924F, -1.4609F, -0.6918F, 2.5474F));
        PartDefinition cube_r91 = bone.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(28, 118).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.6F, 0.8F, 2.7174F, -1.7258F, -0.656F, 3.0011F));
        PartDefinition cube_r92 = bone.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(74, 118).addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.2274F, 0.3F, -0.125F, 2.2366F, -1.5214F, 2.7496F));
        PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(74, 118).mirror().addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.55F, 0.3F, -0.125F, 2.2366F, 1.5214F, -2.7496F));
        PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-9.0F, -6.0F, -5.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.7863F, -6.8208F, 3.2837F, -0.5349F, 0.2165F, -1.5681F));
        PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(110, 43).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.2375F, 2.0467F, -2.8426F, -0.3722F, 0.1296F, 1.6372F));
        PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(124, 55).mirror().addBox(5.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-16.6137F, -4.2208F, -4.6913F, 0.3434F, 0.1296F, 1.6372F));
        PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 0).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1637F, 0.1042F, -1.8413F, 0.4217F, -0.5237F, -0.9664F));
        PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.5967F, -6.559F, -2.3391F, -0.3259F, -0.5845F, 0.7848F));
        PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(89, 0).addBox(-6.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5637F, 1.7792F, -3.2163F, 0.0382F, -0.6589F, -0.2976F));
        PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(83, 0).addBox(5.0F, -10.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-17.5387F, 1.1542F, -3.6913F, -0.0966F, 0.6538F, 0.0772F));
        PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(62, 60).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.2774F, 0.775F, 2.7174F, -1.7258F, 0.656F, -3.0011F));
        PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(28, 118).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.2774F, 0.8F, 2.7174F, -1.7258F, 0.656F, -3.0011F));
        PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103",
                CubeListBuilder.create().texOffs(62, 60).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 118).addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.2774F, 0.775F, -2.1F, 1.7258F, -0.656F, -3.0011F));
        PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0F, -0.5F, -8.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.0024F, 1.2F, -2.65F, 1.6936F, -0.0506F, -2.9123F));
        PartDefinition cube_r105 = bone.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(101, 102).addBox(0.0F, -0.5F, -5.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.3524F, 0.725F, 1.35F, -1.275F, -1.2505F, -0.0012F));
        PartDefinition cube_r106 = bone.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(120, 104).addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.2274F, 0.725F, 0.0F, 2.2366F, -1.5214F, 2.7496F));
        PartDefinition cube_r107 = bone.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(121, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.1137F, -6.6208F, -3.8913F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r108 = bone.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.1137F, -5.9208F, -3.2913F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r109 = bone.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(18, 28).addBox(-2.0F, -9.0F, -5.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-13.3637F, -6.6208F, 7.0087F, 0.0061F, -0.2165F, 1.5681F));
        PartDefinition cube_r110 = bone.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(115, 72).addBox(2.0F, -6.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-16.4637F, -6.8708F, 3.3587F, -0.5349F, -0.2165F, 1.5681F));
        PartDefinition cube_r111 = bone.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(57, 34).addBox(2.0F, -6.0F, -5.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-16.4637F, -6.8208F, 3.2837F, -0.5349F, -0.2165F, 1.5681F));
        PartDefinition cube_r112 = bone.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 84).addBox(5.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-13.2637F, -3.6208F, 8.9087F, 0.0055F, 0.0017F, 1.5681F));
        PartDefinition cube_r113 = bone.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(73, 65).addBox(5.0F, -9.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-13.3637F, -3.6208F, 8.9087F, 0.0055F, 0.0017F, 1.5681F));
        PartDefinition cube_r114 = bone.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(22, 90).mirror().addBox(5.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-18.7137F, -3.9958F, 2.3337F, -0.6488F, -0.1296F, 1.6372F));
        PartDefinition cube_r115 = bone.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 74).addBox(5.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-17.7387F, -3.9208F, 2.5837F, -0.7405F, -0.1296F, 1.6372F));
        PartDefinition cube_r116 = bone.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(5.0F, -5.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-18.3637F, -3.4208F, -1.5913F, -1.2117F, -0.1296F, 1.6372F));
        PartDefinition cube_r117 = bone.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(5.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-18.3637F, -3.4208F, 2.2087F, 1.2117F, 0.1296F, 1.6372F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 18).addBox(-0.725F, 0.4F, -2.525F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.2F, 1.5F, 0.0F));
        PartDefinition cube_r118 = LeftArm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 43).addBox(1.0F, -3.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, 1.275F, -0.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r119 = LeftArm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 29).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, 1.275F, -1.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r120 = LeftArm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(56, 54).mirror().addBox(-3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.875F, 3.325F, -1.0F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r121 = LeftArm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-3.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.875F, 3.325F, 1.0F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r122 = LeftArm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(58, 17).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.8F, -3.325F, -1.1F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r123 = LeftArm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 26).addBox(-3.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.5F, 0.925F, 1.0F, -1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r124 = LeftArm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(-2, 62).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 41).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 3.325F, 2.0F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r125 = LeftArm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 2.325F, 0.925F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r126 = LeftArm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 2.325F, -0.925F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r127 = LeftArm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 43).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 1.2F, 2.0F, 0.0F, 0.0F, -0.9163F));
        PartDefinition cube_r128 = LeftArm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(44, 62).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 62).mirror()
                .addBox(0.0F, -2.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.875F, 1.2F, 2.0F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r129 = LeftArm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 1.2F, 0.85F, -0.829F, 0.0F, -1.5708F));
        PartDefinition cube_r130 = LeftArm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 0.2F, 0.925F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r131 = LeftArm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 0.2F, -0.925F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r132 = LeftArm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(26, 64).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.225F, 1.2F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r133 = LeftArm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.225F, 1.2F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r134 = LeftArm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.5F, 1.2F, -0.85F, 0.829F, 0.0F, -1.5708F));
        PartDefinition cube_r135 = LeftArm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(58, 22).addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.175F, 1.125F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r136 = LeftArm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(62, 58).addBox(-3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.65F, 0.875F, -1.575F, 1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r137 = LeftArm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.85F, -3.375F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r138 = LeftArm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.85F, -3.375F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r139 = LeftArm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(62, 58).addBox(-3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.65F, 0.875F, 2.525F, 1.5708F, 0.0F, 0.829F));
        PartDefinition cube_r140 = LeftArm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 22).addBox(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.175F, 1.125F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r141 = LeftArm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(44, 3).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.225F, 0.6F, 0.45F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r142 = LeftArm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 51).addBox(0.0F, -3.0F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.025F, 1.175F, -1.0F, -1.5708F, 0.0F, 0.0F));
        PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(48, 18).addBox(4.0F, -25.0F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.25F, 25.4F, 0.375F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r143 = LeftArm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(44, 3).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.225F, 0.6F, -0.55F, -1.5708F, 0.0F, 0.0F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-3.275F, 0.4F, -2.525F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.2F, 1.5F, 0.0F));
        PartDefinition cube_r144 = RightArm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-2.0F, -3.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5F, 1.275F, -0.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r145 = RightArm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 29).mirror().addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5F, 1.275F, -1.6F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r146 = RightArm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(56, 54).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.875F, 3.325F, -1.0F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r147 = RightArm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(58, 3).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.875F, 3.325F, 1.0F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r148 = RightArm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 17).mirror().addBox(0.0F, -3.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.8F, -3.325F, -1.1F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r149 = RightArm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 26).mirror().addBox(1.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.5F, 0.925F, 1.0F, -1.5708F, 0.0F, -0.829F));
        PartDefinition cube_r150 = RightArm.addOrReplaceChild("cube_r150",
                CubeListBuilder.create().texOffs(-2, 62).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 41).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.125F, 3.325F, 2.0F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r151 = RightArm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 2.325F, 0.925F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r152 = RightArm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 2.325F, -0.925F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r153 = RightArm.addOrReplaceChild("cube_r153",
                CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 43).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.125F, 1.2F, 2.0F, 0.0F, 0.0F, 0.9163F));
        PartDefinition cube_r154 = RightArm.addOrReplaceChild("cube_r154",
                CubeListBuilder.create().texOffs(44, 62).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 62).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.875F, 1.2F, 2.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r155 = RightArm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(22, 64).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 1.2F, 0.85F, -0.829F, 0.0F, 1.5708F));
        PartDefinition cube_r156 = RightArm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 0.2F, 0.925F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r157 = RightArm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(28, 73).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 0.2F, -0.925F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r158 = RightArm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(26, 64).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.225F, 1.2F, -0.525F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r159 = RightArm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(64, 37).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.225F, 1.2F, 0.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r160 = RightArm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, 1.2F, -0.85F, 0.829F, 0.0F, 1.5708F));
        PartDefinition cube_r161 = RightArm.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.175F, 1.125F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r162 = RightArm.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.65F, 0.875F, -1.575F, 1.5708F, 0.0F, -0.829F));
        PartDefinition cube_r163 = RightArm.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.85F, -3.375F, 0.425F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r164 = RightArm.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.0F, -3.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.85F, -3.375F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r165 = RightArm.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.65F, 0.875F, 2.525F, 1.5708F, 0.0F, -0.829F));
        PartDefinition cube_r166 = RightArm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.175F, 1.125F, 4.525F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r167 = RightArm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(44, 3).mirror().addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.225F, 0.6F, 0.45F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r168 = RightArm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-1.0F, -3.0F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.025F, 1.175F, -1.0F, -1.5708F, 0.0F, 0.0F));
        PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-8.0F, -25.0F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.25F, 25.4F, 0.375F, 0.0F, -3.1416F, 0.0F));
        PartDefinition cube_r169 = RightArm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(44, 3).mirror().addBox(0.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.225F, 0.6F, -0.55F, -1.5708F, 0.0F, 0.0F));
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
