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


public class EtherealMageBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ethereal_mage_boots"), "main");
    public final ModelPart LeftBoot;
    public final ModelPart RightBoot;

    public EtherealMageBoots(ModelPart root) {
        this.LeftBoot = root.getChild("LeftBoot");
        this.RightBoot = root.getChild("RightBoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
                CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 9).addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
                        .addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11).addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 17)
                        .addBox(2.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 25).addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
                        .addBox(-2.425F, 10.8F, -3.7534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.55F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
                        .addBox(-0.3F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 27).mirror().addBox(-3.7F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 17)
                        .addBox(-0.3F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).mirror().addBox(-3.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 17).mirror()
                        .addBox(-3.7F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r1 = LeftBoot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, 10.9F, -3.5534F, -0.9687F, 0.1591F, -0.1158F));
        PartDefinition cube_r2 = LeftBoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1F, 10.9F, -3.5534F, -0.9687F, -0.1591F, 0.1158F));
        PartDefinition cube_r3 = LeftBoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 39).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.0F, 7.9F, -2.0534F, 0.0F, -0.2618F, 1.5708F));
        PartDefinition cube_r4 = LeftBoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6F, 9.5F, -1.8533F, -0.2039F, -0.3148F, -0.2063F));
        PartDefinition cube_r5 = LeftBoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.6F, 9.5F, -1.8533F, -0.2039F, 0.3148F, 0.2063F));
        PartDefinition cube_r6 = LeftBoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 15).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 9.8F, 3.0467F, 0.2443F, 0.0F, 0.0F));
        PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
                CubeListBuilder.create().texOffs(0, 9).mirror().addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 9).mirror().addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 5).mirror().addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 11).mirror().addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(50, 17).mirror().addBox(-3.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 25).mirror()
                        .addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 26).mirror().addBox(-2.575F, 10.8F, -3.7534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
                        .mirror().addBox(-3.45F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 27).mirror().addBox(-3.7F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(54, 27).addBox(-0.3F, 4.0F, -2.0534F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 17).mirror().addBox(-3.7F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19)
                        .addBox(2.7F, 4.0F, -2.0534F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 17).addBox(-0.3F, 4.0F, 3.6467F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r7 = RightBoot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 10.9F, -3.5534F, -0.9687F, -0.1591F, 0.1158F));
        PartDefinition cube_r8 = RightBoot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.1F, 10.9F, -3.5534F, -0.9687F, 0.1591F, -0.1158F));
        PartDefinition cube_r9 = RightBoot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 39).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, 7.9F, -2.0534F, 0.0F, 0.2618F, -1.5708F));
        PartDefinition cube_r10 = RightBoot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.6F, 9.5F, -1.8533F, -0.2039F, 0.3148F, 0.2063F));
        PartDefinition cube_r11 = RightBoot.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6F, 9.5F, -1.8533F, -0.2039F, -0.3148F, -0.2063F));
        PartDefinition cube_r12 = RightBoot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 15).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, 9.8F, 3.0467F, 0.2443F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
