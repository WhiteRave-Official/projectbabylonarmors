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


public class NetheriteRogueBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_rogue_boots"), "main");
    public final ModelPart Left_boot;
    public final ModelPart Right_boot;

    public NetheriteRogueBoots(ModelPart root) {
        this.Left_boot = root.getChild("Left_boot");
        this.Right_boot = root.getChild("Right_boot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Left_boot = partdefinition.addOrReplaceChild("Left_boot", CubeListBuilder.create(), PartPose.offset(1.9906F, 14.0F, -0.2172F));
        PartDefinition cube_r1 = Left_boot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5094F, 9.975F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Left_boot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 109).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5094F, 9.25F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Left_boot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 103).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5094F, 10.05F, -1.5828F, 0.733F, 0.0F, 0.0F));
        PartDefinition cube_r4 = Left_boot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.1156F, 11.3F, -0.1078F, -1.5708F, 0.0F, -0.7418F));
        PartDefinition cube_r5 = Left_boot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.1344F, 11.3F, -0.1078F, -1.5708F, 0.0F, 0.7418F));
        PartDefinition cube_r6 = Left_boot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 107).mirror().addBox(-4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.1344F, 9.3F, -0.2078F, -1.5708F, 0.0F, 0.7418F));
        PartDefinition cube_r7 = Left_boot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 107).mirror().addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.1156F, 9.3F, -0.2078F, -1.5708F, 0.0F, -0.7418F));
        PartDefinition cube_r8 = Left_boot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(3.0F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 87).mirror()
                .addBox(6.4F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2156F, 9.6F, -0.3078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r9 = Left_boot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 97).mirror().addBox(-4.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 4.6F, -4.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r10 = Left_boot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 122).mirror().addBox(-4.0F, -3.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 5.6F, -0.3328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r11 = Left_boot.addOrReplaceChild(
                "cube_r11", CubeListBuilder.create().texOffs(65, 126).mirror().addBox(-4.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 97).mirror()
                        .addBox(-4.5F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 97).addBox(-0.45F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.9844F, 4.6F, -0.2078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r12 = Left_boot.addOrReplaceChild("cube_r12",
                CubeListBuilder.create().texOffs(14, 97).addBox(0.0F, -3.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 97).mirror().addBox(-4.05F, -3.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5344F, 4.6F, -0.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r13 = Left_boot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-1.0F, -3.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.5156F, 8.9F, -0.2828F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r14 = Left_boot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-1.0F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.5156F, 8.9F, -0.4328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Right_boot = partdefinition.addOrReplaceChild("Right_boot", CubeListBuilder.create(), PartPose.offset(-1.9906F, 14.0F, -0.2172F));
        PartDefinition cube_r15 = Right_boot.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(110, 36).addBox(0.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5094F, 9.975F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r16 = Right_boot.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 109).addBox(0.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5094F, 9.25F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r17 = Right_boot.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 103).addBox(0.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5094F, 10.05F, -1.5828F, 0.733F, 0.0F, 0.0F));
        PartDefinition cube_r18 = Right_boot.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(108, 10).addBox(-4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1156F, 11.3F, -0.1078F, -1.5708F, 0.0F, 0.7418F));
        PartDefinition cube_r19 = Right_boot.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 6).addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1344F, 11.3F, -0.1078F, -1.5708F, 0.0F, -0.7418F));
        PartDefinition cube_r20 = Right_boot.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 107).addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1344F, 9.3F, -0.2078F, -1.5708F, 0.0F, -0.7418F));
        PartDefinition cube_r21 = Right_boot.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(56, 107).addBox(-4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1156F, 9.3F, -0.2078F, -1.5708F, 0.0F, 0.7418F));
        PartDefinition cube_r22 = Right_boot.addOrReplaceChild("cube_r22",
                CubeListBuilder.create().texOffs(82, 87).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 87).addBox(-7.4F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.2156F, 9.6F, -0.3078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r23 = Right_boot.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(11, 97).addBox(0.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 4.6F, -4.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r24 = Right_boot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(77, 122).addBox(0.0F, -3.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 5.6F, -0.3328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r25 = Right_boot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(65, 126).addBox(0.0F, -3.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 97)
                        .addBox(3.5F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 97).mirror().addBox(-0.55F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.9844F, 4.6F, -0.2078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r26 = Right_boot.addOrReplaceChild("cube_r26",
                CubeListBuilder.create().texOffs(14, 97).mirror().addBox(-1.0F, -3.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 97).addBox(3.05F, -3.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5344F, 4.6F, -0.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r27 = Right_boot.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 80).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.5156F, 8.9F, -0.2828F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r28 = Right_boot.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(95, 80).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.5156F, 8.9F, -0.4328F, -1.5708F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
