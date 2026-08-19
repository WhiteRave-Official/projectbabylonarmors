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


public class NetheriteRogueHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_rogue_helmet"), "main");
    public final ModelPart Hood;

    public NetheriteRogueHelmet(ModelPart root) {
        this.Hood = root.getChild("Hood");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Hood = partdefinition.addOrReplaceChild("Hood", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Hood.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, -10.175F, -0.6F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r2 = Hood.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 54).addBox(-3.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.275F, -0.35F, -0.6F, 0.0F, 0.0F, -0.8116F));
        PartDefinition cube_r3 = Hood.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 51).addBox(1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.275F, -0.35F, -0.6F, 0.0F, 0.0F, 0.8116F));
        PartDefinition cube_r4 = Hood.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, -0.85F, 12.4F, -0.2697F, -0.2561F, -0.707F));
        PartDefinition cube_r5 = Hood.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 49).addBox(-2.0F, -9.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.15F, 0.9F, -0.225F, 0.0F, 0.0F, -0.0087F));
        PartDefinition cube_r6 = Hood.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 49).addBox(0.0F, -9.0F, 3.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.15F, 0.9F, -0.225F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r7 = Hood.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 26).addBox(-3.0F, -5.0F, -5.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.15F, -2.85F, 9.4F, -0.2697F, -0.2561F, -0.707F));
        PartDefinition cube_r8 = Hood.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 11).addBox(-3.0F, -7.0F, -5.0F, 7.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.55F, -2.85F, 8.7F, 0.0F, 0.0F, -0.8465F));
        PartDefinition cube_r9 = Hood.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 41).addBox(-6.0F, -9.0F, 3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.85F, -1.0F, -0.225F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r10 = Hood.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.7F, 0.9F, -0.225F, 0.0F, 0.0F, -0.0262F));
        PartDefinition cube_r11 = Hood.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 49).addBox(0.0F, -7.0F, 3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.7F, 0.9F, -0.225F, 0.0F, 0.0F, 0.0262F));
        PartDefinition cube_r12 = Hood.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 0).addBox(-7.0F, -10.0F, 3.0F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.05F, 0.9F, -0.225F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r13 = Hood.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 2.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -10.95F, -0.1F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r14 = Hood.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(0.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(5.225F, -10.95F, -0.15F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r15 = Hood.addOrReplaceChild("cube_r15",
                CubeListBuilder.create().texOffs(67, 66).addBox(-1.0F, 2.0F, -5.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 64).addBox(-1.0F, 2.0F, -4.95F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -10.95F, -0.15F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r16 = Hood.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.25F, -8.05F, -0.2F, 0.0F, 0.0F, -0.9774F));
        PartDefinition cube_r17 = Hood.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 34).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.225F, -8.05F, -0.2F, 0.0F, 0.0F, 0.9774F));
        PartDefinition cube_r18 = Hood.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 21).addBox(-6.0F, -10.0F, 2.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.375F, 9.6F, -0.225F, 0.0F, 0.0F, 0.0087F));
        PartDefinition cube_r19 = Hood.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 17).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.1F, -1.4F, -0.2F, 0.0F, 0.0F, 0.6283F));
        PartDefinition cube_r20 = Hood.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4F, 2.5F, -0.2F, 0.0F, 0.0F, -0.7243F));
        PartDefinition cube_r21 = Hood.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 58).addBox(-5.0F, -10.0F, -5.0F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.6F, 3.4F, 0.025F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r22 = Hood.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 0).addBox(-5.0F, -13.0F, -5.0F, 3.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.6F, 2.6F, 0.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r23 = Hood.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.4F, 2.5F, -0.2F, 0.0F, 0.0F, 0.7243F));
        PartDefinition cube_r24 = Hood.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.1F, -1.4F, -0.2F, 0.0F, 0.0F, -0.6283F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
