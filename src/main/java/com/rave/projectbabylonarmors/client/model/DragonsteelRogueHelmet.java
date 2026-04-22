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


public class DragonsteelRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_rogue_helmet"), "main");
    public final ModelPart Hood;

    public DragonsteelRogueHelmet(ModelPart root) {
        this.Hood = root.getChild("Hood");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Hood = partdefinition.addOrReplaceChild("Hood", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Hood.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.85F, -3.55F, 12.7F, 0.0068F, -0.3696F, -1.5547F));
        PartDefinition cube_r2 = Hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 50).addBox(-2.0F, -9.0F, 3.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.15F, 0.9F, 0.475F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r3 = Hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 50).addBox(0.0F, -9.0F, 3.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.15F, 0.9F, 0.475F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r4 = Hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 26).addBox(-3.0F, -5.0F, -5.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.45F, -5.55F, 9.7F, 0.0068F, -0.3696F, -1.5547F));
        PartDefinition cube_r5 = Hood.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 11).addBox(-3.0F, -7.0F, -5.0F, 7.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.45F, -5.85F, 8.0F, 0.0F, 0.0F, -1.5446F));
        PartDefinition cube_r6 = Hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 42).addBox(-6.0F, -9.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.85F, -1.0F, 0.475F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r7 = Hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, 52).addBox(-2.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.7F, 0.9F, 0.475F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r8 = Hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(41, 50).addBox(0.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -4.1F, 0.375F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r9 = Hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 50).addBox(0.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 0.9F, 0.475F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 1).addBox(-7.0F, -10.0F, 3.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.05F, 0.9F, 0.475F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 65).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -10.35F, 0.4F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 67).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -10.35F, 0.4F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 67).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -10.95F, 0.4F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(68, 67).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -9.35F, 0.35F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -9.35F, 0.35F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -10.95F, 0.35F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17",
                CubeListBuilder.create().texOffs(68, 67).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(25, 65).addBox(-1.0F, 2.0F, -4.95F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -10.95F, 0.35F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 73).addBox(-1.0F, 3.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.525F, -12.775F, 0.4F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(124, 93).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, 0.1F, -5.6F, -0.8608F, -0.7356F, -1.1226F));
        PartDefinition cube_r20 = Hood.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(124, 88).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -0.9F, -5.1F, -0.8608F, -0.7356F, -1.1226F));
        PartDefinition cube_r21 = Hood.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(96, 58).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -1.9F, -4.6F, -0.8608F, -0.7356F, -1.1226F));
        PartDefinition cube_r22 = Hood.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(124, 93).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, 0.1F, -5.6F, -0.8608F, 0.7356F, 1.1226F));
        PartDefinition cube_r23 = Hood.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(124, 88).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -0.9F, -5.1F, -0.8608F, 0.7356F, 1.1226F));
        PartDefinition cube_r24 = Hood.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -1.9F, -4.6F, -0.8608F, 0.7356F, 1.1226F));
        PartDefinition cube_r25 = Hood.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.975F, 1.0F, -4.375F, 1.198F, 0.6248F, 0.5864F));
        PartDefinition cube_r26 = Hood.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 117).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.975F, -1.8F, -4.775F, 0.9541F, 0.3874F, 0.0946F));
        PartDefinition cube_r27 = Hood.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 119).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.675F, -4.4F, -5.075F, 0.857F, 0.0366F, -0.3528F));
        PartDefinition cube_r28 = Hood.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 117).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.975F, -1.8F, -4.775F, 0.9541F, -0.3874F, -0.0946F));
        PartDefinition cube_r29 = Hood.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 120).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.375F, -8.3F, -4.675F, 0.1928F, -0.8411F, 1.6357F));
        PartDefinition cube_r30 = Hood.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 120).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.375F, -8.3F, -4.675F, 0.1928F, 0.8411F, -1.6357F));
        PartDefinition cube_r31 = Hood.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 120).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.975F, -6.9F, -5.075F, 0.857F, 0.0366F, -0.3528F));
        PartDefinition cube_r32 = Hood.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 120).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.975F, -6.9F, -5.075F, 0.857F, -0.0366F, 0.3528F));
        PartDefinition cube_r33 = Hood.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(35, 119).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.295F, -6.9715F, -4.213F, 0.857F, -0.0366F, 0.3528F));
        PartDefinition cube_r34 = Hood.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 119).mirror().addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(8.175F, -4.4F, -4.475F, 2.0797F, -1.4286F, -1.5889F));
        PartDefinition cube_r35 = Hood.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 119).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.175F, -4.4F, -4.475F, 2.0797F, 1.4286F, 1.5889F));
        PartDefinition cube_r36 = Hood.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.4817F, 0.1614F, -3.9835F, 1.6391F, -1.0074F, 1.3229F));
        PartDefinition cube_r37 = Hood.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(35, 108).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.4817F, 0.1614F, -3.9835F, 1.6391F, 1.0074F, -1.3229F));
        PartDefinition cube_r38 = Hood.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 108).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.975F, 1.0F, -4.375F, 1.198F, -0.6248F, -0.5864F));
        PartDefinition cube_r39 = Hood.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(120, 18).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.1F, -1.8F, 0.0F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r40 = Hood.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(120, 35).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -8.45F, 0.0F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r41 = Hood.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(95, 37).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -8.45F, 0.0F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r42 = Hood.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.1F, -1.8F, 0.0F, 0.0F, 0.0F, -0.6283F));
        PartDefinition cube_r43 = Hood.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(1, 37).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -8.05F, 0.5F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r44 = Hood.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 35).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -8.05F, 0.5F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r45 = Hood.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 22).addBox(-6.0F, -10.0F, 2.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 9.6F, 0.5F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r46 = Hood.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.1F, -1.4F, 0.5F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r47 = Hood.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, 2.8F, 0.0F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r48 = Hood.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 19).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8F, 2.8F, 0.0F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r49 = Hood.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(1, 19).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 2.5F, 0.5F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r50 = Hood.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.5F, 0.5F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r51 = Hood.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(25, 1).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.1F, -1.4F, 0.5F, 0.0F, 0.0F, -0.6283F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
