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


public class DiamondWarriorHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_warrior_helmet"), "main");
    public final ModelPart Head;

    public DiamondWarriorHelmet(ModelPart root) {
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
                        .addBox(-2.85F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 77)
                        .addBox(-3.0F, -7.0F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 19).addBox(-1.0F, -10.1F, -4.6F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
                        .addBox(-1.0028F, -5.3427F, -6.2538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-1.0F, -9.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.0028F, -3.7427F, -4.6538F, 0.0F, 0.0F, -1.0036F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 119).mirror().addBox(-1.0F, -7.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.0028F, -4.7427F, -4.3538F, 0.0F, 0.0F, -1.0036F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(112, 107).addBox(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.4F, -3.6F, 1.6F, 0.5672F, 0.2618F, 0.0F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(114, 122).addBox(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.4F, -1.95F, 2.05F, 1.2654F, 0.2618F, 0.0F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 122).addBox(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.65F, -3.2F, -1.5F, -0.6196F, 0.2618F, 0.0F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(112, 81).addBox(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.15F, -5.0F, 0.5F, -0.48F, 0.2618F, 0.0F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 89).addBox(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.15F, -6.2F, 4.425F, 0.0F, 0.2618F, 0.0F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 107).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.4F, -3.6F, 1.6F, 0.5672F, -0.2618F, 0.0F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(114, 122).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.4F, -1.95F, 2.05F, 1.2654F, -0.2618F, 0.0F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 122).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.65F, -3.2F, -1.5F, -0.6196F, -0.2618F, 0.0F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(112, 81).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.15F, -5.0F, 0.5F, -0.48F, -0.2618F, 0.0F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.15F, -6.2F, 4.425F, 0.0F, -0.2618F, 0.0F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0028F, -4.7427F, -4.3538F, 0.0F, 0.0F, 1.0036F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0028F, -3.7427F, -4.6538F, 0.0F, 0.0F, 1.0036F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0028F, -4.0927F, -5.6038F, -0.3142F, 0.0F, 0.0F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(118, 66).addBox(-6.0F, -2.0F, -6.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.4F, 3.85F, 9.9F, -2.0944F, 0.0F, 0.0F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(117, 65).addBox(-6.0F, -2.0F, -6.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.4F, 2.15F, 7.9F, -2.0944F, 0.0F, 0.0F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 62).addBox(-6.0F, -5.0F, -6.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.4F, -4.8F, 4.2F, -2.8362F, 0.0F, 0.0F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 37).addBox(-6.0F, -6.0F, -6.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -12.8F, 4.3F, 3.0543F, 0.0F, 0.0F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 9).addBox(-6.0F, -5.0F, -6.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, -8.8F, 2.7F, -2.0944F, 0.0F, 0.0F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(116, 11).addBox(-6.0F, -5.0F, -6.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, -5.8F, 7.9F, -0.6981F, 0.0F, 0.0F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(112, 0).addBox(-7.0F, -5.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -4.1F, 5.8F, -0.6981F, 0.0F, 0.0F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23",
                CubeListBuilder.create().texOffs(64, 47).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 57).addBox(-1.0F, -8.0F, -9.075F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.375F, 3.975F, 4.025F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24",
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
