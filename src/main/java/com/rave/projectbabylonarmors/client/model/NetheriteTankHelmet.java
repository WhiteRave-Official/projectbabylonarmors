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


public class NetheriteTankHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_tank_helmet"), "main");
    public final ModelPart bone;

    public NetheriteTankHelmet(ModelPart root) {
        this.bone = root.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition bone = partdefinition.addOrReplaceChild("bone",
                CubeListBuilder.create().texOffs(0, 6).addBox(-2.925F, -2.4F, 4.475F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6).mirror().addBox(-5.075F, -2.4F, 4.475F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 56).addBox(-3.0F, -7.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.8F, -6.775F, -2.3F, -1.3989F, 0.4971F, 2.6617F));
        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 56).addBox(-3.0F, -7.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.8F, -5.675F, -7.0F, -1.3989F, 0.4971F, 2.6617F));
        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 8).addBox(1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.45F, -2.975F, -7.75F, 1.042F, -0.7172F, 0.5121F));
        PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -5.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6F, -1.775F, -3.525F, 2.0283F, -0.7594F, -0.8354F));
        PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, 1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.4F, -3.975F, -0.2F, -2.9967F, -0.7139F, -2.2118F));
        PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(0.0F, -7.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.8F, -5.675F, -7.0F, -1.3989F, -0.4971F, -2.6617F));
        PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(0.0F, -7.0F, 1.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.8F, -6.775F, -2.3F, -1.3989F, -0.4971F, -2.6617F));
        PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -6.0F, 1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.4F, -3.975F, -0.2F, -2.9967F, 0.7139F, 2.2118F));
        PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 8).mirror().addBox(-2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.45F, -2.975F, -7.75F, 1.042F, 0.7172F, -0.5121F));
        PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.0F, -5.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.6F, -1.775F, -3.525F, 2.0283F, 0.7594F, 0.8354F));
        PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.0F, -5.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.2F, -9.475F, -2.525F, 0.1053F, 0.8344F, -0.7606F));
        PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 8).mirror().addBox(-2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.05F, -13.375F, -3.95F, 0.0712F, -0.1225F, -0.8474F));
        PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -6.0F, 1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.0F, -7.275F, 1.3F, -1.0304F, 0.916F, -2.4072F));
        PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(0.0F, -6.0F, 1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.4F, -7.075F, -2.0F, -1.3989F, -0.4971F, -2.6617F));
        PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 8).addBox(1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.05F, -13.375F, -3.95F, 0.0712F, 0.1225F, 0.8474F));
        PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -5.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.2F, -9.475F, -2.525F, 0.1053F, -0.8344F, 0.7606F));
        PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, 1.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.0F, -7.275F, 1.3F, -1.0304F, -0.916F, 2.4072F));
        PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 10).addBox(-5.0F, -6.0F, 1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.4F, -7.075F, -2.0F, -1.3989F, 0.4971F, 2.6617F));
        PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 8).addBox(-1.0F, -6.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.325F, -5.0F, -3.0F, -1.5708F, 0.0F, 2.7053F));
        PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(14, 16).addBox(0.0F, -3.0F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, -6.55F, 4.075F, 1.5708F, -1.0036F, -1.5708F));
        PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 28).mirror().addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.175F, -0.375F, 3.475F, 0.0F, 0.9425F, 0.0F));
        PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.675F, -0.375F, 6.325F, 0.0F, 1.6144F, 0.0F));
        PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 15).addBox(-4.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.675F, -0.375F, 6.325F, 0.0F, -1.6144F, 0.0F));
        PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 10).addBox(-4.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.325F, -0.375F, 0.675F, 0.0F, -1.6144F, 0.0F));
        PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 24).mirror().addBox(1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.9F, -0.375F, -2.025F, 0.0F, 0.9512F, 0.0F));
        PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 28).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.175F, -0.375F, 3.475F, 0.0F, -0.9425F, 0.0F));
        PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(16, 10).mirror().addBox(-2.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.325F, -0.375F, 0.675F, 0.0F, 1.6144F, 0.0F));
        PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(14, 24).addBox(-6.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.9F, -0.375F, -2.025F, 0.0F, -0.9512F, 0.0F));
        PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 29).mirror().addBox(-1.0F, -5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.425F, -2.1F, -0.6F, 0.0F, 1.3526F, 0.0F));
        PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(0.0F, -3.0F, -1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.225F, -4.4F, 3.8F, 0.0F, 2.0071F, 0.0F));
        PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 29).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.425F, -2.1F, -0.6F, 0.0F, -1.3526F, 0.0F));
        PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 48).addBox(-6.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.675F, -3.75F, 1.225F, -0.6109F, -1.3526F, 0.0F));
        PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 48).addBox(5.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.675F, -3.75F, 1.225F, -0.6109F, 1.3526F, 0.0F));
        PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(16, 14).addBox(-4.0F, 3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.45F, -4.4F, 6.575F, 0.0F, -1.9199F, 0.0F));
        PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 0).addBox(-4.0F, -3.0F, -1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.225F, -4.4F, 3.8F, 0.0F, -2.0071F, 0.0F));
        PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, -3.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, -4.1F, -4.025F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 6).addBox(0.0F, -3.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, -4.1F, -3.925F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.95F, -0.35F, -4.05F, -1.5708F, 1.5621F, -1.5708F));
        PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 21).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.95F, -2.975F, -4.55F, -1.5708F, 1.0908F, -1.5708F));
        PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.95F, -0.35F, -4.05F, -1.5708F, -1.5621F, 1.5708F));
        PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.95F, -2.975F, -4.55F, -1.5708F, -1.0908F, 1.5708F));
        PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(8, 48).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.925F, -6.125F, -3.125F, -1.5708F, -0.4451F, 1.5708F));
        PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.925F, -6.875F, -3.8F, -1.5708F, -0.0087F, 1.5708F));
        PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(48, 4).mirror().addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.925F, -6.175F, 3.55F, 1.5708F, -0.4451F, -1.5708F));
        PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(8, 48).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.925F, -6.125F, -3.125F, -1.5708F, 0.4451F, -1.5708F));
        PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 22).addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.925F, -6.875F, -3.8F, -1.5708F, 0.0087F, -1.5708F));
        PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.925F, -6.175F, 3.55F, 1.5708F, 0.4451F, 1.5708F));
        PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(16, 43).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.95F, -0.35F, 4.525F, 1.5708F, -1.5272F, -1.5708F));
        PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(-1.0F, -4.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.95F, -2.975F, 4.925F, 1.5708F, 1.0908F, 1.5708F));
        PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 43).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.95F, -0.35F, 4.525F, 1.5708F, 1.5272F, 1.5708F));
        PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 43).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.95F, -2.975F, 4.925F, 1.5708F, -1.0908F, -1.5708F));
        PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.975F, -2.35F, -3.775F, 1.5708F, -1.5272F, -1.5708F));
        PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.975F, -8.175F, 3.55F, 1.5708F, 0.4451F, 1.5708F));
        PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(36, 22).addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.975F, -8.875F, -3.8F, -1.5708F, 0.0087F, -1.5708F));
        PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(8, 48).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.975F, -8.125F, -3.125F, -1.5708F, 0.4451F, -1.5708F));
        PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.975F, -8.1F, 3.525F, 1.5708F, 0.4451F, 1.5708F));
        PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 35).addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.975F, -8.8F, -3.825F, -1.5708F, 0.0087F, -1.5708F));
        PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(32, 46).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.975F, -8.05F, -3.15F, -1.5708F, 0.4451F, -1.5708F));
        PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 38).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -5.5F, -5.225F, -1.5708F, -1.0908F, 1.5708F));
        PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -9.075F, -2.95F, -1.5708F, -0.4451F, 1.5708F));
        PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(24, 35).mirror().addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -9.825F, -3.625F, -1.5708F, -0.0087F, 1.5708F));
        PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -9.125F, 3.725F, 1.5708F, -0.4451F, -1.5708F));
        PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(32, 29).mirror().addBox(-1.0F, -3.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -6.5F, 5.575F, 1.5708F, 1.0908F, 1.5708F));
        PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(28, 22).mirror().addBox(-1.0F, -3.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -3.425F, 5.175F, -1.5708F, 1.309F, -1.5708F));
        PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -6.5F, 5.575F, 1.5708F, -1.0908F, -1.5708F));
        PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(40, 33).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -9.125F, 3.725F, 1.5708F, 0.4451F, 1.5708F));
        PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(24, 35).addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -9.825F, -3.625F, -1.5708F, 0.0087F, -1.5708F));
        PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -5.5F, -5.225F, -1.5708F, 1.0908F, -1.5708F));
        PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(24, 41).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -9.075F, -2.95F, -1.5708F, 0.4451F, -1.5708F));
        PartDefinition cube_r70 = bone.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(8, 43).mirror().addBox(-1.0F, -4.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.0F, -4.975F, 4.925F, 1.5708F, 1.0908F, 1.5708F));
        PartDefinition cube_r71 = bone.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.0F, -2.35F, 4.525F, 1.5708F, -1.5272F, -1.5708F));
        PartDefinition cube_r72 = bone.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -2.35F, 4.525F, 1.5708F, 1.5272F, 1.5708F));
        PartDefinition cube_r73 = bone.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.975F, -2.35F, -3.775F, 1.5708F, 1.5272F, 1.5708F));
        PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(8, 43).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -4.975F, 4.925F, 1.5708F, -1.0908F, -1.5708F));
        PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(32, 41).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.0F, -4.975F, -4.55F, -1.5708F, -1.0908F, 1.5708F));
        PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(32, 41).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -4.975F, -4.55F, -1.5708F, 1.0908F, -1.5708F));
        PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -10.225F, 3.725F, 1.5708F, 0.4451F, 1.5708F));
        PartDefinition cube_r78 = bone.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 11).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -10.175F, -2.95F, -1.5708F, 0.4451F, -1.5708F));
        PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -10.925F, -3.625F, -1.5708F, 0.0087F, -1.5708F));
        PartDefinition cube_r80 = bone.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 22).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -3.425F, 5.175F, -1.5708F, -1.309F, 1.5708F));
        PartDefinition cube_r81 = bone.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 6).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -1.525F, 5.175F, -1.5708F, -1.309F, 1.5708F));
        PartDefinition cube_r82 = bone.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(40, 28).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -4.175F, 5.925F, 0.0F, -1.5708F, 0.0F));
        PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(8, 32).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -7.6F, 5.575F, 1.5708F, -1.0908F, -1.5708F));
        PartDefinition cube_r84 = bone.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(16, 32).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -5.125F, -7.275F, -1.5708F, 0.829F, -1.5708F));
        PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -6.6F, -5.225F, -1.5708F, 1.0908F, -1.5708F));
        PartDefinition cube_r86 = bone.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 28).addBox(-3.0F, -2.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, -5.025F, -6.275F, 0.0F, -0.5236F, 0.0F));
        PartDefinition cube_r87 = bone.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(26, 18).addBox(-1.0F, -2.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -5.025F, -6.275F, 0.0F, 0.5236F, 0.0F));
        PartDefinition cube_r88 = bone.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(46, 0).addBox(1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -3.8F, -5.0F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r89 = bone.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(16, 38).addBox(0.0F, -3.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, -4.1F, -3.925F, 0.0F, 1.5708F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
