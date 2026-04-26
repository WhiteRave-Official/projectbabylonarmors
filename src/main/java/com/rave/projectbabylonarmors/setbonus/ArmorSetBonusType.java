package com.rave.projectbabylonarmors.setbonus;

public enum ArmorSetBonusType {
    MATERIAL("Material Passive"),
    CLASS("Class Passive");

    private final String title;

    ArmorSetBonusType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
