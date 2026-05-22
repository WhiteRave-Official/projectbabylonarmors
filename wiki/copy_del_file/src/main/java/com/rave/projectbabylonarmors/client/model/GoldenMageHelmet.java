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


public class GoldenMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "golden_mage_helmet"), "main");
    public final ModelPart Hood;

    public GoldenMageHelmet(ModelPart root) {
        this.Hood = root.getChild("Hood");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Hood = partdefinition.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(64, 120).addBox(-0.85F, -11.1F, -4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Hood.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-9.0F, -2.0F, 0.0F, 11.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, -2.9F, -4.575F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r2 = Hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 34).addBox(-2.0F, -2.0F, 0.0F, 11.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -2.9F, -4.6F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r3 = Hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, -13.275F, -3.0F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r4 = Hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.75F, -0.35F, 11.1F, -0.2697F, -0.2561F, -0.707F));
        PartDefinition cube_r5 = Hood.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 49).addBox(1.0F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.15F, 1.4F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r6 = Hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-2.0F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.15F, 1.4F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r7 = Hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7F, -9.3F, -2.0F, 0.0F, 0.1745F, 0.0F));
        PartDefinition cube_r8 = Hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.6F, -15.3F, -6.7F, -1.1345F, 0.9163F, 0.0F));
        PartDefinition cube_r9 = Hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.0F, -9.3F, 1.9F, 0.0F, -0.6981F, 0.0F));
        PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 121).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.2F, -9.3F, 4.9F, -0.92F, -1.0685F, 0.5002F));
        PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 121).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.5F, -7.7F, 6.9F, -2.5047F, -0.871F, 2.9695F));
        PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 103).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.4F, -6.6F, 3.4F, -3.1212F, -0.6092F, 2.6722F));
        PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 121).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(10.5F, -4.9F, 8.3F, -0.9868F, -1.0938F, 1.274F));
        PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 121).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-10.5F, -4.9F, 8.3F, -0.9868F, 1.0938F, -1.274F));
        PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(110, 121).mirror().addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.5F, -7.7F, 6.9F, -2.5047F, 0.871F, -2.9695F));
        PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(114, 18).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.6F, -15.3F, -6.7F, -1.1345F, -0.9163F, 0.0F));
        PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(114, 32).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.7F, -11.3F, -5.1F, -0.48F, -0.9163F, 0.0F));
        PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.0F, -9.3F, 1.9F, 0.0F, 0.6981F, 0.0F));
        PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.7F, -9.3F, -2.0F, 0.0F, -0.1745F, 0.0F));
        PartDefinition cube_r20 = Hood.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.2F, -9.3F, 4.9F, -0.92F, 1.0685F, -0.5002F));
        PartDefinition cube_r21 = Hood.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(112, 103).mirror().addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.4F, -6.6F, 3.4F, -3.1212F, 0.6092F, -2.6722F));
        PartDefinition cube_r22 = Hood.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(114, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.7F, -11.3F, -5.1F, -0.48F, 0.9163F, 0.0F));
        PartDefinition cube_r23 = Hood.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-2.0F, -8.0F, 3.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.15F, 0.9F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r24 = Hood.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 49).addBox(1.0F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.15F, 2.5F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r25 = Hood.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-2.0F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.15F, 2.5F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r26 = Hood.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-2.0F, -10.0F, 3.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.15F, 1.8F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r27 = Hood.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1, 51).mirror().addBox(0.0F, -6.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.7F, 0.2F, -0.425F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r28 = Hood.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 49).addBox(1.0F, -8.0F, 3.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.15F, 0.9F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r29 = Hood.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 49).addBox(1.0F, -10.0F, 3.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.15F, 1.8F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r30 = Hood.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 26).addBox(-3.0F, -5.0F, -5.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.75F, -2.35F, 8.1F, -0.2697F, -0.2561F, -0.707F));
        PartDefinition cube_r31 = Hood.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 11).addBox(-3.0F, -7.0F, -5.0F, 7.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.85F, -2.05F, 8.1F, 0.0F, 0.0F, -0.7505F));
        PartDefinition cube_r32 = Hood.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(1.0F, -9.0F, 3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.55F, -1.9F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r33 = Hood.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(1.0F, -9.0F, 3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.55F, -1.1F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r34 = Hood.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(50, 41).addBox(-4.0F, -9.0F, 3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.65F, -1.8F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r35 = Hood.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(50, 41).addBox(-4.0F, -9.0F, 3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.55F, -1.1F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r36 = Hood.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(1, 51).mirror().addBox(0.0F, -5.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.5F, -0.2F, -0.425F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r37 = Hood.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1, 51).addBox(-1.0F, -5.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.5F, -0.2F, -0.425F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r38 = Hood.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 51).addBox(-1.0F, -6.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.7F, 0.2F, -0.425F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r39 = Hood.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 49).addBox(0.0F, -6.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.7F, 0.6F, -0.425F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r40 = Hood.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(116, 0).mirror().addBox(0.0F, -10.0F, 3.0F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.125F, 0.8F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r41 = Hood.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(116, 0).addBox(-4.0F, -10.0F, 3.0F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.1F, 0.8F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r42 = Hood.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -17.05F, -2.55F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r43 = Hood.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 75).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -17.05F, -2.55F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r44 = Hood.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(66, 52).addBox(-1.0F, -10.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.15F, -0.5F, -1.2F, 0.0F, 0.0F, -0.6283F));
        PartDefinition cube_r45 = Hood.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(88, 65).addBox(-1.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.375F, 8.5F, -1.175F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r46 = Hood.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-1.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.225F, 1.0F, -1.2F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r47 = Hood.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(86, 65).mirror().addBox(0.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.475F, 8.5F, -1.175F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r48 = Hood.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 70).addBox(0.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.225F, 1.0F, -1.2F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r49 = Hood.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(0.0F, -10.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.15F, -0.5F, -1.2F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r50 = Hood.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(0.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.95F, -7.45F, -1.2F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r51 = Hood.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 88).addBox(-1.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.95F, -7.45F, -1.2F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r52 = Hood.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(0.0F, -6.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.95F, -8.65F, -0.3F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r53 = Hood.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -6.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.95F, -8.65F, -0.3F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r54 = Hood.addOrReplaceChild(
                "cube_r54", CubeListBuilder.create().texOffs(67, 29).mirror().addBox(0.0F, -10.0F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 21).mirror()
                        .addBox(0.0F, -10.0F, -8.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 21).mirror().addBox(0.0F, -10.0F, -1.05F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.475F, 9.4F, 2.725F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r55 = Hood.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(66, 29).addBox(-4.0F, -10.0F, -5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 21)
                        .addBox(-4.0F, -10.0F, -8.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 21).addBox(-4.0F, -10.0F, -1.05F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.375F, 9.4F, 2.725F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r56 = Hood.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(1, 18).mirror().addBox(-1.0F, -8.0F, -5.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.225F, 1.9F, -0.3F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r57 = Hood.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(1, 18).addBox(0.0F, -8.0F, -5.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.225F, 1.9F, -0.3F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r58 = Hood.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(0.0F, -10.0F, -5.0F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.15F, -1.7F, -0.3F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r59 = Hood.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -10.0F, -5.0F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.15F, -1.7F, -0.3F, 0.0F, 0.0F, -0.6283F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
