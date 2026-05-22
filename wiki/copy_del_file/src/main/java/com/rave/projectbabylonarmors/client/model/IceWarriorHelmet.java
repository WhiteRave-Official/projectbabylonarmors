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


public class IceWarriorHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_warrior_helmet"), "main");
    public final ModelPart Head;

    public IceWarriorHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(0, 12).addBox(-5.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 12).addBox(3.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 39)
                        .addBox(-4.0F, -8.0F, 3.925F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(11, 9)
                        .addBox(-3.0F, -7.0F, -5.15F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 25).addBox(3.0F, -4.0F, -10.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 19)
                        .addBox(-3.0F, -4.0F, -10.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 11).addBox(-3.0F, -4.0F, -10.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 65)
                        .addBox(-0.15F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 15).addBox(-2.85F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
                        .addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 28).addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
                        .addBox(0.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 18).addBox(-3.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 35)
                        .addBox(-3.8F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 54).addBox(2.7F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 0)
                        .addBox(-3.0F, -6.0F, -10.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -5.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8F, -0.4F, -0.6109F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(106, 100).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.4931F, -5.7581F, -1.2F, 0.5672F, 0.0F, 1.0908F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(120, 104).mirror().addBox(-1.0F, -5.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.0181F, -7.0831F, 0.4F, 0.0F, 0.0F, 0.3054F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 85).mirror().addBox(-1.0F, -8.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.8931F, -7.0831F, -0.6F, 0.0F, 0.0F, 0.3054F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 77).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.2931F, -5.8581F, -0.7F, 0.0F, 0.0F, -1.0908F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 77).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.2931F, -5.8581F, -0.7F, 0.0F, 0.0F, 1.0908F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 70).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.2931F, -7.5581F, -0.6F, 0.0F, 0.0F, 0.3054F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(120, 47).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(7.5931F, -9.7581F, -0.6F, 0.0F, 0.0F, -0.3054F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(114, 120).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9F, 0.4F, -3.0F, 0.2054F, -1.0836F, 0.1659F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 120).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.9F, 0.4F, -3.0F, 0.2054F, 1.0836F, -0.1659F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(120, 28).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.9931F, -13.0581F, -0.6F, 0.0F, 0.0F, -0.6109F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(120, 28).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.9931F, -13.0581F, -0.6F, 0.0F, 0.0F, 0.6109F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.5931F, -9.7581F, -0.6F, 0.0F, 0.0F, 0.3054F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(120, 104).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.0181F, -7.0831F, 0.4F, 0.0F, 0.0F, -0.3054F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(120, 85).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.8931F, -7.0831F, -0.6F, 0.0F, 0.0F, -0.3054F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(120, 70).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.2931F, -7.5581F, -0.6F, 0.0F, 0.0F, -0.3054F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 109).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.5931F, -6.3581F, -0.2F, 0.7901F, 0.4242F, 0.3029F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(106, 109).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.5931F, -6.3581F, -0.2F, 0.7901F, -0.4242F, -0.3029F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(106, 100).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.4931F, -5.7581F, -1.2F, 0.5672F, 0.0F, -1.0908F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(58, 24).addBox(3.0F, -13.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.3F, -4.5F, -6.2F, -2.205F, -0.4353F, 0.3008F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 24).addBox(3.0F, -13.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3F, -8.5F, -6.2F, -2.205F, -0.4353F, 0.3008F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-5.0F, -13.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.3F, -8.5F, -6.2F, -2.205F, 0.4353F, -0.3008F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 24).mirror().addBox(-5.0F, -13.0F, -5.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.3F, -4.5F, -6.2F, -2.205F, 0.4353F, -0.3008F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-1.0F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.7609F, -9.0322F, 4.7974F, -1.1183F, 0.149F, 0.2161F));
        PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 15).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.7609F, -9.0322F, 4.7974F, -1.1183F, -0.149F, -0.2161F));
        PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 56).addBox(-5.0F, -15.0F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 9.7F, 1.4F, -0.6109F, 0.0F, 0.0F));
        PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(54, 56).addBox(-5.0F, -15.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 3.7F, 1.4F, -0.6109F, 0.0F, 0.0F));
        PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 56).addBox(-5.0F, -15.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 6.7F, 1.4F, -0.6109F, 0.0F, 0.0F));
        PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(54, 56).addBox(-5.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 1.7F, 0.6F, -0.6109F, 0.0F, 0.0F));
        PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 58).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -10.5862F, 1.4609F, -1.0908F, 0.0F, 0.0F));
        PartDefinition cube_r31 = Head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 45).addBox(-5.0F, -11.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 1.7F, -2.4F, -0.5236F, 0.0F, 0.0F));
        PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32",
                CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 38).addBox(-1.0F, -8.0F, -9.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.375F, 3.975F, 4.025F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33",
                CubeListBuilder.create().texOffs(34, 48).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 33).addBox(-1.0F, -8.0F, -9.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.375F, 3.975F, 4.025F, 0.0F, 0.0F, -0.7854F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
