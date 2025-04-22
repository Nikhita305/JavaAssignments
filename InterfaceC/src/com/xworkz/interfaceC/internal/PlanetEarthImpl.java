package com.xworkz.interfaceC.internal;

public class PlanetEarthImpl implements Earth {
    public PlanetEarthImpl() {
        super();
        System.out.println("no-arg constr in PlanetEarthImpl");
    }

    @Override
    public void rotate() {
        System.out.println("Earth is rotating in PlanetEarthImpl");
    }
}

