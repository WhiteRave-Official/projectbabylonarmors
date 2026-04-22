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


public class IceWarriorBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_warrior_boots"), "main");
    public final ModelPart Left_boot;
    public final ModelPart Right_boot;

    public IceWarriorBoots(ModelPart root) {
        this.Left_boot = root.getChild("Left_boot");
        this.Right_boot = root.getChild("Right_boot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Left_boot = partdefinition.addOrReplaceChild("Left_boot", CubeListBuilder.create(), PartPose.offset(1.9906F, 14.0F, -0.2172F));
        PartDefinition cube_r1 = Left_boot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 108).mirror().addBox(-3.0F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5094F, 9.55F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r2 = Left_boot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 103).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.5094F, 10.35F, -1.5828F, 0.733F, 0.0F, 0.0F));
        PartDefinition cube_r3 = Left_boot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(3.0F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 87).mirror()
                .addBox(6.4F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2156F, 9.9F, -0.3078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r4 = Left_boot.addOrReplaceChild("cube_r4",
                CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 54).addBox(4.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.3906F, 7.5F, -0.4828F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r5 = Left_boot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 1).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.9906F, 7.1F, -3.0828F, -0.1222F, 0.0F, 0.0F));
        PartDefinition cube_r6 = Left_boot.addOrReplaceChild("cube_r6",
                CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 21).addBox(3.2F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9906F, 8.2F, -0.4828F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r7 = Left_boot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0094F, 5.6F, 0.6172F, -0.1745F, -0.3491F, 0.0F));
        PartDefinition cube_r8 = Left_boot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0094F, 5.6F, 1.2172F, 0.5672F, -0.3491F, 0.0F));
        PartDefinition cube_r9 = Left_boot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 32).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0094F, 5.6F, 0.6172F, -0.1745F, 0.3491F, 0.0F));
        PartDefinition cube_r10 = Left_boot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 32).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0094F, 5.6F, 1.2172F, 0.5672F, 0.3491F, 0.0F));
        PartDefinition cube_r11 = Left_boot.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 67).mirror().addBox(-4.0F, -3.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 5.3F, -4.1078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r12 = Left_boot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 122).mirror().addBox(-4.0F, -3.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 5.6F, 0.7672F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r13 = Left_boot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(77, 122).mirror().addBox(-4.0F, -3.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 5.9F, -0.3328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r14 = Left_boot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 120).mirror().addBox(-4.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9844F, 5.3F, -0.6078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r15 = Left_boot.addOrReplaceChild("cube_r15",
                CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 50).mirror().addBox(-4.25F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.1344F, 5.3F, -0.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r16 = Left_boot.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-1.0F, -3.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.5156F, 9.525F, -0.2828F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r17 = Left_boot.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 80).mirror().addBox(-1.0F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.5156F, 9.525F, -0.4328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition Right_boot = partdefinition.addOrReplaceChild("Right_boot", CubeListBuilder.create(), PartPose.offset(-1.9906F, 14.0F, -0.2172F));
        PartDefinition cube_r18 = Right_boot.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(71, 108).addBox(0.0F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5094F, 9.55F, -1.6578F, 1.5621F, 0.0F, 0.0F));
        PartDefinition cube_r19 = Right_boot.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 103).addBox(0.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.5094F, 10.35F, -1.5828F, 0.733F, 0.0F, 0.0F));
        PartDefinition cube_r20 = Right_boot.addOrReplaceChild("cube_r20",
                CubeListBuilder.create().texOffs(82, 87).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 87).addBox(-7.4F, -3.0F, -4.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.2156F, 9.9F, -0.3078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r21 = Right_boot.addOrReplaceChild("cube_r21",
                CubeListBuilder.create().texOffs(60, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 54).mirror().addBox(-6.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.3906F, 7.5F, -0.4828F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r22 = Right_boot.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 1).mirror().addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.9906F, 7.1F, -3.0828F, -0.1222F, 0.0F, 0.0F));
        PartDefinition cube_r23 = Right_boot.addOrReplaceChild("cube_r23",
                CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21).mirror().addBox(-5.2F, -3.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9906F, 8.2F, -0.4828F, -0.7854F, 0.0F, 0.0F));
        PartDefinition cube_r24 = Right_boot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 32).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0094F, 5.6F, 0.6172F, -0.1745F, 0.3491F, 0.0F));
        PartDefinition cube_r25 = Right_boot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 32).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0094F, 5.6F, 1.2172F, 0.5672F, 0.3491F, 0.0F));
        PartDefinition cube_r26 = Right_boot.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.0094F, 5.6F, 0.6172F, -0.1745F, -0.3491F, 0.0F));
        PartDefinition cube_r27 = Right_boot.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.0094F, 5.6F, 1.2172F, 0.5672F, -0.3491F, 0.0F));
        PartDefinition cube_r28 = Right_boot.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(39, 67).addBox(0.0F, -3.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 5.3F, -4.1078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r29 = Right_boot.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 122).addBox(0.0F, -3.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 5.6F, 0.7672F, 1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r30 = Right_boot.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(77, 122).addBox(0.0F, -3.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 5.9F, -0.3328F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r31 = Right_boot.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(65, 120).addBox(0.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9844F, 5.3F, -0.6078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r32 = Right_boot.addOrReplaceChild("cube_r32",
                CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-2.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 50).addBox(2.25F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1344F, 5.3F, -0.5078F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r33 = Right_boot.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(95, 80).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.5156F, 9.525F, -0.2828F, -1.5708F, 0.0F, 0.0F));
        PartDefinition cube_r34 = Right_boot.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(95, 80).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.5156F, 9.525F, -0.4328F, -1.5708F, 0.0F, 0.0F));
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
