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


public class NetheriteMageLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_mage_leggings"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public NetheriteMageLeggings(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
                CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(54, 0)
                        .addBox(-1.95F, 2.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 34).addBox(-2.0F, 2.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
                        .addBox(1.4F, 2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 58).addBox(-2.4F, 2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
                        .addBox(-1.95F, 9.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 58).addBox(2.4F, 9.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 34)
                        .addBox(-2.0F, 9.5F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 58).addBox(-2.4F, 9.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
                        .addBox(1.4F, 10.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 0).addBox(-1.95F, 10.9F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
                        .addBox(-2.4F, 10.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 34).addBox(-2.0F, 10.9F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
                        .addBox(1.4F, 3.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 0).addBox(-1.95F, 3.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 58)
                        .addBox(-2.4F, 3.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 34).addBox(-2.0F, 3.5F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
                CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                        .mirror(false).texOffs(54, 0).mirror().addBox(-2.05F, 2.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 34).mirror().addBox(-2.0F, 2.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(0, 58).mirror().addBox(-2.4F, 2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 58).mirror().addBox(1.4F, 2.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(54, 0).mirror().addBox(-2.05F, 9.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 58).mirror().addBox(-2.4F, 9.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(54, 34).mirror().addBox(-2.0F, 9.5F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 58).mirror().addBox(1.4F, 9.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(0, 58).mirror().addBox(-2.4F, 10.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 0).mirror().addBox(-2.05F, 10.9F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(52, 58).mirror().addBox(1.4F, 10.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 34).mirror().addBox(-2.0F, 10.9F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(0, 58).mirror().addBox(-2.4F, 3.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 0).mirror().addBox(-2.05F, 3.5F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(52, 58).mirror().addBox(1.4F, 3.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 34).mirror().addBox(-2.0F, 3.5F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offset(-1.9F, 12.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
