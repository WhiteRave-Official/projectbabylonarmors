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


public class DragonsteelRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_rogue_helmet"), "main");
    public final ModelPart Head;

    public DragonsteelRogueHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 9).addBox(-4.0F, -2.8F, -4.075F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(37, 23).addBox(-4.5F, -3.1F, -4.175F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(37, 23).addBox(-4.5F, -3.1F, 4.175F, 9.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(37, 14).addBox(-4.175F, -3.1F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(37, 14).mirror().addBox(4.175F, -3.1F, -4.5F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(23, 14).addBox(-4.0F, -2.8F, 2.05F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 10).addBox(2.05F, -2.8F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(1, 22).addBox(-4.05F, -2.8F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}