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


public class GoldenTankHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "golden_tank_helmet"), "main");
    public final ModelPart Head;

    public GoldenTankHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(50, 105).addBox(-3.1F, -7.0F, -4.725F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 20).addBox(-4.6F, -4.7F, 3.7F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 13)
                        .addBox(-0.4F, -4.7F, 3.7F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-2, 26).addBox(3.6F, -4.7F, -3.8F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
                        .addBox(-4.6F, -4.7F, -3.8F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -8.0F, 5.2F, 0.0F, 0.2443F, 0.0F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -8.0F, 5.2F, 0.0F, -0.2443F, 0.0F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -8.0F, 0.2F, 0.0F, 0.2443F, 0.0F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -2.0F, 2.1F, 0.0F, 0.2443F, 0.0F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, 2.1F, 0.0F, -0.2443F, 0.0F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -8.0F, 0.2F, 0.0F, -0.2443F, 0.0F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(93, 124).addBox(-4.0F, -2.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.825F, -7.025F, -5.2F, 0.0F, -0.5672F, -0.5672F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(93, 124).mirror().addBox(-5.0F, -2.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.825F, -7.025F, -5.2F, 0.0F, 0.5672F, 0.5672F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(112, 64).mirror().addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -9.2F, -2.2F, 0.0F, 0.9163F, 0.0F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 64).mirror().addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.7F, -9.2F, 1.8F, 0.0F, 1.9199F, 0.0F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(87, 64).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.7F, -9.2F, 1.7F, 0.0F, -1.9199F, 0.0F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 64).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, -9.2F, -2.2F, 0.0F, -0.9163F, 0.0F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 117).mirror().addBox(-4.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.025F, -5.725F, -2.0F, -1.0455F, 0.3616F, -0.9908F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.125F, -8.425F, -10.5F, -1.5686F, 0.6649F, -1.5926F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.825F, -12.725F, -0.2F, -0.9432F, 0.2913F, -0.7093F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 117).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.825F, -12.725F, -0.2F, -0.9432F, -0.2913F, 0.7093F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 117).mirror().addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.825F, -4.625F, -3.3F, -0.9171F, 0.69F, -0.7394F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 117).addBox(2.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.025F, -5.725F, -2.0F, -1.0455F, -0.3616F, 0.9908F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(93, 117).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.825F, -4.625F, -3.3F, -0.9171F, -0.69F, 0.7394F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 123).addBox(0.0F, 1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.9F, -3.75F, -4.675F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 107).addBox(2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.9F, -3.75F, -4.8F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 88).addBox(2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, -3.75F, -4.675F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(87, 74).addBox(-5.0F, 1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, -4.65F, -4.675F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 118).mirror().addBox(-3.0F, 5.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.15F, 5.2F, -4.675F, 0.0F, 0.0F, -3.1416F));
        PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 118).addBox(2.0F, 5.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.9F, 5.2F, -4.8F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 110).addBox(-5.0F, 5.0F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, 5.25F, -4.675F, 0.0F, -0.017F, 3.1384F));
        PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 89).addBox(-5.0F, 3.0F, -1.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, 1.25F, -4.675F, 0.0F, -0.017F, 3.1384F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
