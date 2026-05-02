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


public class IceRogueChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_rogue_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public IceRogueChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, 0.0F, -1.9F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(124, 0).addBox(-4.2F, 0.0F, 1.1F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(124, 0).mirror().addBox(3.2F, 0.0F, 1.1F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 22).addBox(-4.0F, 0.0F, -2.2F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(7, 22).addBox(3.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(7, 22).mirror().addBox(-4.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(7, 22).mirror().addBox(-4.2F, 0.0F, -2.2F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(3, 108).addBox(-4.4F, 1.6F, -3.0F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(3, 108).addBox(-3.5F, 3.4F, -2.5F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(3, 108).mirror().addBox(-4.5F, 3.4F, -2.5F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(3, 108).mirror().addBox(-3.6F, 1.6F, -2.8F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(70, 102).addBox(-4.0F, 6.0F, -2.4F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(15, 108).mirror().addBox(-6.6F, 1.4F, -3.2F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(15, 108).addBox(-1.4F, 1.4F, -3.1F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(51, 36).addBox(-3.7F, -1.0F, 1.225F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(111, 63).mirror().addBox(-3.0F, -2.0F, -3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.7F, -0.2F, 0.4537F, -0.4366F, -0.5852F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(111, 63).addBox(2.0F, -2.0F, -3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.7F, -0.2F, 0.4537F, 0.4366F, 0.5852F));

        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 67).addBox(1.0F, -2.0F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.2F, 0.2F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(-3.0F, -2.0F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.2F, 0.2F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -4.0F, 4.0F, 5.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 4.9F, -0.6F, 0.2611F, -0.0151F, 0.0859F));

        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(58, 0).addBox(-4.0F, -4.0F, 4.0F, 5.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 4.9F, -0.8F, 0.2611F, 0.0151F, -0.0859F));

        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 19).addBox(-3.0F, -4.0F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(74, 25).addBox(-3.0F, -4.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 14.6F, -2.6F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 13).addBox(-2.0F, -4.0F, -5.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(72, 46).addBox(-2.0F, -4.0F, -2.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 14.6F, 1.9F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 24).addBox(-1.0F, 0.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 10.9F, -2.5F, 0.0F, 0.0F, -0.2182F));

        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 16).addBox(-4.0F, 0.0F, -1.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 10.9F, -2.5F, 0.0F, 0.0F, 0.2182F));

        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(42, 16).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 14.3F, -2.9F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 13.6F, -3.3F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -4.0F, 4.0F, 5.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.9F, -2.1F, 0.1666F, 0.0522F, -0.3011F));

        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -4.0F, 4.0F, 5.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 4.9F, -2.3F, 0.1666F, -0.0522F, 0.3011F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 91).addBox(-1.6F, 5.5F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(38, 101).addBox(-1.5F, -3.1F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(14, 45).addBox(-1.0F, -2.5F, -2.3F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 44).addBox(-1.0F, -2.5F, -0.7F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.2F, 2.0F, 0.0F));

        PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(43, 92).addBox(-2.0F, -1.0F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(43, 92).addBox(-2.0F, -1.0F, -1.85F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, 1.4F, -0.575F, 0.0F, 0.0F, -0.2094F));

        PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 32).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.9F, 2.1F, 0.0F, 0.0F, -1.0472F));

        PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(91, 19).addBox(1.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, -1.65F, 2.1F, 0.0F, 0.0F, -1.6581F));

        PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 93).addBox(0.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.925F, 0.6F, 1.9F, 0.0F, 0.0F, -1.1781F));

        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 40).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.175F, 1.775F, 1.9F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 71).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.0F, 1.9F, 0.0F, 0.0F, -0.5672F));

        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 71).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.975F, 2.1F, 0.0F, 0.0F, -0.829F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(42, 91).mirror().addBox(-3.4F, 5.5F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 101).mirror().addBox(-3.5F, -3.1F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(14, 45).mirror().addBox(-3.0F, -2.5F, -2.3F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(13, 44).mirror().addBox(-3.0F, -2.5F, -0.7F, 4.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.2F, 2.0F, 0.0F));

        PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-3.0F, -1.0F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(43, 92).mirror().addBox(-3.0F, -1.0F, -1.85F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 1.4F, -0.575F, 0.0F, 0.0F, 0.2094F));

        PartDefinition cube_r23 = RightArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9F, 2.1F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-5.0F, -1.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, -1.65F, 2.1F, 0.0F, 0.0F, 1.6581F));

        PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.925F, 0.6F, 1.9F, 0.0F, 0.0F, 1.1781F));

        PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.175F, 1.775F, 1.9F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 0.0F, 1.9F, 0.0F, 0.0F, 0.5672F));

        PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.975F, 2.1F, 0.0F, 0.0F, 0.829F));

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