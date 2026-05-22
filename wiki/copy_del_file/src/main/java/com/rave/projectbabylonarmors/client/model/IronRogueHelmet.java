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


public class IronRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_rogue_helmet"), "main");
    public final ModelPart Head;

    public IronRogueHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 9).addBox(-4.0F, -2.8F, -4.075F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 2).addBox(-3.0F, -0.8F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(23, 14).addBox(-4.0F, -2.8F, 2.05F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 10).addBox(2.05F, -2.8F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(1, 22).addBox(-4.05F, -2.8F, -4.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(23, 44).addBox(-5.6F, -9.8F, 4.675F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 40).addBox(-6.35F, -6.8F, 4.65F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 40).mirror().addBox(1.85F, -6.8F, 4.65F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(26, 0).mirror().addBox(-0.325F, 0.2F, 0.725F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(26, 0).addBox(-4.875F, 0.2F, 0.725F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(2.7F, -1.3F, 3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(35, 29).addBox(-3.3F, -10.4F, 3.6F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).mirror().addBox(-4.8F, -1.3F, 3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 28).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9F, 0.75F, -3.3F, 0.0F, 0.0F, 0.48F));

        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 46).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.275F, -2.025F, -3.3F, 0.0F, 0.0F, -0.1745F));

        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.625F, -8.925F, -3.3F, 0.0F, 0.0F, -1.3526F));

        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 28).mirror().addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 0.75F, -3.3F, 0.0F, 0.0F, -0.48F));

        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 42).addBox(-9.0F, -7.0F, -4.0F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.35F, 0.2F, 5.675F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 46).mirror().addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.275F, -2.025F, -3.3F, 0.0F, 0.0F, 0.1745F));

        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.0F, -7.0F, -1.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.625F, -8.925F, -3.3F, 0.0F, 0.0F, 1.3526F));

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