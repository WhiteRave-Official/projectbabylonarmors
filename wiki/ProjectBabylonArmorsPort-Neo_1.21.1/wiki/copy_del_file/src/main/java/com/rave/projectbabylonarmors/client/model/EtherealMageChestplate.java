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


public class EtherealMageChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ethereal_mage_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;

    public EtherealMageChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body",
                CubeListBuilder.create().texOffs(0, 20).addBox(-4.4F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-4.4F, 0.0F, -2.1F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
                        .addBox(-3.6F, 0.0F, -1.7F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-3.6F, 0.0F, -2.1F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 52)
                        .addBox(-1.5F, -1.0F, -3.45F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 90).addBox(-3.0F, 13.3F, -3.3F, 6.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 9)
                        .addBox(-1.5F, 14.2F, -3.5F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(112, 0).addBox(-4.0F, 1.0F, -2.375F, 8.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(105, 11)
                        .addBox(-1.5F, 3.4F, -2.7F, 3.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(98, 11).addBox(-1.5F, 0.9F, -2.675F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(99, 85)
                        .addBox(-4.075F, -0.1F, -2.7F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(86, 38).addBox(1.1F, 8.4F, -2.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(86, 38).mirror()
                        .addBox(-4.1F, 8.4F, -2.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 35).addBox(-6.0F, -5.3F, 7.0F, 12.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, 4.1F, -2.3F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 51).addBox(-8.0F, -4.0F, 0.0F, 9.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.55F, 14.2F, 3.225F, 0.4102F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 0).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, 15.0F, -2.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 9).addBox(-3.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.2F, 3.8F, 0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 111).addBox(-8.0F, -6.0F, 1.0F, 9.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.475F, 7.0F, 2.8F, 0.2182F, 0.0F, 0.0F));
        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(101, 40).mirror().addBox(-4.0F, -2.0F, -1.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.8F, 12.6F, -1.2F, -0.4847F, 1.067F, -0.0307F));
        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 40).mirror().addBox(-4.0F, -2.0F, 0.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.8F, 12.6F, 1.8F, 0.4847F, -1.067F, -0.0307F));
        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(101, 40).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.8F, 12.6F, 1.8F, 0.4847F, 1.067F, 0.0307F));
        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(101, 40).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.8F, 12.6F, -1.2F, -0.4847F, -1.067F, 0.0307F));
        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.75F, 12.0F, -3.4F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 43).addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.75F, 12.0F, -3.4F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 36).mirror().addBox(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.25F, 11.0F, -3.3F, 0.0F, 0.0F, 0.1309F));
        PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 36).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.25F, 11.0F, -3.3F, 0.0F, 0.0F, -0.1309F));
        PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 41).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.6F, 1.0F, 0.8F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 119).addBox(1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, 1.0F, 4.3F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 44).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 1.0F, 0.8F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 3).addBox(-3.3562F, -1.0F, -1.725F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -2.5037F, 0.0F, 0.7854F, 0.0F));
        PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 32).addBox(0.3562F, -1.0F, -1.725F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -2.5037F, 0.0F, -0.7854F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(1, 9).addBox(-2.3F, 0.0F, -2.6F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 39)
                .addBox(-0.8F, -2.2F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 113).addBox(-0.8F, -2.2F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(62, 119).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.95F, 0.75F, -2.55F, 0.0066F, 0.0198F, 0.324F));
        PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 119).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.65F, -1.05F, -2.55F, -0.0093F, 0.0187F, -0.4616F));
        PartDefinition cube_r21 = LeftArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 110).addBox(-2.0F, -2.0F, 0.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.55F, 6.75F, -2.55F, -0.0002F, 0.0209F, -0.0077F));
        PartDefinition cube_r22 = LeftArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 0.7F, 1.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r23 = LeftArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5F, 0.5F, -1.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild(
                "RightArm", CubeListBuilder.create().texOffs(1, 9).mirror().addBox(-0.7F, 0.0F, -2.6F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 39).mirror()
                        .addBox(-3.2F, -2.2F, -2.2F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 113).mirror().addBox(-3.2F, -2.2F, -0.8F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-5.0F, 2.0F, 0.0F));
        PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-3.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.95F, 0.75F, -2.55F, 0.0066F, -0.0198F, -0.324F));
        PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(-3.0F, -1.0F, 0.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.65F, -1.05F, -2.55F, -0.0093F, -0.0187F, 0.4616F));
        PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 110).mirror().addBox(-3.0F, -2.0F, 0.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.55F, 6.75F, -2.55F, -0.0002F, -0.0209F, 0.0077F));
        PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.0F, 0.7F, 1.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5F, 0.5F, -1.9F, 0.0F, 0.0F, -0.7854F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
