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


public class IceRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_rogue_helmet"), "main");
    public final ModelPart Hood;

    public IceRogueHelmet(ModelPart root) {
        this.Hood = root.getChild("Hood");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Hood = partdefinition.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(120, 73).mirror().addBox(-1.0F, -3.2F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Hood.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, -10.175F, -0.8F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r2 = Hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.275F, -0.35F, -1.0F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r3 = Hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 51).addBox(1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.275F, -0.35F, -1.0F, 0.0F, 0.0F, 0.8116F));
        PartDefinition cube_r4 = Hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.85F, -3.55F, 13.2F, 0.0068F, -0.3696F, -1.5547F));
        PartDefinition cube_r5 = Hood.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 49).addBox(-2.0F, -9.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.15F, 0.9F, -0.425F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r6 = Hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 49).addBox(0.0F, -9.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.15F, 0.9F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r7 = Hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 26).addBox(-3.0F, -5.0F, -5.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.45F, -5.55F, 10.2F, 0.0068F, -0.3696F, -1.5547F));
        PartDefinition cube_r8 = Hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 11).addBox(-3.0F, -7.0F, -5.0F, 7.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.45F, -5.85F, 8.5F, 0.0F, 0.0F, -1.5446F));
        PartDefinition cube_r9 = Hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 41).addBox(-6.0F, -9.0F, 3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.85F, -1.0F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.7F, 0.9F, -0.425F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 49).addBox(0.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -4.1F, -0.525F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 49).addBox(0.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.7F, 0.9F, -0.425F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 0).addBox(-7.0F, -10.0F, 3.0F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.05F, 0.9F, -0.425F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 64).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -10.35F, -0.3F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -10.35F, -0.3F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -10.95F, -0.3F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 66).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -9.35F, -0.35F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -9.35F, -0.35F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -10.95F, -0.35F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r20 = Hood.addOrReplaceChild("cube_r20",
                CubeListBuilder.create().texOffs(67, 66).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 64).addBox(-1.0F, 2.0F, -4.95F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -10.95F, -0.35F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r21 = Hood.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(120, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -1.2F, -4.7F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r22 = Hood.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(120, 43).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -1.2F, -4.7F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r23 = Hood.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 58).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -1.2F, -4.7F, 0.8608F, 0.7356F, -1.1226F));
        PartDefinition cube_r24 = Hood.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -1.2F, -4.7F, 0.8608F, -0.7356F, 1.1226F));
        PartDefinition cube_r25 = Hood.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 57).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, -1.2F, -4.7F, 0.9304F, -0.284F, 0.6421F));
        PartDefinition cube_r26 = Hood.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(95, 45).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, -1.2F, -4.7F, 0.9304F, 0.284F, -0.6421F));
        PartDefinition cube_r27 = Hood.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(120, 18).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.1F, -1.8F, -0.6F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r28 = Hood.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(120, 35).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -8.45F, -0.6F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r29 = Hood.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(95, 37).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -8.45F, -0.6F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r30 = Hood.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.1F, -1.8F, -0.6F, 0.0F, 0.0F, -0.6283F));
        PartDefinition cube_r31 = Hood.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1, 37).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -8.05F, -0.4F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r32 = Hood.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 35).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -8.05F, -0.4F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r33 = Hood.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 22).addBox(-6.0F, -10.0F, 3.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 9.6F, -0.4F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r34 = Hood.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 18).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.1F, -1.4F, -0.4F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r35 = Hood.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.8F, 2.8F, -0.6F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r36 = Hood.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 19).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8F, 2.8F, -0.6F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r37 = Hood.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1, 19).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 2.5F, -0.4F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r38 = Hood.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.4F, 2.5F, -0.4F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r39 = Hood.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 1).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.1F, -1.4F, -0.4F, 0.0F, 0.0F, -0.6283F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
