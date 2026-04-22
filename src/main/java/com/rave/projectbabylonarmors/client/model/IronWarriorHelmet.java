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


public class IronWarriorHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_warrior_helmet"), "main");
    public final ModelPart Head;

    public IronWarriorHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 29).addBox(3.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
                        .addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 47)
                        .addBox(-5.0F, -8.0F, 3.925F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(84, 54).mirror()
                        .addBox(-5.0F, -1.0F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 84).addBox(-1.0F, -11.2F, -2.825F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(107, 98)
                        .addBox(-0.7F, -10.4F, -1.825F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(107, 98).mirror().addBox(-5.3F, -10.4F, -1.825F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(117, 108).mirror()
                        .addBox(-5.3F, -10.4F, -1.825F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(117, 108).addBox(4.3F, -10.4F, -1.825F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
                CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-4.0F, -4.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(114, 0).addBox(4.1944F, -4.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5972F, -4.4927F, -3.8038F, -0.6981F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
                CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-1.0F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 120).addBox(8.9944F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9972F, -3.3927F, -1.1038F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 26).addBox(-6.0F, -2.0F, -2.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.7F, -4.8F, -0.7156F, 0.0F, 0.0F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 120).addBox(-6.0F, -5.0F, -5.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.4F, -4.8F, 4.2F, -2.8362F, 0.0F, 0.0F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(119, 56).addBox(-6.0F, -6.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -12.8F, 4.3F, 3.0543F, 0.0F, 0.0F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(116, 35).addBox(-6.0F, -5.0F, -6.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, -5.8F, 7.9F, -0.6981F, 0.0F, 0.0F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(116, 40).addBox(-6.0F, -5.0F, -6.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, -8.8F, 2.7F, -2.0944F, 0.0F, 0.0F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 120).addBox(-7.0F, -5.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -4.1F, 5.9F, -0.6981F, 0.0F, 0.0F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 76).addBox(-5.0F, -9.0F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, -3.4F, 2.125F, 0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.6F, -0.75F, -3.975F, 0.0F, 0.0F, 0.6109F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.6F, -0.75F, -3.975F, 0.0F, 0.0F, -0.6109F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
