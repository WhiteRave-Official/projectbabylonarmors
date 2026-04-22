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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, -17.2F, 0.4F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 45).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, -4.3F, -2.0F, -0.3229F, 0.3615F, 0.8131F));
        PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-3.0F, -3.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.2984F, -2.4753F, -0.6789F, -0.0122F, 0.0006F, -0.6198F));
        PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 38).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-7.6734F, -0.9003F, -0.6789F, -0.0065F, 0.0103F, 0.3401F));
        PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 38).mirror().addBox(-2.0F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-8.0734F, -6.9003F, -0.6539F, 0.0F, 0.0121F, 0.7765F));
        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 38).mirror().addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-5.95F, -4.725F, -0.65F, 0.0096F, 0.0075F, 0.0089F));
        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.95F, -4.65F, -0.65F, -0.0002F, 0.0122F, -0.9161F));
        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 44).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.0F, -4.7F, -2.0F, 0.3229F, 0.3615F, -0.8131F));
        PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.95F, -5.95F, -2.65F, 0.4702F, 0.1001F, -0.1942F));
        PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 38).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-4.2984F, -12.5247F, -0.6789F, 0.0122F, 0.0006F, 0.6198F));
        PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 45).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, -4.3F, -2.0F, -0.3229F, -0.3615F, -0.8131F));
        PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 18).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.95F, -4.65F, -0.65F, -0.0002F, -0.0122F, 0.9161F));
        PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 38).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.95F, -4.725F, -0.65F, 0.0096F, -0.0075F, -0.0089F));
        PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 4).mirror().addBox(-3.0F, -3.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.4984F, -2.4753F, 3.3211F, -0.0141F, 0.5242F, -0.6268F));
        PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 4).addBox(-2.0F, -3.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.4984F, -2.4753F, 3.3211F, -0.0141F, -0.5242F, 0.6268F));
        PartDefinition cube_r15 = Head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 38).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.0734F, -6.9003F, -0.6539F, 0.0F, -0.0121F, -0.7765F));
        PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.6734F, -0.9003F, -0.6789F, -0.0065F, -0.0103F, -0.3401F));
        PartDefinition cube_r17 = Head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, -3.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.2984F, -2.4753F, -0.6789F, -0.0122F, -0.0006F, 0.6198F));
        PartDefinition cube_r18 = Head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.2984F, -12.5247F, -0.6789F, 0.0122F, -0.0006F, -0.6198F));
        PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 8).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.95F, -5.95F, -2.65F, 0.4702F, -0.1001F, 0.1942F));
        PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 44).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, -4.7F, -2.0F, 0.3229F, -0.3615F, 0.8131F));
        PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 49).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.45F, -5.5F, -4.0F, 0.48F, 0.0F, 0.0F));
        PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.05F, -7.475F, -4.65F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r23 = Head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-3.575F, -5.95F, -4.575F, 0.0F, 0.0F, 0.48F));
        PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(46, 4).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.35F, -5.7F, -4.9F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(-2.525F, -5.95F, -4.575F, 0.0F, 0.0F, -0.48F));
        PartDefinition cube_r26 = Head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.05F, -7.475F, -4.65F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r27 = Head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 49).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.575F, -5.95F, -4.575F, 0.0F, 0.0F, -0.48F));
        PartDefinition cube_r28 = Head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.35F, -5.7F, -4.9F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(16, 49).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.525F, -5.95F, -4.575F, 0.0F, 0.0F, 0.48F));
        PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.65F, -6.9F, -5.3F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r31 = Head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 49).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.575F, -7.15F, -4.975F, 0.0F, 0.0F, -0.48F));
        PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.05F, -8.675F, -5.05F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(44, 23).addBox(0.0F, 1.0F, 8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -5.15F, -4.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(31, 36).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.475F, -5.15F, -4.0F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 46).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.225F, -4.85F, -4.0F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 36).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.475F, -5.15F, -4.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r37 = Head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 27).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.225F, -4.85F, -4.0F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r38 = Head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 16).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.475F, -5.15F, -4.0F, 0.0F, 0.0F, -1.5708F));
        PartDefinition cube_r39 = Head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(48, 23).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.775F, -4.85F, -4.0F, 0.0F, 0.0F, 0.7854F));
        PartDefinition cube_r40 = Head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.475F, -5.15F, -4.0F, 0.0F, 0.0F, 1.5708F));
        PartDefinition cube_r41 = Head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(44, 46).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.775F, -4.85F, -4.0F, 0.0F, 0.0F, -0.7854F));
        PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(16, 49).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.475F, -7.15F, -4.975F, 0.0F, 0.0F, 0.48F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
