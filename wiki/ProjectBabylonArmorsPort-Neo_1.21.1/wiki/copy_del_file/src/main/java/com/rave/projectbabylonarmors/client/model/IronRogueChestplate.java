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


public class IronRogueChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_rogue_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public IronRogueChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -2.8F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(-4.0F, 0.0F, -1.5F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(3.4F, 0.0F, -1.8F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 3).mirror().addBox(-4.4F, 0.0F, -1.8F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(10, 23).addBox(3.4F, 0.0F, 1.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-4.4F, 0.0F, -2.825F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-4.4F, 0.0F, 1.525F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(61, 95).addBox(1.6F, -0.7F, -0.4F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(10, 23).addBox(3.4F, 0.0F, -2.8F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(41, 118).mirror().addBox(-4.975F, -2.025F, -3.7F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(37, 120).mirror().addBox(-4.975F, -1.025F, -3.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(33, 117).mirror().addBox(-4.975F, -2.025F, -3.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(33, 117).addBox(1.975F, -2.025F, -3.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(41, 118).addBox(2.975F, -2.025F, -3.7F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(37, 120).addBox(1.975F, -1.025F, -3.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 37).addBox(0.975F, -2.025F, -3.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 37).mirror().addBox(-1.975F, -2.025F, -3.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(60, 110).addBox(-4.525F, -2.025F, 2.3F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(103, 27).addBox(0.0F, -0.9F, -3.4F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(103, 27).mirror().addBox(-4.0F, -0.9F, -3.4F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 42).addBox(-8.0F, -2.0F, 4.0F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 15.0F, -1.4F, 0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(77, 124).addBox(-5.0F, 0.0F, 4.3F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.75F, 12.0F, -3.7F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(77, 124).mirror().addBox(0.0F, 0.0F, 4.3F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.75F, 12.0F, -3.7F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 15.0F, -3.1F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(111, 106).addBox(-7.0F, -5.0F, -1.0F, 8.0F, 22.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.6F, 4.0F, 4.5F, 0.1745F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(40, 37).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(110, 39).addBox(-1.4F, 5.1F, -0.4F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(110, 39).addBox(-1.4F, 5.1F, -2.6F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(105, 0).addBox(2.1F, 0.4F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(108, 58).addBox(-1.4F, -2.7F, -2.6F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(101, 75).addBox(-1.4F, -2.7F, -0.4F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(116, 46).addBox(0.3F, -1.9F, -2.4F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(116, 18).addBox(0.3F, -1.9F, -0.6F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(116, 46).mirror().addBox(-1.2F, -1.9F, -2.4F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(116, 18).mirror().addBox(-1.2F, -1.9F, -0.6F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(105, 51).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(105, 51).addBox(-1.0F, -2.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.2F, 2.2F, 0.0F, 0.0F, 0.7854F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(110, 39).mirror().addBox(-3.6F, 5.1F, -0.4F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(110, 39).mirror().addBox(-3.6F, 5.1F, -2.6F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(105, 0).mirror().addBox(-4.1F, 0.4F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(108, 58).mirror().addBox(-3.6F, -2.7F, -2.6F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(101, 75).mirror().addBox(-3.6F, -2.7F, -0.4F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(116, 46).mirror().addBox(-3.3F, -1.9F, -2.4F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(116, 18).mirror().addBox(-3.3F, -1.9F, -0.6F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(116, 46).addBox(-1.8F, -1.9F, -2.4F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(116, 18).addBox(-1.8F, -1.9F, -0.6F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition cube_r7 = RightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(105, 51).mirror().addBox(-1.0F, -2.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.2F, 2.2F, 0.0F, 0.0F, -0.7854F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}