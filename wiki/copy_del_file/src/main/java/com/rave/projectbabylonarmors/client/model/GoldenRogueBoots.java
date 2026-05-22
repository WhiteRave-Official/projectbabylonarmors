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


public class GoldenRogueBoots<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("project_babylon_armors", "golden_rogue_boots"), "main");
    public final ModelPart LeftBoot;
    public final ModelPart RightBoot;

    public GoldenRogueBoots(ModelPart root) {
        this.LeftBoot = root.getChild("LeftBoot");
        this.RightBoot = root.getChild("RightBoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
                CubeListBuilder.create().texOffs(28, 3).addBox(-3.3F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.6F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
                        .addBox(0.7F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 5).addBox(-0.975F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
                        .addBox(-0.975F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(2.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 57)
                        .addBox(0.575F, 5.5F, -2.0034F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 57).mirror().addBox(-1.575F, 5.5F, -2.0034F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 19)
                        .addBox(-3.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 25).addBox(-1.5F, 9.8F, -3.4534F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(-3.0F, 10.05F, -2.5534F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 17).addBox(-0.8F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
                        .addBox(-3.3F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 21).mirror().addBox(-0.8F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offset(2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r1 = LeftBoot.addOrReplaceChild("cube_r1",
                CubeListBuilder.create().texOffs(55, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 18).mirror().addBox(-6.1F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(2.5F, 8.6F, 1.8466F, -0.3491F, 0.0F, 0.0F));
        PartDefinition cube_r2 = LeftBoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 50).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 8.675F, 5.2466F, -0.6453F, 0.5049F, 0.051F));
        PartDefinition cube_r3 = LeftBoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 59).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.8F, 6.3F, 5.6467F, 0.7854F, 0.0F, -0.48F));
        PartDefinition cube_r4 = LeftBoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, 3.925F, 1.2467F, 2.3998F, 0.0F, -0.48F));
        PartDefinition cube_r5 = LeftBoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 5.675F, 7.2466F, 0.4019F, 0.5049F, 0.051F));
        PartDefinition cube_r6 = LeftBoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, 3.975F, 4.2466F, 1.6493F, 0.0F, -0.48F));
        PartDefinition cube_r7 = LeftBoot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.0F, 3.925F, 1.2467F, 2.3998F, 0.0F, 0.48F));
        PartDefinition cube_r8 = LeftBoot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 59).mirror().addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.8F, 6.3F, 5.6467F, 0.7854F, 0.0F, 0.48F));
        PartDefinition cube_r9 = LeftBoot.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 8.675F, 5.2466F, -0.6453F, -0.5049F, -0.051F));
        PartDefinition cube_r10 = LeftBoot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 10.075F, 1.2467F, 0.4019F, 0.5049F, 0.051F));
        PartDefinition cube_r11 = LeftBoot.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 10.075F, 1.2467F, 0.4019F, -0.5049F, -0.051F));
        PartDefinition cube_r12 = LeftBoot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 5.675F, 7.2466F, 0.4019F, -0.5049F, -0.051F));
        PartDefinition cube_r13 = LeftBoot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.0F, 3.975F, 4.2466F, 1.6493F, 0.0F, 0.48F));
        PartDefinition cube_r14 = LeftBoot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(2, 27).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 9.8F, -2.0534F, -0.7854F, 0.0F, 0.0F));
        PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
                CubeListBuilder.create().texOffs(28, 3).mirror().addBox(-0.7F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 9).mirror().addBox(0.6F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(14, 9).mirror().addBox(-2.7F, 6.0F, -1.3533F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 5).mirror()
                        .addBox(-1.025F, 6.0F, -1.1534F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 11).mirror().addBox(-1.025F, 6.0F, 2.5467F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19)
                        .mirror().addBox(-3.2F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 57).mirror().addBox(-1.575F, 5.5F, -2.0034F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(4, 57).addBox(0.575F, 5.5F, -2.0034F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 19).mirror().addBox(2.3F, 5.0F, -2.0534F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 25)
                        .mirror().addBox(-1.5F, 9.8F, -3.4534F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-3.0F, 10.05F, -2.5534F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
                        .texOffs(28, 17).mirror().addBox(-3.2F, 5.0F, -2.0534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 21).mirror().addBox(-0.7F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false).texOffs(28, 21).addBox(-3.2F, 5.0F, 2.9466F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.0F, 14.0F, -0.9466F));
        PartDefinition cube_r15 = RightBoot.addOrReplaceChild("cube_r15",
                CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(55, 18).addBox(4.1F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, 8.6F, 1.8466F, -0.3491F, 0.0F, 0.0F));
        PartDefinition cube_r16 = RightBoot.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.0F, 8.675F, 5.2466F, -0.6453F, -0.5049F, -0.051F));
        PartDefinition cube_r17 = RightBoot.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(13, 59).mirror().addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(4.8F, 6.3F, 5.6467F, 0.7854F, 0.0F, 0.48F));
        PartDefinition cube_r18 = RightBoot.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.0F, 3.925F, 1.2467F, 2.3998F, 0.0F, 0.48F));
        PartDefinition cube_r19 = RightBoot.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 5.675F, 7.2466F, 0.4019F, -0.5049F, -0.051F));
        PartDefinition cube_r20 = RightBoot.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(6.0F, 3.975F, 4.2466F, 1.6493F, 0.0F, 0.48F));
        PartDefinition cube_r21 = RightBoot.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, 3.925F, 1.2467F, 2.3998F, 0.0F, -0.48F));
        PartDefinition cube_r22 = RightBoot.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(13, 59).addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.8F, 6.3F, 5.6467F, 0.7854F, 0.0F, -0.48F));
        PartDefinition cube_r23 = RightBoot.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(43, 50).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 8.675F, 5.2466F, -0.6453F, 0.5049F, 0.051F));
        PartDefinition cube_r24 = RightBoot.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(3.3F, 10.075F, 1.2467F, 0.4019F, -0.5049F, -0.051F));
        PartDefinition cube_r25 = RightBoot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 10.075F, 1.2467F, 0.4019F, 0.5049F, 0.051F));
        PartDefinition cube_r26 = RightBoot.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.3F, 5.675F, 7.2466F, 0.4019F, 0.5049F, 0.051F));
        PartDefinition cube_r27 = RightBoot.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(53, 59).addBox(1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, 3.975F, 4.2466F, 1.6493F, 0.0F, -0.48F));
        PartDefinition cube_r28 = RightBoot.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(2, 27).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
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
