package com.xworkz.inheritanceTypes.multiLevel;

public class RockyPlanet extends Planet {
    private boolean hasAtmosphere;

    public RockyPlanet(String name, boolean hasAtmosphere) {
        super(name);
        this.hasAtmosphere = hasAtmosphere;
    }

    public boolean hasAtmosphere() {
        return hasAtmosphere;
    }
}
