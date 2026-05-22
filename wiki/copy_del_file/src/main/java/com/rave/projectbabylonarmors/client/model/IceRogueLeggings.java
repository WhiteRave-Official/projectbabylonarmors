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


public class IceRogueLeggings<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_rogue_leggings"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public IceRogueLeggings(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
        PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 5.4F, 0.9F, -0.4253F, -0.1433F, -0.613F));
        PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 6.4F, 0.9F, -0.4712F, -0.7024F, -0.6817F));
        PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 3.6F, 0.9F, -0.4712F, -0.7024F, -0.6817F));
        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4",
                CubeListBuilder.create().texOffs(40, 59).addBox(-3.0F, -6.0F, 0.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 59).addBox(-3.0F, -6.0F, -3.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.1F, 6.0F, 0.2F, 0.0F, 0.0F, -0.48F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
        PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.1F, 5.4F, 0.9F, -0.4253F, 0.1433F, 0.613F));
        PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.1F, 6.4F, 0.9F, -0.4712F, 0.7024F, 0.6817F));
        PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-1.1F, 3.6F, 0.9F, -0.4712F, 0.7024F, 0.6817F));
        PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 59).mirror().addBox(-1.0F, -6.0F, 0.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 59).mirror()
                .addBox(-1.0F, -6.0F, -3.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 6.0F, 0.2F, 0.0F, 0.0F, 0.48F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
