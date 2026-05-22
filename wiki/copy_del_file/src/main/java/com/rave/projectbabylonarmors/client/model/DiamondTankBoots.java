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


public class DiamondTankBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "diamond_tank_boots"), "main");
    public final ModelPart LeftBoot;
    public final ModelPart RightBoot;

    public DiamondTankBoots(ModelPart root) {
        this.LeftBoot = root.getChild("LeftBoot");
        this.RightBoot = root.getChild("RightBoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
                CubeListBuilder.create().texOffs(28, 3).addBox(-3.3F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
                        .addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 5).addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
                        .addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(2.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
                        .addBox(-3.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 25).addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
                        .addBox(-2.0F, 10.8F, -3.4534F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 26).addBox(-2.425F, 10.8F, -4.2534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(-3.4F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 17).addBox(-0.8F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 19)
                        .addBox(-0.8F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 21).addBox(-3.3F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r1 = LeftBoot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 5).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.725F, 7.5F, -1.2534F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r2 = LeftBoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 26).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 9.8F, -2.0534F, -0.7854F, 0.0F, 0.0F));
        PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
                CubeListBuilder.create().texOffs(28, 3).mirror().addBox(-0.7F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 9).mirror().addBox(1.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(14, 9).mirror().addBox(-3.0F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 5).mirror().addBox(-1.0F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 11).mirror().addBox(-1.0F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19).mirror().addBox(-3.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(14, 19).mirror().addBox(2.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 25).mirror()
                        .addBox(-2.0F, 9.8F, -3.4534F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 0).mirror().addBox(-2.0F, 10.8F, -3.4534F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 26)
                        .mirror().addBox(-2.575F, 10.8F, -4.2534F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-3.6F, 10.0F, -2.5534F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(28, 17).mirror().addBox(-3.2F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 19).mirror().addBox(-3.2F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 21).mirror().addBox(-0.7F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(-2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r3 = RightBoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 5).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.725F, 7.5F, -1.2534F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r4 = RightBoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 26).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.5F, 9.8F, -2.0534F, -0.7854F, 0.0F, 0.0F));
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
