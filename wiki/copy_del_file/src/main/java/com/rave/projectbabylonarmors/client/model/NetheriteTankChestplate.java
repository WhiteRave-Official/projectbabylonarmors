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


public class NetheriteTankChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_tank_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public NetheriteTankChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(108, 18).addBox(-2.5F, 7.2F, 2.575F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(97, 88)
                .addBox(-4.0F, -2.0F, 3.2F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-7, -6).addBox(-1.5F, 0.075F, -6.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(103, 100).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.55F, 3.2F, 0.05F, 0.0F, 0.6981F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(103, 100).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.55F, 3.2F, 0.05F, 0.0F, -0.6981F, 0.0F));
        PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(105, 59).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.15F, 4.7F, 0.2356F, 0.0F, 0.0F));
        PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, -8.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 19.0F, 4.2F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(1, 27).addBox(-1.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, 19.2F, -4.1F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(32, 9).addBox(-2.0F, -2.0F, -8.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 8.1F, -6.9F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(24, 79).addBox(-4.248F, -3.312F, -1.968F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.32F, 4.2496F, -4.2644F, 1.5397F, 0.0306F, 0.7762F));
        PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(18, 65).addBox(-2.1388F, -2.1972F, -2.7958F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1082F, 2.1439F, -5.7123F, 1.5399F, 0.0308F, 0.7849F));
        PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
                CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-6.0F, -10.0F, -8.0F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 49).addBox(-10.95F, -10.0F, -8.0F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.975F, 6.85F, -8.0F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(30, 27).mirror().addBox(-2.0F, -2.0F, -8.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.95F, 8.2F, -1.8F, -1.5708F, 0.9599F, 0.0F));
        PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(30, 27).addBox(-6.0F, -2.0F, -8.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.95F, 8.2F, -1.8F, -1.5708F, -0.9599F, 0.0F));
        PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(34, 74).addBox(-2.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.725F, 9.95F, 4.5F, 1.5034F, 0.1611F, 1.1727F));
        PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(24, 84).addBox(2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.825F, 7.1F, 3.9F, 1.6269F, -0.0576F, 1.5694F));
        PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(17, 74).addBox(-5.0F, -2.0F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.725F, 9.975F, 4.5F, 1.5034F, -0.1611F, -1.1727F));
        PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(64, 75).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.075F, 12.475F, -4.05F, -1.5205F, 0.1209F, -1.1751F));
        PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(50, 75).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.125F, 12.475F, -4.05F, -1.5205F, -0.1209F, 1.1751F));
        PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(0, 94).addBox(-2.0F, -3.0F, -7.0F, 7.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.525F, 5.0F, 1.675F, -1.6144F, 0.0F, 0.0F));
        PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(1, 0).addBox(-2.0F, -3.0F, -7.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.525F, 11.4F, -3.55F, -1.0472F, 0.0F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(104, 38).addBox(-2.0F, 1.4F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 36)
                .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(41, 95).addBox(-1.0F, 7.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.5F, 2.0F, 0.0F));
        PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(70, 106).addBox(-0.54F, -6.64F, -6.56F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0305F, 14.9245F, -4.125F, -1.5708F, 0.0F, 0.0044F));
        PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(70, 106).addBox(-0.54F, -6.64F, -6.56F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0305F, 12.9245F, -4.125F, -1.5708F, 0.0F, 0.0044F));
        PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(56, 25).addBox(-2.54F, -6.64F, -6.56F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0305F, 5.9245F, -4.125F, -1.5708F, 0.0F, 0.0044F));
        PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(46, 36).addBox(-3.56F, -7.64F, -3.46F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(84, 85)
                        .addBox(-3.56F, -6.64F, -4.36F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 86).addBox(-3.56F, -6.64F, 2.44F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.65F, 7.5245F, 0.4695F, 0.0F, 0.0F, 1.5708F));
        PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(32, 22).addBox(-6.56F, -3.64F, -1.54F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, -3.5755F, -4.6695F, 0.0F, 0.925F, 1.789F));
        PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(36, 79).addBox(-5.56F, -3.64F, -1.54F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.05F, 1.0995F, -5.8945F, 0.0F, 0.2618F, 1.789F));
        PartDefinition LeftArm_r7 = LeftArm.addOrReplaceChild("LeftArm_r7", CubeListBuilder.create().texOffs(80, 42).addBox(-5.56F, -6.64F, -1.54F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.4F, 2.8995F, -5.8945F, 0.0F, 0.2618F, 1.789F));
        PartDefinition LeftArm_r8 = LeftArm.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(0, 76).addBox(-1.56F, -7.64F, -1.54F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -0.9755F, -5.0195F, 0.0F, 0.2618F, 1.789F));
        PartDefinition LeftArm_r9 = LeftArm.addOrReplaceChild("LeftArm_r9", CubeListBuilder.create().texOffs(70, 14).addBox(-6.56F, -3.64F, -1.54F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, -1.5755F, -4.6695F, 0.0F, 0.925F, 1.789F));
        PartDefinition LeftArm_r10 = LeftArm.addOrReplaceChild("LeftArm_r10", CubeListBuilder.create().texOffs(16, 49).addBox(-6.56F, -5.64F, -1.54F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.5755F, -4.6695F, 0.0F, 0.925F, 1.789F));
        PartDefinition LeftArm_r11 = LeftArm.addOrReplaceChild("LeftArm_r11", CubeListBuilder.create().texOffs(64, 80).addBox(-5.56F, -3.64F, -1.54F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.725F, 3.0995F, -5.8945F, 0.0F, 0.2618F, 1.789F));
        PartDefinition LeftArm_r12 = LeftArm.addOrReplaceChild("LeftArm_r12", CubeListBuilder.create().texOffs(52, 9).addBox(-6.56F, -5.64F, -0.46F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.5755F, 4.6695F, 0.0F, -0.925F, 1.789F));
        PartDefinition LeftArm_r13 = LeftArm.addOrReplaceChild("LeftArm_r13", CubeListBuilder.create().texOffs(48, 80).addBox(-5.56F, -6.64F, -0.46F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.4F, 2.8995F, 5.8945F, 0.0F, -0.2618F, 1.789F));
        PartDefinition LeftArm_r14 = LeftArm.addOrReplaceChild("LeftArm_r14", CubeListBuilder.create().texOffs(0, 72).addBox(-6.56F, -3.64F, -0.46F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, -3.5755F, 4.6695F, 0.0F, -0.925F, 1.789F));
        PartDefinition LeftArm_r15 = LeftArm.addOrReplaceChild("LeftArm_r15", CubeListBuilder.create().texOffs(80, 30).addBox(-5.56F, -3.64F, -0.46F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.05F, 1.0995F, 5.8945F, 0.0F, -0.2618F, 1.789F));
        PartDefinition LeftArm_r16 = LeftArm.addOrReplaceChild("LeftArm_r16", CubeListBuilder.create().texOffs(70, 18).addBox(-6.56F, -3.64F, -0.46F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, -1.5755F, 4.6695F, 0.0F, -0.925F, 1.789F));
        PartDefinition LeftArm_r17 = LeftArm.addOrReplaceChild("LeftArm_r17", CubeListBuilder.create().texOffs(62, 33).addBox(-6.56F, -5.64F, -1.54F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.275F, -1.5755F, -2.6695F, 0.2077F, 0.7304F, 2.2129F));
        PartDefinition LeftArm_r18 = LeftArm.addOrReplaceChild("LeftArm_r18", CubeListBuilder.create().texOffs(62, 39).addBox(-6.56F, -5.64F, -0.46F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.275F, -1.5755F, 2.6695F, -0.2077F, -0.7304F, 2.2129F));
        PartDefinition LeftArm_r19 = LeftArm.addOrReplaceChild("LeftArm_r19", CubeListBuilder.create().texOffs(82, 56).addBox(-5.56F, -3.64F, -0.46F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.725F, 3.0995F, 5.8945F, 0.0F, -0.2618F, 1.789F));
        PartDefinition LeftArm_r20 = LeftArm.addOrReplaceChild("LeftArm_r20", CubeListBuilder.create().texOffs(8, 76).addBox(-1.56F, -7.64F, -0.46F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -1.1005F, 4.9695F, 0.0F, -0.2618F, 1.789F));
        PartDefinition LeftArm_r21 = LeftArm.addOrReplaceChild("LeftArm_r21", CubeListBuilder.create().texOffs(70, 70).addBox(-4.56F, -3.64F, -2.46F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.15F, 6.8245F, 2.8195F, 0.0F, -0.7854F, 1.5708F));
        PartDefinition LeftArm_r22 = LeftArm.addOrReplaceChild("LeftArm_r22", CubeListBuilder.create().texOffs(64, 84).addBox(-3.56F, -3.64F, -2.46F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.65F, 6.0995F, 2.7945F, 0.0F, -0.7854F, 1.5708F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-4.0F, 1.4F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 36).mirror()
                        .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(41, 95).mirror().addBox(-3.0F, 7.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false),
                PartPose.offset(-5.5F, 2.0F, 0.0F));
        PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(70, 106).mirror().addBox(-2.46F, -6.64F, -6.56F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.0305F, 14.9245F, -4.125F, -1.5708F, 0.0F, -0.0044F));
        PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(70, 106).mirror().addBox(-2.46F, -6.64F, -6.56F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.0305F, 12.9245F, -4.125F, -1.5708F, 0.0F, -0.0044F));
        PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(56, 25).mirror().addBox(-2.46F, -6.64F, -6.56F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.0305F, 5.9245F, -4.125F, -1.5708F, 0.0F, -0.0044F));
        PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4",
                CubeListBuilder.create().texOffs(46, 36).mirror().addBox(1.56F, -7.64F, -3.46F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 85).mirror()
                        .addBox(1.56F, -6.64F, -4.36F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 86).mirror().addBox(1.56F, -6.64F, 2.44F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.65F, 7.5245F, 0.4695F, 0.0F, 0.0F, -1.5708F));
        PartDefinition RightArm_r5 = RightArm.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-0.44F, -3.64F, -1.54F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.0F, -3.5755F, -4.6695F, 0.0F, -0.925F, -1.789F));
        PartDefinition RightArm_r6 = RightArm.addOrReplaceChild("RightArm_r6", CubeListBuilder.create().texOffs(36, 79).mirror().addBox(2.56F, -3.64F, -1.54F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.05F, 1.0995F, -5.8945F, 0.0F, -0.2618F, -1.789F));
        PartDefinition RightArm_r7 = RightArm.addOrReplaceChild("RightArm_r7", CubeListBuilder.create().texOffs(80, 42).mirror().addBox(4.56F, -6.64F, -1.54F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.4F, 2.8995F, -5.8945F, 0.0F, -0.2618F, -1.789F));
        PartDefinition RightArm_r8 = RightArm.addOrReplaceChild("RightArm_r8", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.44F, -7.64F, -1.54F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -0.9755F, -5.0195F, 0.0F, -0.2618F, -1.789F));
        PartDefinition RightArm_r9 = RightArm.addOrReplaceChild("RightArm_r9", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-0.44F, -3.64F, -1.54F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.775F, -1.5755F, -4.6695F, 0.0F, -0.925F, -1.789F));
        PartDefinition RightArm_r10 = RightArm.addOrReplaceChild("RightArm_r10", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-0.44F, -5.64F, -1.54F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -1.5755F, -4.6695F, 0.0F, -0.925F, -1.789F));
        PartDefinition RightArm_r11 = RightArm.addOrReplaceChild("RightArm_r11", CubeListBuilder.create().texOffs(64, 80).mirror().addBox(3.56F, -3.64F, -1.54F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.725F, 3.0995F, -5.8945F, 0.0F, -0.2618F, -1.789F));
        PartDefinition RightArm_r12 = RightArm.addOrReplaceChild("RightArm_r12", CubeListBuilder.create().texOffs(52, 9).mirror().addBox(-0.44F, -5.64F, -0.46F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -1.5755F, 4.6695F, 0.0F, 0.925F, -1.789F));
        PartDefinition RightArm_r13 = RightArm.addOrReplaceChild("RightArm_r13", CubeListBuilder.create().texOffs(48, 80).mirror().addBox(4.56F, -6.64F, -0.46F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.4F, 2.8995F, 5.8945F, 0.0F, 0.2618F, -1.789F));
        PartDefinition RightArm_r14 = RightArm.addOrReplaceChild("RightArm_r14", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.44F, -3.64F, -0.46F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.0F, -3.5755F, 4.6695F, 0.0F, 0.925F, -1.789F));
        PartDefinition RightArm_r15 = RightArm.addOrReplaceChild("RightArm_r15", CubeListBuilder.create().texOffs(80, 30).mirror().addBox(2.56F, -3.64F, -0.46F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.05F, 1.0995F, 5.8945F, 0.0F, 0.2618F, -1.789F));
        PartDefinition RightArm_r16 = RightArm.addOrReplaceChild("RightArm_r16", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-0.44F, -3.64F, -0.46F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.775F, -1.5755F, 4.6695F, 0.0F, 0.925F, -1.789F));
        PartDefinition RightArm_r17 = RightArm.addOrReplaceChild("RightArm_r17", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-0.44F, -5.64F, -1.54F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.275F, -1.5755F, -2.6695F, 0.2077F, -0.7304F, -2.2129F));
        PartDefinition RightArm_r18 = RightArm.addOrReplaceChild("RightArm_r18", CubeListBuilder.create().texOffs(62, 39).mirror().addBox(-0.44F, -5.64F, -0.46F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.275F, -1.5755F, 2.6695F, -0.2077F, 0.7304F, -2.2129F));
        PartDefinition RightArm_r19 = RightArm.addOrReplaceChild("RightArm_r19", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(3.56F, -3.64F, -0.46F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.725F, 3.0995F, 5.8945F, 0.0F, 0.2618F, -1.789F));
        PartDefinition RightArm_r20 = RightArm.addOrReplaceChild("RightArm_r20", CubeListBuilder.create().texOffs(8, 76).mirror().addBox(-0.44F, -7.64F, -0.46F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -1.1005F, 4.9695F, 0.0F, 0.2618F, -1.789F));
        PartDefinition RightArm_r21 = RightArm.addOrReplaceChild("RightArm_r21", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(1.56F, -3.64F, -2.46F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.15F, 6.8245F, 2.8195F, 0.0F, 0.7854F, -1.5708F));
        PartDefinition RightArm_r22 = RightArm.addOrReplaceChild("RightArm_r22", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(1.56F, -3.64F, -2.46F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.65F, 6.0995F, 2.7945F, 0.0F, 0.7854F, -1.5708F));
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
