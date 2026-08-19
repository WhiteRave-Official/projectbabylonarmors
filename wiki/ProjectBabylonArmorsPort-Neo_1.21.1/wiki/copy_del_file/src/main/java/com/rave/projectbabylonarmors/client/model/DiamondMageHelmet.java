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


public class DiamondMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_mage_helmet"), "main");
    public final ModelPart Head;

    public DiamondMageHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 70).addBox(2.0F, -2.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.325F, -13.65F, 11.875F, -2.3747F, 0.0848F, 0.0136F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 70).addBox(2.0F, -2.0F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.325F, -13.65F, 11.575F, -2.3747F, 0.0848F, 0.0136F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(101, 126).addBox(-3.0F, -2.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.25F, -3.0F, 7.475F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(101, 126).addBox(-3.0F, -2.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.25F, -3.4F, 7.475F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-14.0F, -2.0F, 0.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.0F, -4.1F, 1.4F, -0.2444F, 0.7703F, -0.1719F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 116).addBox(-3.0F, -2.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.6F, -4.1F, 1.225F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 126).addBox(-2.0F, -2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.8F, -4.5F, -1.4F, -0.2444F, 0.7703F, -0.1719F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 126).mirror().addBox(-15.0F, -2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.0F, -4.5F, -1.4F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 116).addBox(-3.0F, -2.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.6F, -4.5F, 1.225F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-14.0F, -2.0F, 0.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.0F, -4.5F, 1.4F, -0.2444F, 0.7703F, -0.1719F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 126).mirror().addBox(-15.0F, -2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.0F, -4.9F, -1.4F, -0.2444F, -0.7703F, 0.1719F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(114, 17).addBox(-0.25F, -0.25F, 2.9F, 0.5F, 0.5F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.75F, -10.95F, 5.8F, -2.7489F, 0.0F, 0.0F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 15).addBox(-0.05F, -1.7F, -2.65F, 0.0F, 3.4F, 7.8F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.7F, -10.95F, 5.7F, -2.7489F, 0.0F, 0.0F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(114, 17).addBox(-0.25F, -0.25F, 2.9F, 0.5F, 0.5F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.15F, -13.75F, 2.5F, -2.3562F, 0.0F, 0.0F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 15).addBox(-0.05F, -1.7F, -2.65F, 0.0F, 3.4F, 7.8F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.1F, -13.75F, 2.4F, -2.3562F, 0.0F, 0.0F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 126).addBox(-2.0F, -2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.8F, -4.9F, -1.4F, -0.2444F, 0.7703F, -0.1719F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-1, 110).addBox(-2.0F, -2.0F, -2.0F, 17.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.9F, -4.45F, -0.4F, -0.2444F, 0.7703F, -0.1719F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 66).addBox(0.0F, -2.0F, 2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.925F, -12.875F, 11.6F, -2.3747F, 0.0848F, 0.0136F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 67).addBox(2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.4F, -15.575F, 10.3F, -2.3411F, 0.0683F, 0.0229F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 59).addBox(1.0F, -2.0F, 2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9F, -16.175F, 8.3F, -1.9921F, 0.0683F, 0.0229F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 59).addBox(1.0F, -2.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.6F, -16.075F, 3.9F, -1.4814F, 0.026F, 0.0389F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -2.0F, 0.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.3F, -14.075F, 0.4F, -1.045F, 0.026F, 0.0389F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 25).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9F, -10.975F, -1.6F, -0.5672F, 0.0F, 0.0F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -8.575F, 0.1F, -0.1746F, 0.0186F, -0.0033F));
        PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -2.0F, -4.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3F, -7.875F, -0.4F, -0.1746F, 0.0186F, -0.0033F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
