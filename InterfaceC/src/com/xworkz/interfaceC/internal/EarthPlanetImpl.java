package com.xworkz.interfaceC.internal;

public class EarthPlanetImpl implements Planet {
    public EarthPlanetImpl() {
        super();
        System.out.println("no-arg constr in EarthPlanetImpl");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate in EarthPlanetImpl");
    }
}

