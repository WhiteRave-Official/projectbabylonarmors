package com.rave.projectbabylonarmors.client.geo.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import software.bernie.geckolib.cache.object.GeoQuad;
import software.bernie.geckolib.cache.object.GeoVertex;

import java.util.List;

final class PBAArmorFaceCullingHelper {
    private static final float BODY_PADDING = 0.42F;
    private static final float NORMAL_DOT_THRESHOLD = 0.18F;
    private static List<software.bernie.geckolib.cache.object.GeoCube> activeSiblingCubes;

    private PBAArmorFaceCullingHelper() {
    }

    static boolean shouldCullQuad(String partName, PoseStack poseStack, software.bernie.geckolib.cache.object.GeoCube cube, GeoQuad quad) {
        BodyBounds bounds = BodyBounds.forPart(partName);
        if (bounds == null || quad == null) {
            return false;
        }

        boolean culled = shouldCullQuadInternal(bounds, poseStack, quad);
        if (!culled) {
            culled = PBAGeoCubeOcclusionCullingHelper.isQuadOccludedBySiblingCube(cube, quad, activeSiblingCubes);
        }
        return culled;
    }

    static void endBakeSession() {
        activeSiblingCubes = null;
    }

    static void setActiveSiblingCubes(List<software.bernie.geckolib.cache.object.GeoCube> siblingCubes) {
        activeSiblingCubes = siblingCubes;
    }

    private static boolean shouldCullQuadInternal(BodyBounds bounds, PoseStack poseStack, GeoQuad quad) {
        Matrix4f pose = poseStack.last().pose();
        Vector3f center = new Vector3f();
        for (GeoVertex vertex : quad.vertices()) {
            Vector4f transformed = new Vector4f(vertex.position(), 1.0F);
            transformed.mul(pose);
            center.add(transformed.x(), transformed.y(), transformed.z());
        }
        center.mul(0.25F);

        if (!bounds.containsExpanded(center, BODY_PADDING)) {
            return false;
        }

        Vector3f normal = new Vector3f(quad.normal());
        normal.mul(poseStack.last().normal());
        if (normal.lengthSquared() <= 1.0E-6F) {
            return false;
        }
        normal.normalize();

        Vector3f toBodyCenter = bounds.center();
        toBodyCenter.sub(center);
        if (toBodyCenter.lengthSquared() <= 1.0E-6F) {
            return false;
        }
        toBodyCenter.normalize();

        return normal.dot(toBodyCenter) > NORMAL_DOT_THRESHOLD;
    }

    private record BodyBounds(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
        private static final BodyBounds HEAD = new BodyBounds(-4.0F, 24.0F, -4.0F, 4.0F, 32.0F, 4.0F);
        private static final BodyBounds BODY = new BodyBounds(-4.0F, 12.0F, -2.0F, 4.0F, 24.0F, 2.0F);
        private static final BodyBounds LEFT_ARM = new BodyBounds(4.0F, 12.0F, -2.0F, 8.0F, 24.0F, 2.0F);
        private static final BodyBounds RIGHT_ARM = new BodyBounds(-8.0F, 12.0F, -2.0F, -4.0F, 24.0F, 2.0F);
        private static final BodyBounds LEFT_LEG = new BodyBounds(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 2.0F);
        private static final BodyBounds RIGHT_LEG = new BodyBounds(-4.0F, 0.0F, -2.0F, 0.0F, 12.0F, 2.0F);

        private static BodyBounds forPart(String partName) {
            if (partName == null) {
                return null;
            }

            String normalized = partName.toLowerCase(java.util.Locale.ROOT);
            if (normalized.contains("head") || normalized.contains("helmet")) {
                return HEAD;
            }
            if (normalized.contains("body") || normalized.contains("chest")) {
                return BODY;
            }
            if (normalized.contains("leftarm") || normalized.contains("left_arm")) {
                return LEFT_ARM;
            }
            if (normalized.contains("rightarm") || normalized.contains("right_arm")) {
                return RIGHT_ARM;
            }
            if (normalized.contains("leftboot") || normalized.contains("left_boot") || normalized.contains("leftleg") || normalized.contains("left_leg")) {
                return LEFT_LEG;
            }
            if (normalized.contains("rightboot") || normalized.contains("right_boot") || normalized.contains("rightleg") || normalized.contains("right_leg")) {
                return RIGHT_LEG;
            }
            return null;
        }

        private boolean containsExpanded(Vector3f point, float padding) {
            return point.x() >= this.minX - padding && point.x() <= this.maxX + padding
                    && point.y() >= this.minY - padding && point.y() <= this.maxY + padding
                    && point.z() >= this.minZ - padding && point.z() <= this.maxZ + padding;
        }

        private Vector3f center() {
            return new Vector3f(
                    this.minX + (this.maxX - this.minX) * 0.5F,
                    this.minY + (this.maxY - this.minY) * 0.5F,
                    this.minZ + (this.maxZ - this.minZ) * 0.5F
            );
        }
    }
}
