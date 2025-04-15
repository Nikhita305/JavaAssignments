package com.xworkz.inheritanceTypes.multiLevel;

public class Earth extends RockyPlanet {
    private boolean supportsLife;

    public Earth(String name, boolean hasAtmosphere, boolean supportsLife) {
        super(name, hasAtmosphere);
        this.supportsLife = supportsLife;
    }

    public boolean supportsLife() {
        return supportsLife;
    }
}
