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


public class NetheriteWarriorLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_warrior_leggings"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public NetheriteWarriorLeggings(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
                CubeListBuilder.create().texOffs(26, 0).mirror().addBox(1.9F, 5.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 0).addBox(-2.7F, 5.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(32, 12).addBox(-1.0F, 7.2F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 32).addBox(-1.0F, 4.3F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
                        .addBox(-1.025F, 5.25F, -3.525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 32).addBox(0.9F, 5.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 31)
                        .addBox(-1.9F, 5.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
                        .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 6).addBox(0.0F, -2.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.6F, 2.5F, 0.0F, 1.5708F, 0.0F));
        PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.025F, 1.525F, 2.85F, 0.0F, -0.6981F, -0.288F));
        PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 22).addBox(0.0F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.95F, 1.225F, -0.075F, 0.0F, 0.0F, -0.288F));
        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 31).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.05F, 1.55F, -3.0F, 0.0F, 0.6981F, -0.288F));
        PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 12).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.725F, 3.225F, 2.85F, 0.0F, -0.6981F, -0.288F));
        PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 11).addBox(0.0F, -4.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.65F, 2.925F, -0.075F, 0.0F, 0.0F, -0.288F));
        PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.75F, 3.25F, -3.0F, 0.0F, 0.6981F, -0.288F));
        PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 5.05F, -2.975F, 0.0F, 0.6981F, -0.288F));
        PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 20).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.075F, 5.05F, 2.825F, 0.0F, -0.6981F, -0.288F));
        PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.05F, 4.8F, -0.075F, 0.0F, 0.0F, -0.288F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
                CubeListBuilder.create().texOffs(26, 0).addBox(-2.9F, 5.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 0).mirror().addBox(1.7F, 5.6F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(32, 12).mirror().addBox(-1.0F, 7.2F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 32).mirror().addBox(-1.0F, 4.3F, -2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(0, 32).mirror().addBox(-0.975F, 5.25F, -3.525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 32).mirror().addBox(-1.9F, 5.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(22, 31).mirror().addBox(0.9F, 5.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
                        .texOffs(0, 0).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-1.9F, 12.0F, 0.0F));
        PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 6).mirror().addBox(-1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-0.5F, 7.6F, 2.5F, 0.0F, -1.5708F, 0.0F));
        PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.025F, 1.525F, 2.85F, 0.0F, 0.6981F, 0.288F));
        PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 22).mirror().addBox(-1.0F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.95F, 1.225F, -0.075F, 0.0F, 0.0F, 0.288F));
        PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.05F, 1.55F, -3.0F, 0.0F, -0.6981F, 0.288F));
        PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 12).mirror().addBox(-1.0F, -4.0F, -2.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.725F, 3.225F, 2.85F, 0.0F, 0.6981F, 0.288F));
        PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-1.0F, -4.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.65F, 2.925F, -0.075F, 0.0F, 0.0F, 0.288F));
        PartDefinition cube_r17 = RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, 1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.75F, 3.25F, -3.0F, 0.0F, -0.6981F, 0.288F));
        PartDefinition cube_r18 = RightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 28).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 5.05F, -2.975F, 0.0F, -0.6981F, 0.288F));
        PartDefinition cube_r19 = RightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 20).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.075F, 5.05F, 2.825F, 0.0F, 0.6981F, 0.288F));
        PartDefinition cube_r20 = RightLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-1.0F, -2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.05F, 4.8F, -0.075F, 0.0F, 0.0F, 0.288F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
