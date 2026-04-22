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


public class DragonsteelTankLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_tank_leggings"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public DragonsteelTankLeggings(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 23).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.5F, 5.6F, 0.7F, 0.1946F, -0.3931F, -0.4752F));
        PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.5F, 5.6F, -0.7F, -0.1946F, 0.3931F, -0.4752F));
        PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(98, 23).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.8F, 3.6F, 0.7F, 0.1946F, -0.3931F, -0.4752F));
        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 23).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.1F, 1.6F, 0.7F, 0.1946F, -0.3931F, -0.4752F));
        PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.8F, 3.6F, -0.7F, -0.1946F, 0.3931F, -0.4752F));
        PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.1F, 1.6F, -0.7F, -0.1946F, 0.3931F, -0.4752F));
        PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 0).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.55F, 0.9F, -2.4F, 0.0F, 0.0F, -0.3927F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
        PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.5F, 5.6F, 0.7F, 0.1946F, 0.3931F, 0.4752F));
        PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.5F, 5.6F, -0.7F, -0.1946F, -0.3931F, 0.4752F));
        PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.8F, 3.6F, 0.7F, 0.1946F, 0.3931F, 0.4752F));
        PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.1F, 1.6F, 0.7F, 0.1946F, 0.3931F, 0.4752F));
        PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.8F, 3.6F, -0.7F, -0.1946F, -0.3931F, 0.4752F));
        PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.1F, 1.6F, -0.7F, -0.1946F, -0.3931F, 0.4752F));
        PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(0.0F, -2.0F, 0.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.55F, 0.9F, -2.4F, 0.0F, 0.0F, 0.3927F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
