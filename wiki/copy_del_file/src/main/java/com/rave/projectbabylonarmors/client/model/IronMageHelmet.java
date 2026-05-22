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


public class IronMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_mage_helmet"), "main");
    public final ModelPart Head;

    public IronMageHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(1, 113).addBox(-6.0F, -7.3F, -6.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(12, 103).addBox(-6.0F, -7.3F, 7.425F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 119)
                        .addBox(-8.0F, -7.325F, -0.6F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 100).mirror().addBox(6.0F, -7.325F, -0.6F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(63, 118).mirror()
                        .addBox(6.0F, -7.3F, -5.4F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(63, 118).addBox(-8.0F, -7.3F, -5.4F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-4.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, -22.675F, 5.0F, -1.0755F, -0.0633F, 0.0093F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-4.0F, -2.0F, 2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.4F, -18.775F, 1.3F, -0.567F, 0.0921F, 0.0694F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 59).mirror().addBox(-5.0F, -2.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.0F, -16.675F, 0.4F, -0.6524F, -0.0189F, 0.0008F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 25).mirror().addBox(-5.0F, -2.0F, -1.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.0F, -12.675F, 0.0F, -0.1725F, -0.0189F, 0.0008F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 121).addBox(-5.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -7.625F, 13.3F, -1.3526F, -1.4835F, 1.3526F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 44).addBox(-5.0F, 0.0F, -2.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.5F, -7.875F, 10.075F, -0.1361F, -0.8928F, 0.1071F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(3.0F, 0.0F, -2.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.575F, -7.875F, 10.075F, -0.1361F, 0.8928F, -0.1071F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(94, 110).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, -8.15F, 1.35F, 0.0021F, 0.0189F, -0.0008F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(3.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.3F, -7.625F, 13.3F, -1.3526F, 1.4835F, -1.3526F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 76).mirror().addBox(3.0F, 0.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.2F, -8.15F, 1.35F, 0.0021F, -0.0189F, 0.0008F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(3.0F, 0.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.2F, -8.15F, 0.65F, -0.0021F, 0.0189F, 0.0008F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(114, 52).mirror().addBox(3.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.3F, -7.625F, -11.3F, 1.3526F, -1.4835F, -1.3526F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 80).addBox(-5.0F, 0.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, -8.15F, 0.65F, -0.0021F, -0.0189F, -0.0008F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(112, 17).mirror().addBox(3.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-9.575F, -7.875F, -8.075F, 0.1361F, -0.8928F, -0.1071F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 28).addBox(-5.0F, 0.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.5F, -7.875F, -8.075F, 0.1361F, 0.8928F, 0.1071F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(114, 91).addBox(-5.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -7.625F, -11.3F, 1.3526F, 1.4835F, 1.3526F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.0F, 0.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.1F, -9.575F, 1.1F, -0.0852F, -0.0189F, 0.0008F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-5.0F, -2.0F, -4.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.4F, -8.875F, 0.6F, -0.0852F, -0.0189F, 0.0008F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
