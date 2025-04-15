package com.xworkz.inheritanceTypes.multiLevel;

public class Martian extends Alien {
    private String planet;

    public Martian(String species, String planet) {
        super(species);
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }
}
