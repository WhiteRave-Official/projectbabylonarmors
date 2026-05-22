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


public class IronRogueLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_rogue_leggings"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public IronRogueLeggings(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.5F, 12.0F, 0.0F));

        PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 106).addBox(-3.4628F, 0.5045F, -1.575F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(77, 106).addBox(-3.4628F, 0.5045F, -2.425F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6142F, 4.2588F, 0.0F, 0.0F, 0.0F, -0.9512F));

        PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 109).addBox(-2.4413F, -1.4913F, -0.475F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(48, 109).addBox(-2.4413F, -1.4913F, -2.525F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1142F, 4.0588F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 120).addBox(-2.4892F, -4.3588F, -1.475F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(29, 120).addBox(-2.4892F, -4.3588F, -2.525F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1142F, 4.0588F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 106).addBox(-3.4628F, 0.5045F, -2.425F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7142F, 0.7588F, 0.4F, 0.0F, 0.0F, -1.0908F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.5F, 12.0F, 0.0F));

        PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 106).mirror().addBox(-0.5372F, 0.5045F, -1.575F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(77, 106).mirror().addBox(-0.5372F, 0.5045F, -2.425F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6142F, 4.2588F, 0.0F, 0.0F, 0.0F, 0.9512F));

        PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 109).mirror().addBox(-1.5587F, -1.4913F, -0.475F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(48, 109).mirror().addBox(-1.5587F, -1.4913F, -2.525F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1142F, 4.0588F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 120).mirror().addBox(-1.5108F, -4.3588F, -1.475F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(29, 120).mirror().addBox(-1.5108F, -4.3588F, -2.525F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1142F, 4.0588F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 106).mirror().addBox(-0.5372F, 0.5045F, -2.425F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7142F, 0.7588F, 0.4F, 0.0F, 0.0F, 1.0908F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}