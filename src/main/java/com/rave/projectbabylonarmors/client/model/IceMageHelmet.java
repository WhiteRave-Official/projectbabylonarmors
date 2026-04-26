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


public class IceMageHelmet<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "ice_mage_helmet"), "main");
    public final ModelPart Head;

    public IceMageHelmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-4.4329F, -1.2254F, -4.1231F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(3, 80).addBox(-5.8499F, 2.1068F, -5.7276F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.04F, 0.9984F, -4.7448F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.1784F, -0.2588F, -0.0272F));

        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 25).addBox(-3.3513F, -3.0105F, -3.452F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -0.1727F, -0.7524F, -0.1108F));

        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 57).addBox(-2.8837F, -4.9425F, -4.1317F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -0.6137F, -0.7251F, -0.1349F));

        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 59).addBox(-2.3521F, -6.5732F, -5.6555F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -1.05F, -0.7251F, -0.1349F));

        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 59).addBox(-2.0081F, -6.592F, -7.9524F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -1.5626F, -0.68F, -0.1309F));

        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-1.004F, 0.5817F, -9.831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(89, 36).mirror().addBox(-0.9608F, 0.6006F, -10.551F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -2.7702F, -0.8247F, -0.0879F));

        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 36).addBox(-1.2709F, 0.6103F, -10.5368F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(89, 36).addBox(-1.2276F, 0.5915F, -9.8168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(88, 47).addBox(-1.6087F, -1.5358F, -10.087F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -2.7407F, -0.68F, -0.1309F));

        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 67).addBox(-1.6297F, -5.745F, -8.8505F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -1.9116F, -0.68F, -0.1309F));

        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 66).addBox(-2.1514F, -7.336F, 5.5543F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -0.5232F, -0.7024F, -0.059F));

        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 84).addBox(-9.0833F, 4.4797F, -9.6857F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.2173F, -0.2651F, -0.0421F));

        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 109).addBox(-8.7952F, 4.5272F, -9.1864F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.2396F, 0.5019F, 0.1326F));

        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(80, 0).addBox(-10.8F, 4.0271F, -3.8635F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(108, 8).mirror().addBox(8.8F, 4.0271F, -3.8635F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(116, 74).mirror().addBox(8.8F, 4.0271F, -0.6635F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(88, 66).addBox(-10.8F, 4.0271F, -0.6635F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(108, 31).mirror().addBox(-4.0F, 4.0271F, -11.2635F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(108, 64).addBox(-4.0F, 4.0271F, 8.7365F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.1793F, -0.2774F, -0.0307F));

        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(104, 40).mirror().addBox(-4.4144F, 4.0271F, -10.5578F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(99, 0).addBox(-5.1971F, 4.0271F, 8.2019F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.2012F, 0.5384F, 0.1231F));

        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(104, 50).addBox(-5.5856F, 4.0271F, -10.5578F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 45).mirror().addBox(-4.8029F, 4.0271F, 8.2019F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 0.3737F, -1.0816F, -0.3143F));

        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(87, 18).addBox(-3.151F, -0.088F, -5.1055F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, 2.7241F, -1.3148F, 3.1085F));

        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-3.849F, -0.088F, -5.1055F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -0.4219F, 1.272F, -0.0328F));

        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-3.3951F, 0.4925F, -4.7683F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -10.8859F, 0.1631F, -0.3976F, -0.2515F, -0.0268F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}