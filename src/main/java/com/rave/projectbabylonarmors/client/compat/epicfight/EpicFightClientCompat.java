package com.rave.projectbabylonarmors.client.compat.epicfight;

import com.rave.projectbabylonarmors.ProjectBabylonArmors;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorAutoRegistry;
import com.rave.projectbabylonarmors.client.geo.renderer.PBAGeoArmorSetDefinition;

import yesman.epicfight.api.client.model.transformer.HumanoidModelTransformer;
import yesman.epicfight.api.client.model.transformer.HumanoidModelBaker;

public final class EpicFightClientCompat {
    private EpicFightClientCompat() {
    }

    public static void register() {
        for (PBAGeoArmorSetDefinition definition : PBAGeoArmorAutoRegistry.getDefinitions()) {
            String transformerClassName = definition.getEpicFightTransformerClassName();
            if (transformerClassName == null || transformerClassName.isBlank()) {
                continue;
            }

            try {
                Class<?> transformerClass = Class.forName(transformerClassName);
                Object transformerInstance = transformerClass.getDeclaredConstructor().newInstance();
                if (transformerInstance instanceof HumanoidModelTransformer transformer) {
                    HumanoidModelBaker.registerNewTransformer(transformer);
                } else {
                    ProjectBabylonArmors.LOGGER.warn("Skipped Epic Fight transformer {} because it does not implement HumanoidModelTransformer.", transformerClassName);
                }
            } catch (ReflectiveOperationException exception) {
                ProjectBabylonArmors.LOGGER.error("Failed to register Epic Fight transformer {}.", transformerClassName, exception);
            }
        }
    }
}
