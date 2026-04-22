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


public class DragonsteelWarriorHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "dragonsteel_warrior_helmet"), "main");
    public final ModelPart Head;

    public DragonsteelWarriorHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head",
                CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 29).addBox(3.0F, -8.0F, -5.0F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 22).mirror()
                        .addBox(-1.6F, -8.6F, -7.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 0).addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
                        .addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 47).addBox(-5.0F, -8.0F, 3.925F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
                        .addBox(0.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 0).addBox(2.7F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 0).mirror()
                        .addBox(-3.0F, -1.8F, 3.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(97, 0).mirror().addBox(-3.8F, -1.8F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 6)
                        .addBox(-0.15F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 37).addBox(-2.85F, 0.125F, 2.975F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 21).addBox(-1.0F, -10.1F, -6.8F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
                        .addBox(-1.0F, -6.0F, 2.8F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 120).addBox(-3.0F, -6.0F, -9.7F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 126)
                        .addBox(-3.0F, -4.0F, -9.7F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(116, 89).addBox(-3.0F, -4.0F, -9.7F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(116, 89).mirror()
                        .addBox(3.0F, -4.0F, -9.7F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 20).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.9322F, -0.442F, -5.0717F, 0.462F, -0.7553F, -0.2508F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.9322F, -0.442F, -5.0717F, 0.462F, 0.7553F, 0.2508F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-2, 71).addBox(-1.4549F, -1.6393F, -0.0548F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9168F, -12.0198F, -0.7629F, 0.0789F, -0.622F, 1.478F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(105, 70).addBox(-1.8507F, -1.4297F, -2.8617F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9168F, -12.0198F, -0.7629F, 0.5676F, -0.622F, 1.478F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 84).addBox(-0.8409F, 1.1043F, -3.4994F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.9168F, -12.1198F, -0.7629F, -0.7937F, -0.622F, 1.478F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 22).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9F, -3.6F, -5.6F, 0.2054F, -1.0836F, 0.1659F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-2.1591F, 1.1043F, -3.4994F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.9168F, -12.1198F, -0.7629F, -0.7937F, 0.622F, -1.478F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-1.1493F, -1.4297F, -2.8617F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.9168F, -12.0198F, -0.7629F, 0.5676F, 0.622F, -1.478F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-2, 71).mirror().addBox(-0.5451F, -1.6393F, -0.0548F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.9168F, -12.0198F, -0.7629F, 0.0789F, 0.622F, -1.478F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 84).addBox(-1.3386F, 0.7969F, -1.8857F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.9043F, -7.5337F, 2.1371F, 0.0431F, -0.4496F, 0.2529F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 70).addBox(-2.3484F, 0.0849F, -2.2254F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.9043F, -7.5337F, 2.1371F, 1.4044F, -0.4496F, 0.2529F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 22).addBox(0.1446F, 1.4199F, -4.1169F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.9043F, -7.5337F, 2.1371F, -0.9846F, -0.3539F, 1.0561F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-2, 71).addBox(-1.9526F, -0.6007F, 1.2181F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.9043F, -7.5337F, 2.1371F, 0.9157F, -0.4496F, 0.2529F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-2, 71).mirror().addBox(-0.0474F, -0.6007F, 1.2181F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.9043F, -7.5337F, 2.1371F, 0.9157F, 0.4496F, -0.2529F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-0.6516F, 0.0849F, -2.2254F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.9043F, -7.5337F, 2.1371F, 1.4044F, 0.4496F, -0.2529F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-1.6614F, 0.7969F, -1.8857F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.9043F, -7.5337F, 2.1371F, 0.0431F, 0.4496F, -0.2529F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-1.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.9F, -3.6F, -5.6F, 0.2054F, 1.0836F, -0.1659F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 22).mirror().addBox(-3.1446F, 1.4199F, -4.1169F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.9043F, -7.5337F, 2.1371F, -0.9846F, 0.3539F, -1.0561F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(64, 47).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.375F, 3.975F, 4.025F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(1, 65).addBox(0.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.375F, 3.975F, 4.025F, 0.0F, 0.0F, 0.7854F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
