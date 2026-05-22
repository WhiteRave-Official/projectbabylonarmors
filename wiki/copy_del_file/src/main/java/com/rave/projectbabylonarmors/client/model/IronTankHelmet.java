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


public class IronTankHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_tank_helmet"), "main");
    public final ModelPart Head;

    public IronTankHelmet(ModelPart root) {
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
                        .addBox(-0.7F, -10.0F, -1.825F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(107, 98).mirror().addBox(-5.3F, -10.0F, -1.825F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(117, 108).mirror()
                        .addBox(-5.3F, -10.0F, -1.825F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(117, 108).addBox(4.3F, -10.0F, -1.825F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 9)
                        .addBox(-1.0F, -11.2F, 4.95F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(85, 12).addBox(-0.8F, -8.025F, -6.6F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(85, 12).mirror()
                        .addBox(-0.2F, -8.025F, -6.6F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 72).addBox(-1.0028F, -5.3427F, -6.2538F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 0)
                        .addBox(2.5972F, -7.3927F, -5.1038F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 0).mirror().addBox(-5.5972F, -7.3927F, -5.1038F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
                CubeListBuilder.create().texOffs(0, 120).mirror().addBox(-1.0F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 120).addBox(8.9944F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9972F, -3.3927F, -1.1038F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(53, 76).addBox(-5.0F, -9.0F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, -3.4F, 2.125F, 0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 77).mirror().addBox(0.0F, -11.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.0F, 3.0F, -3.9F, 0.0F, 0.4363F, 0.0F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 78).addBox(-4.0F, -11.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 3.0F, -3.9F, 0.0F, -0.4363F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
