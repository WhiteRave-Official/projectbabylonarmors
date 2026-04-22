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


public class NetheriteTankLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_tank_leggings"), "main");
    public final ModelPart Rightleg;
    public final ModelPart Leftleg;
    public final ModelPart Torso;

    public NetheriteTankLeggings(ModelPart root) {
        this.Rightleg = root.getChild("Rightleg");
        this.Leftleg = root.getChild("Leftleg");
        this.Torso = root.getChild("Torso");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
        PartDefinition cube_r1 = Rightleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 16).addBox(0.0F, -4.0F, -2.0F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6F, 2.8F, 0.7F, 0.0F, 0.0F, 0.2182F));
        PartDefinition cube_r2 = Rightleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(57, 24).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 2.8F, -0.725F, 0.0F, 0.5672F, 0.2182F));
        PartDefinition cube_r3 = Rightleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9F, 7.6F, -0.725F, 0.0F, 0.5672F, 0.2182F));
        PartDefinition cube_r4 = Rightleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 9).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9F, 7.6F, 0.725F, 0.0F, -0.5672F, 0.2182F));
        PartDefinition cube_r5 = Rightleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 55).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.4F, 2.8F, 0.725F, 0.0F, -0.5672F, 0.2182F));
        PartDefinition cube_r6 = Rightleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 43).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.775F, 2.7F, -0.025F, 0.0F, -1.5664F, 0.2182F));
        PartDefinition cube_r7 = Rightleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 21).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.275F, 7.5F, -0.025F, 0.0F, -1.5664F, 0.2182F));
        PartDefinition cube_r8 = Rightleg.addOrReplaceChild("cube_r8",
                CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 45).addBox(-1.0F, -4.0F, 2.25F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1F, 3.025F, -1.125F, 0.0F, 0.0F, 0.1396F));
        PartDefinition cube_r9 = Rightleg.addOrReplaceChild("cube_r9",
                CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -4.0F, -3.35F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, 3.525F, 1.175F, 0.0F, 0.0F, 0.1396F));
        PartDefinition cube_r10 = Rightleg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -0.15F, -1.925F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r11 = Rightleg.addOrReplaceChild("cube_r11",
                CubeListBuilder.create().texOffs(44, 51).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 51).addBox(-1.0F, -4.0F, -3.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, -0.1F, 1.2F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r12 = Rightleg.addOrReplaceChild("cube_r12",
                CubeListBuilder.create().texOffs(18, 48).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 48).addBox(-1.0F, -4.0F, -3.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.1F, 3.0F, 1.2F, 0.0F, 0.0F, 0.2182F));
        PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition cube_r13 = Leftleg.addOrReplaceChild("cube_r13",
                CubeListBuilder.create().texOffs(40, 40).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 29).addBox(-1.0F, -4.0F, 2.25F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, 3.025F, -1.125F, 0.0F, 0.0F, -0.1396F));
        PartDefinition cube_r14 = Leftleg.addOrReplaceChild("cube_r14",
                CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 48).addBox(-1.0F, -4.0F, -3.4F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.1F, 3.0F, 1.2F, 0.0F, 0.0F, -0.2182F));
        PartDefinition cube_r15 = Leftleg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(44, 51).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 51).mirror()
                .addBox(-1.0F, -4.0F, -3.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.1F, 1.2F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r16 = Leftleg.addOrReplaceChild("cube_r16",
                CubeListBuilder.create().texOffs(6, 48).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 48).addBox(-1.0F, -4.0F, 2.35F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, 3.525F, -1.175F, 0.0F, 0.0F, -0.1396F));
        PartDefinition cube_r17 = Leftleg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.9F, 7.6F, -0.725F, 0.0F, -0.5672F, -0.2182F));
        PartDefinition cube_r18 = Leftleg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 21).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.275F, 7.5F, -0.025F, 0.0F, 1.5664F, -0.2182F));
        PartDefinition cube_r19 = Leftleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 9).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.9F, 7.6F, 0.725F, 0.0F, 0.5672F, -0.2182F));
        PartDefinition cube_r20 = Leftleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.4F, 2.8F, 0.725F, 0.0F, 0.5672F, -0.2182F));
        PartDefinition cube_r21 = Leftleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.775F, 2.7F, -0.025F, 0.0F, 1.5664F, -0.2182F));
        PartDefinition cube_r22 = Leftleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 24).mirror().addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.4F, 2.8F, -0.725F, 0.0F, -0.5672F, -0.2182F));
        PartDefinition cube_r23 = Leftleg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.6F, 2.8F, 0.7F, 0.0F, 0.0F, -0.2182F));
        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(5.5F, 14.8F, 0.7F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
