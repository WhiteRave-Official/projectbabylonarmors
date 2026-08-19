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


public class NetheriteWarriorChestplate<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "netherite_warrior_chestplate"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public NetheriteWarriorChestplate(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, 0.0F));

        PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(106, 60).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, 3.5F, 0.2356F, 0.0F, 0.0F));

        PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, -8.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 15.6F, 3.2F, -1.5708F, 0.0F, 0.0F));

        PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(1, 27).addBox(-1.0F, 0.0F, -8.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 19.4F, -5.0F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 91).mirror().addBox(-5.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.6F, -4.3F, 0.8706F, -0.5724F, -0.5713F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 91).addBox(0.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.6F, -4.3F, 0.8706F, 0.5724F, 0.5713F));

        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 91).mirror().addBox(-5.0F, -2.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 2.6F, -4.3F, 0.8706F, -0.5724F, -0.5713F));

        PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 91).addBox(-2.0F, -2.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.6F, -4.3F, 0.8706F, 0.5724F, 0.5713F));

        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 24).mirror().addBox(-5.0F, -2.0F, -1.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 2.6F, -3.9F, 0.8706F, -0.5724F, -0.5713F));

        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(114, 24).addBox(-1.0F, -2.0F, -1.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.6F, -3.9F, 0.8706F, 0.5724F, 0.5713F));

        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(93, 16).addBox(-1.7875F, -1.825F, -1.0038F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4381F, 11.2305F, -3.45F, 1.5708F, 0.0F, 0.2182F));

        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-4.2125F, -1.825F, -1.0038F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4381F, 11.2305F, -3.45F, 1.5708F, 0.0F, -0.2182F));

        PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(26, 3).addBox(-2.5F, 0.1081F, -8.55F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.65F, -2.3919F, -1.3439F, 0.0F, 0.0F));

        PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(24, 79).addBox(-1.4816F, -0.6946F, -1.5196F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0326F, 11.6342F, -5.642F, 1.577F, -0.0061F, 0.7767F));

        PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(18, 65).addBox(-1.0186F, -1.3054F, -0.9806F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0326F, 11.6342F, -5.642F, 1.577F, -0.0062F, 0.7854F));

        PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(28, 21).addBox(-0.1364F, 1.1578F, -8.45F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.65F, -2.3919F, -1.1881F, -0.9242F, -0.3108F));

        PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(28, 21).mirror().addBox(-3.8636F, 1.1578F, -8.45F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.65F, -2.3919F, -1.1881F, 0.9242F, 0.3108F));

        PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(2, 110).addBox(-2.0F, 1.0F, -6.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, 5.6F, 1.675F, -1.6144F, 0.0F, 0.0F));

        PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(-2, 92).addBox(-2.0F, -3.0F, -3.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, 2.0F, 0.775F, -1.6144F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(104, 38).addBox(-2.0F, 0.4F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(30, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(41, 95).addBox(-1.0F, 7.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.5F, 2.0F, 0.0F));

        PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(67, 105).addBox(-2.54F, -6.64F, -7.56F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0305F, 9.3245F, -4.125F, -1.5708F, 0.0F, 0.0044F));

        PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(67, 105).addBox(-2.54F, -6.64F, -7.56F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0305F, 13.7245F, -4.125F, -1.5708F, 0.0F, 0.0044F));

        PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(56, 117).addBox(-2.2298F, -3.5F, 0.1837F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7901F, -2.3936F, 0.115F, -1.5708F, 0.0F, -1.5577F));

        PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(24, 116).addBox(-1.8357F, -3.5F, -3.7584F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9099F, -3.2936F, 0.115F, -1.5708F, 0.0F, 0.4931F));

        PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(10, 116).addBox(-1.8357F, -3.5F, -3.7584F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7901F, -2.3936F, 0.115F, -1.5708F, 0.0F, -1.0341F));

        PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(44, 119).addBox(-0.761F, -3.0F, -0.5321F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7901F, -2.5936F, 0.115F, -1.5708F, 0.0F, -0.685F));

        PartDefinition LeftArm_r7 = LeftArm.addOrReplaceChild("LeftArm_r7", CubeListBuilder.create().texOffs(73, 118).addBox(-0.8357F, -3.0F, -3.7584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2901F, -1.8936F, 0.115F, -1.5708F, 0.0F, -1.0341F));

        PartDefinition LeftArm_r8 = LeftArm.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(54, 23).addBox(-2.54F, -6.64F, -8.56F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0305F, 4.8245F, -4.125F, -1.5708F, 0.0F, 0.0044F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-4.0F, 0.4F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(30, 36).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
                .texOffs(41, 95).mirror().addBox(-3.0F, 7.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(-5.5F, 2.0F, 0.0F));

        PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(67, 105).mirror().addBox(-2.46F, -6.64F, -7.56F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0305F, 9.3245F, -4.125F, -1.5708F, 0.0F, -0.0044F));

        PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(67, 105).mirror().addBox(-2.46F, -6.64F, -7.56F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0305F, 13.7245F, -4.125F, -1.5708F, 0.0F, -0.0044F));

        PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(56, 117).mirror().addBox(0.2298F, -3.5F, 0.1837F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7901F, -2.3936F, 0.115F, -1.5708F, 0.0F, 1.5577F));

        PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(24, 116).mirror().addBox(-0.1643F, -3.5F, -3.7584F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9099F, -3.2936F, 0.115F, -1.5708F, 0.0F, -0.4931F));

        PartDefinition RightArm_r5 = RightArm.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(10, 116).mirror().addBox(-0.1643F, -3.5F, -3.7584F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7901F, -2.3936F, 0.115F, -1.5708F, 0.0F, 1.0341F));

        PartDefinition RightArm_r6 = RightArm.addOrReplaceChild("RightArm_r6", CubeListBuilder.create().texOffs(44, 119).mirror().addBox(-2.239F, -3.0F, -0.5321F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7901F, -2.5936F, 0.115F, -1.5708F, 0.0F, 0.685F));

        PartDefinition RightArm_r7 = RightArm.addOrReplaceChild("RightArm_r7", CubeListBuilder.create().texOffs(73, 118).mirror().addBox(-3.1643F, -3.0F, -3.7584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2901F, -1.8936F, 0.115F, -1.5708F, 0.0F, 1.0341F));

        PartDefinition RightArm_r8 = RightArm.addOrReplaceChild("RightArm_r8", CubeListBuilder.create().texOffs(54, 23).mirror().addBox(-2.46F, -6.64F, -8.56F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0305F, 4.8245F, -4.125F, -1.5708F, 0.0F, -0.0044F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}