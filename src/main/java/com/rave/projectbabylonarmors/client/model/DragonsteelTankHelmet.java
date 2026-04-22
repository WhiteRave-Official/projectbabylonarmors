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


public class DragonsteelTankHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_tank_helmet"), "main");
    public final ModelPart Head;

    public DragonsteelTankHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 29).addBox(3.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
                        .addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 47)
                        .addBox(-5.0F, -8.0F, 3.925F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 0).addBox(0.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 0)
                        .addBox(2.7F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 0).mirror().addBox(-3.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(97, 0).mirror()
                        .addBox(-3.8F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 6).addBox(-0.15F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 37)
                        .addBox(-2.85F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 21)
                        .addBox(-1.0F, -10.1F, -6.8F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-1.0F, -6.0F, 2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(89, 112).addBox(-1.0F, -6.0F, -1.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.475F, -1.9F, -3.2F, 0.3788F, 0.7616F, 0.264F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-1, 114).addBox(-1.0F, -6.0F, -1.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.425F, -2.3F, -8.1F, -0.7571F, 0.6152F, -0.5253F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 20).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, 2.3F, -3.7F, 0.8777F, -1.1353F, -0.7511F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.2F, 2.3F, -3.7F, 0.8777F, 1.1353F, 0.7511F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-2, 71).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.4F, -8.8F, 3.3F, 2.1214F, -0.4148F, -0.3085F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(105, 70).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.1F, -9.4F, 5.9F, 2.6101F, -0.4148F, -0.3085F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(114, 84).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.7F, -2.8F, 5.6F, 1.2487F, -0.4148F, -0.3085F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8",
                CubeListBuilder.create().texOffs(32, 22).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 22).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9F, 0.4F, 1.3F, 0.2054F, -1.0836F, 0.1659F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 22).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.9F, 3.2F, -3.7F, 0.2054F, -1.0836F, 0.1659F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 84).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.7F, 0.0F, 0.6F, 1.2487F, -0.4148F, -0.3085F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 70).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.1F, -6.6F, 0.9F, 2.6101F, -0.4148F, -0.3085F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.1F, -6.6F, 0.9F, 2.6101F, 0.4148F, 0.3085F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.7F, 0.0F, 0.6F, 1.2487F, 0.4148F, 0.3085F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.9F, 3.2F, -3.7F, 0.2054F, 1.0836F, -0.1659F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-2, 71).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(9.4F, -8.8F, 3.3F, 2.1214F, 0.4148F, 0.3085F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(10.1F, -9.4F, 5.9F, 2.6101F, 0.4148F, 0.3085F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.7F, -2.8F, 5.6F, 1.2487F, 0.4148F, 0.3085F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.9F, 0.4F, 1.3F, 0.2054F, 1.0836F, -0.1659F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19",
                CubeListBuilder.create().texOffs(64, 47).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 57).addBox(-1.0F, -8.0F, -9.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.375F, 3.975F, 4.025F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20",
                CubeListBuilder.create().texOffs(1, 65).addBox(0.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 42).addBox(-1.0F, -8.0F, -9.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.375F, 3.975F, 4.025F, 0.0F, 0.0F, 0.7854F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
