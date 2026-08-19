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
        NetheriteWarriorGeoRenderers.register();
        NetheriteMageGeoRenderers.register();
        NetheriteRogueGeoRenderers.register();
        NetheriteTankGeoRenderers.register();
        IceWarriorGeoRenderers.register();
        IceMageGeoRenderers.register();
        IceRogueGeoRenderers.register();
        IceTankGeoRenderers.register();
        EtherealWarriorGeoRenderers.register();
        EtherealMageGeoRenderers.register();
        EtherealRogueGeoRenderers.register();
        EtherealTankGeoRenderers.register();
        DragonsteelWarriorGeoRenderers.register();
        DragonsteelMageGeoRenderers.register();
        DragonsteelRogueGeoRenderers.register();
        DragonsteelTankGeoRenderers.register();
        registered = true;
    }
}
