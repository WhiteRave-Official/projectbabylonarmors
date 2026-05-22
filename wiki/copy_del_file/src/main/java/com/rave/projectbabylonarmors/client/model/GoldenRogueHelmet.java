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

public class GoldenRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "golden_rogue_helmet"), "main");
    public final ModelPart Head;

    public GoldenRogueHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -8.7F, -4.9F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-5.0F, -2.7F, -4.9F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 7)
                        .addBox(-5.0F, -5.7F, -4.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 20).addBox(-4.6F, -4.7F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
                        .addBox(3.6F, -4.7F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 13).addBox(-0.4F, -4.7F, 3.6F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
                        .addBox(-4.6F, -4.7F, 3.6F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 16).addBox(-5.0F, -5.7F, -4.9F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
                        .addBox(-1.0F, -5.3F, -5.4F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(0.9F, -5.6F, -5.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 0).mirror()
                        .addBox(-3.9F, -5.6F, -5.4F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 43).addBox(4.0F, -5.7F, -4.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(-4.2F, -4.7F, -4.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(0.2F, -4.7F, -4.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 36).mirror().addBox(0.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -5.4F, 3.7F, -1.9894F, 0.2743F, -1.6771F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(0.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.0F, -5.4F, -0.3F, -1.4844F, 0.034F, -1.5716F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 36).mirror().addBox(0.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.6F, -3.5F, -2.5F, -0.7862F, 0.5351F, -1.1268F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-6.6F, -12.2F, -1.3F, 0.5236F, 0.0F, -0.6545F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 42).mirror().addBox(0.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.9F, -9.5F, -4.3F, -0.6545F, 0.0F, -0.6545F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 58).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -9.55F, -0.35F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 57).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -9.55F, -0.35F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, -5.775F, -0.8F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 28).mirror().addBox(-1.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, -6.5F, -4.1F, 0.6545F, 0.0F, -0.6545F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 28).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, -6.5F, -4.1F, 0.6545F, 0.0F, 0.6545F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 36).addBox(-2.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, -5.4F, 3.7F, -1.9894F, -0.2743F, 1.6771F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, -5.4F, -0.3F, -1.4844F, -0.034F, 1.5716F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 36).addBox(-2.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.6F, -3.5F, -2.5F, -0.7862F, -0.5351F, 1.1268F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 42).addBox(-2.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.9F, -9.5F, -4.3F, -0.6545F, 0.0F, 0.6545F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6F, -12.2F, -1.3F, 0.5236F, 0.0F, 0.6545F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
