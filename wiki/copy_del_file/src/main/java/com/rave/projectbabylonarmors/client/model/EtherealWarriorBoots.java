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


public class EtherealWarriorBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ethereal_warrior_boots"), "main");
    public final ModelPart RightBoot;
    public final ModelPart LeftBoot;

    public EtherealWarriorBoots(ModelPart root) {
        this.RightBoot = root.getChild("RightBoot");
        this.LeftBoot = root.getChild("LeftBoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
                CubeListBuilder.create().texOffs(0, 9).mirror().addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 9).mirror().addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 5).mirror().addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 11).mirror().addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(50, 17).mirror().addBox(-3.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 25).mirror()
                        .addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 26).mirror().addBox(-2.575F, 10.8F, -3.7534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
                        .mirror().addBox(-3.45F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 27).mirror().addBox(-3.7F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(54, 27).addBox(-0.3F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 17).mirror().addBox(-3.7F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19)
                        .addBox(2.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 17).addBox(-0.3F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r1 = RightBoot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 8).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.1F, 10.0F, -3.9534F, -0.4524F, 0.7043F, -0.3086F));
        PartDefinition cube_r2 = RightBoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.0F, 10.4F, -2.9533F, -0.3927F, 0.0F, -0.6981F));
        PartDefinition cube_r3 = RightBoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 10.4F, -2.9533F, -0.3927F, 0.0F, 0.6981F));
        PartDefinition cube_r4 = RightBoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, 9.8F, 3.0467F, 0.2443F, 0.0F, 0.0F));
        PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
                CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 9).addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
                        .addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11).addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 17)
                        .addBox(2.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 25).addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
                        .addBox(-2.425F, 10.8F, -3.7534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.55F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
                        .addBox(-0.3F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 27).mirror().addBox(-3.7F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 17)
                        .addBox(-0.3F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).mirror().addBox(-3.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 17).mirror()
                        .addBox(-3.7F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r5 = LeftBoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1F, 10.0F, -3.9534F, -0.4524F, -0.7043F, 0.3086F));
        PartDefinition cube_r6 = LeftBoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 10.4F, -2.9533F, -0.3927F, 0.0F, 0.6981F));
        PartDefinition cube_r7 = LeftBoot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.0F, 10.4F, -2.9533F, -0.3927F, 0.0F, -0.6981F));
        PartDefinition cube_r8 = LeftBoot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 15).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 9.8F, 3.0467F, 0.2443F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
