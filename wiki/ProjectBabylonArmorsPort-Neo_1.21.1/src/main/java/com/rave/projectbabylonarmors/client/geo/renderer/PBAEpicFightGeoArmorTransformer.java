package com.rave.projectbabylonarmors.client.geo.renderer;

public class PBAEpicFightGeoArmorTransformer extends PBAGeoEpicFightArmorTransformer {
    public PBAEpicFightGeoArmorTransformer() {
        super(PBAGeoArmorRenderer.class::isInstance);
    }
}
