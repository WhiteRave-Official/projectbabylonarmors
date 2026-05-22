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


public class DiamondRogueBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_rogue_boots"), "main");
    public final ModelPart LeftBoot;
    public final ModelPart RightBoot;

    public DiamondRogueBoots(ModelPart root) {
        this.LeftBoot = root.getChild("LeftBoot");
        this.RightBoot = root.getChild("RightBoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
                CubeListBuilder.create().texOffs(28, 3).addBox(-3.3F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.8F, 6.0F, -1.3534F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
                        .addBox(0.8F, 6.0F, -1.3534F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 5).addBox(-1.0F, 6.0F, -1.1533F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
                        .addBox(-1.0F, 6.0F, 2.5466F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(2.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
                        .addBox(-3.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-2.975F, 10.0F, -1.9534F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 17)
                        .addBox(-0.8F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 19).addBox(-0.8F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
                        .addBox(-3.3F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r1 = LeftBoot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 44).addBox(2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.85F, 8.375F, -1.0034F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r2 = LeftBoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5F, 8.7F, -1.0034F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r3 = LeftBoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, 8.7F, -1.0034F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r4 = LeftBoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 44).addBox(0.0F, -2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2F, 5.0F, -1.0034F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r5 = LeftBoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 46).addBox(0.0F, -2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.8F, 5.0F, -1.0034F, 0.0F, 0.0F, 1.5708F));
        PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
                CubeListBuilder.create().texOffs(28, 3).mirror().addBox(-0.7F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 9).mirror().addBox(0.8F, 6.0F, -1.3534F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(14, 9).mirror().addBox(-2.8F, 6.0F, -1.3534F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 5).mirror().addBox(-1.0F, 6.0F, -1.1533F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 11).mirror().addBox(-1.0F, 6.0F, 2.5466F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19).mirror().addBox(-3.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(14, 19).mirror().addBox(2.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 1).mirror()
                        .addBox(-3.025F, 10.0F, -1.9534F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 17).mirror().addBox(-3.2F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 19)
                        .mirror().addBox(-3.2F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 21).mirror().addBox(-0.7F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r6 = RightBoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 44).mirror().addBox(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.85F, 8.375F, -1.0034F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r7 = RightBoot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, 8.7F, -1.0034F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r8 = RightBoot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5F, 8.7F, -1.0034F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r9 = RightBoot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 44).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.2F, 5.0F, -1.0034F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r10 = RightBoot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.8F, 5.0F, -1.0034F, 0.0F, 0.0F, -1.5708F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
