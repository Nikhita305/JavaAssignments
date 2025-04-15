package com.xworkz.inheritanceTypes.multiLevel;

public class GreenMartian extends Martian {
    private int strength;

    public GreenMartian(String species, String planet, int strength) {
        super(species, planet);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
