package com.rave.projectbabylonarmors.client.geo.renderer;

public final class PBAGeoArmorSets {
    private static boolean registered;

    private PBAGeoArmorSets() {
    }

    public static synchronized void registerAll() {
        if (registered) {
            return;
        }

        IronWarriorGeoRenderers.register();
        IronMageGeoRenderers.register();
        IronRogueGeoRenderers.register();
        IronTankGeoRenderers.register();
        DiamondWarriorGeoRenderers.register();
        DiamondMageGeoRenderers.register();
        DiamondRogueGeoRenderers.register();
        DiamondTankGeoRenderers.register();
        GoldenWarriorGeoRenderers.register();
        GoldenMageGeoRenderers.register();
        GoldenRogueGeoRenderers.register();
        GoldenTankGeoRenderers.register();
        registered = true;
    }
}
