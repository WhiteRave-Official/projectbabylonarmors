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


public class EtherealRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ethereal_rogue_helmet"), "main");
    public final ModelPart Hood;

    public EtherealRogueHelmet(ModelPart root) {
        this.Hood = root.getChild("Hood");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Hood = partdefinition.addOrReplaceChild("Hood", CubeListBuilder.create().texOffs(55, 86).addBox(-1.0F, -11.9F, -4.45F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Hood.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(113, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, -0.4F, 10.7F, 0.3316F, -0.5061F, -0.7679F));
        PartDefinition cube_r2 = Hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 55).addBox(-2.0987F, -2.2448F, -0.8185F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1342F, -4.6118F, 7.2654F, 0.3444F, -0.3012F, -2.3999F));
        PartDefinition cube_r3 = Hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 50).mirror().addBox(-1.8F, -8.8F, 2.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.635F, 0.81F, 0.7275F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r4 = Hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 50).addBox(-0.2F, -8.8F, 2.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.635F, 0.81F, 0.7275F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r5 = Hood.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.15F, 1.2F, -3.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r6 = Hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 73).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, 1.2F, -3.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r7 = Hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 26).addBox(-1.4013F, -1.7552F, -2.1815F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1342F, -3.1118F, 7.2654F, 0.3444F, -0.3012F, -2.3999F));
        PartDefinition cube_r8 = Hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 11).addBox(-2.4226F, -2.8712F, -2.8319F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4528F, -3.5695F, 6.5319F, 0.0F, 0.0F, -2.3998F));
        PartDefinition cube_r9 = Hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 42).addBox(-6.0F, -8.2F, 2.7F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.365F, -0.9F, 0.7275F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 52).addBox(-2.0F, -6.6F, 2.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.83F, 0.81F, 0.7275F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 0).addBox(-0.2F, -6.6F, 2.7F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.35F, -3.69F, 0.6375F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 50).addBox(-0.2F, -6.6F, 2.7F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.93F, 0.81F, 0.7275F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 1).addBox(-6.1F, -8.9F, 2.7F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.945F, 0.81F, 0.7025F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.9F, -9.8F, -4.5F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.26F, 2.25F, 0.05F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(113, 24).addBox(-3.0F, -8.0F, 1.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6F, 7.6F, 9.0F, 0.0F, 0.5672F, 0.0F));
        PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 34).mirror().addBox(-0.9F, -5.8F, -4.5F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.2025F, -7.745F, 0.05F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 0).addBox(-1.1F, -8.7F, -4.5F, 2.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.69F, -2.06F, 0.05F, 0.0F, 0.0F, -0.6283F));
        PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(24, 34).addBox(-1.1F, -5.8F, -4.5F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.2025F, -7.745F, 0.05F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 22).addBox(-5.1F, -9.2F, 1.8F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1375F, 8.64F, 0.7F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r20 = Hood.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 18).addBox(-1.1F, -9.8F, -4.5F, 2.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.26F, 2.25F, 0.05F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r21 = Hood.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.9F, -8.7F, -4.5F, 2.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.69F, -2.06F, 0.05F, 0.0F, 0.0F, 0.6283F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
