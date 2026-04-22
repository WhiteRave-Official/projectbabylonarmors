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


public class DragonsteelMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_mage_helmet"), "main");
    public final ModelPart Head;

    public DragonsteelMageHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head
                .addOrReplaceChild(
                        "cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-4.4191F, -3.1632F, -4.8596F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(3, 80)
                                .addBox(-5.836F, 0.1691F, -6.464F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0261F, -0.9393F, -5.4812F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                        PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.0524F, 0.0188F, 0.001F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 25).addBox(-3.0352F, -4.7185F, -4.9095F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.3403F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 57).addBox(-2.5018F, -5.8323F, -6.1821F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.7978F, 0.0238F, -0.0223F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 59).addBox(-1.9703F, -6.513F, -7.8898F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -1.2341F, 0.0238F, -0.0223F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 59).addBox(-1.5801F, -5.4672F, -9.8741F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -1.7443F, 0.0687F, -0.0275F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 67).addBox(-1.2017F, -4.0307F, -10.2716F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -2.0934F, 0.0687F, -0.0275F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 66).addBox(-2.7259F, -10.8316F, 1.7954F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.6689F, 0.1875F, -0.0251F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 109).addBox(-8.2995F, 2.5652F, -9.6358F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.1243F, 0.7923F, 0.0753F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9",
                CubeListBuilder.create().texOffs(80, 0).addBox(-10.8F, 2.0893F, -4.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(108, 8).mirror().addBox(8.8F, 2.0893F, -4.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(116, 74).mirror().addBox(8.8F, 2.0893F, -1.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 66).addBox(-10.8F, 2.0893F, -1.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(108, 31)
                        .mirror().addBox(-4.0F, 2.0893F, -12.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 64).addBox(-4.0F, 2.0893F, 8.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
                        .addBox(-1.7F, 3.0893F, 11.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.0524F, 0.0F, 0.0F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 40).mirror().addBox(-3.8714F, 2.0893F, -11.0554F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(99, 0).addBox(-4.654F,
                2.0893F, 7.7043F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.0774F, 0.8275F, 0.0571F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 50).addBox(-6.1286F, 2.0893F, -11.0554F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 45).mirror()
                .addBox(-5.346F, 2.0893F, 7.7043F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.0774F, -0.8275F, -0.0571F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 2).mirror().addBox(9.0182F, 3.3893F, 4.4098F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.02F, 0.5061F, 0.0097F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13",
                CubeListBuilder.create().texOffs(118, 85).addBox(-3.027F, -0.0373F, -11.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 85).addBox(-2.8831F, 0.1017F, 7.8F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.0377F, 0.0364F, -0.7673F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(118, 93).addBox(8.7F, 0.7963F, -0.8362F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 93).mirror()
                .addBox(-10.7F, 0.7963F, -0.8362F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.7156F, 0.0F, 0.0F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(104, 89).addBox(5.5671F, 2.782F, -3.4625F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.1353F, 0.2437F, -0.4295F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(116, 100).addBox(5.3033F, 2.5677F, -2.6884F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.2324F, -0.1991F, -0.4509F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(116, 100).mirror().addBox(-6.3033F, 2.5677F, -2.6884F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.2324F, 0.1991F, 0.4509F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 89).mirror().addBox(-6.5671F, 2.782F, -3.4625F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.1353F, -0.2437F, 0.4295F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 112).addBox(-2.2606F, 3.3903F, -6.9878F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.3881F, -0.2118F, -0.1954F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(104, 85).addBox(-2.7394F, 3.3903F, -6.9878F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, -0.3881F, 0.2118F, 0.1954F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1, 2).addBox(-12.0182F, 3.3893F, 4.4098F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0893F, 1.0F, 0.02F, -0.5061F, -0.0097F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
