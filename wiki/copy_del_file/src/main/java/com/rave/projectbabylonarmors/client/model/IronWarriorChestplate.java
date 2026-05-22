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


public class IronWarriorChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "iron_warrior_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public IronWarriorChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -2.2F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.0F, 0.0F, -1.5F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 106)
                        .addBox(-4.4F, 0.0F, 1.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 106).addBox(-4.4F, 0.0F, -2.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 20)
                        .addBox(3.4F, 0.0F, -1.8F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3).mirror().addBox(-4.4F, 0.0F, -1.8F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 23)
                        .addBox(3.4F, 0.0F, 1.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 23).addBox(3.4F, 0.0F, -2.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77)
                        .addBox(3.1F, 1.1F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77).mirror().addBox(-4.1F, 1.1F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 108)
                        .addBox(-0.725F, 8.9F, 2.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 108).mirror().addBox(-1.275F, 8.9F, 2.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 111)
                        .addBox(-3.5F, 0.5F, 2.725F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 124).addBox(-3.5F, 5.5F, 2.725F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 110)
                        .addBox(-3.5F, 3.25F, -2.425F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 106).addBox(-0.5F, 0.25F, -2.425F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 102).mirror()
                        .addBox(-3.5F, 0.25F, -2.425F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 113).addBox(-3.5F, 5.25F, -2.425F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 121)
                        .addBox(-3.5F, 7.225F, -2.425F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(68, 77).addBox(-3.8F, 0.5F, -2.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 85).mirror()
                        .addBox(-0.9F, 0.4F, 2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 85).addBox(-4.1F, 0.4F, 2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 77)
                        .addBox(-3.6F, 0.275F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 77).mirror().addBox(-0.4F, 0.275F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 77).mirror()
                        .addBox(2.8F, 0.5F, -2.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 88).addBox(-0.025F, 9.3F, -2.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 88).mirror()
                        .addBox(-0.975F, 9.3F, -2.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 77).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 90)
                        .addBox(-3.0F, 13.0F, 2.5F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.0F, -3.65F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 3).addBox(-3.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 0.4F, -6.0F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.6F, 0.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(87, 8).addBox(-2.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, 1.825F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 0).addBox(-4.0F, -2.0F, 4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4F, 6.9F, 0.0F, 3.1416F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.9F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
                CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).addBox(-5.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.7F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 68).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -3.1F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
                CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 124).mirror().addBox(0.0F, 0.0F, 5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.75F, 12.0F, -3.7F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 32).addBox(0.0F, -2.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3F, 0.4F, -6.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.25F, 9.6F, -1.725F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 98).addBox(0.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.25F, 9.6F, -1.725F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 9.2F, 2.025F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 101).addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 9.2F, 2.025F, 0.0F, 0.0F, -0.7854F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
                CubeListBuilder.create().texOffs(41, 38).mirror().addBox(-3.2F, -2.0F, -2.3F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 107).mirror()
                        .addBox(-3.2F, -2.0F, 0.3F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 102).mirror().addBox(-5.2F, -2.675F, -3.475F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 39)
                        .mirror().addBox(-3.6F, 1.8F, -0.4F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 39).mirror().addBox(-3.6F, 1.8F, -2.6F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r14 = RightArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-2.0F, 1.0F, -3.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 69).mirror()
                .addBox(-2.0F, 1.0F, -5.8F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.025F, -1.025F, 2.5F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r15 = RightArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.125F, -1.225F, -2.85F, 0.0F, 0.0F, -0.4363F));
        PartDefinition cube_r16 = RightArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 69).mirror()
                .addBox(-1.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.2F, 2.6F, 0.0F, 0.0F, -0.7854F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
                CubeListBuilder.create().texOffs(41, 38).addBox(-0.8F, -2.0F, -2.3F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 107).addBox(-0.8F, -2.0F, 0.3F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 102)
                        .addBox(-0.8F, -2.675F, -3.475F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(110, 39).addBox(-1.4F, 1.8F, -0.4F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 39)
                        .addBox(-1.4F, 1.8F, -2.6F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17",
                CubeListBuilder.create().texOffs(95, 69).addBox(-5.0F, 1.0F, -3.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 69).addBox(-5.0F, 1.0F, -5.8F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.025F, -1.025F, 2.5F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 28).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.125F, -1.225F, -2.85F, 0.0F, 0.0F, 0.4363F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19",
                CubeListBuilder.create().texOffs(50, 69).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 69).addBox(-2.0F, -3.0F, -6.2F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 0.2F, 2.6F, 0.0F, 0.0F, 0.7854F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
