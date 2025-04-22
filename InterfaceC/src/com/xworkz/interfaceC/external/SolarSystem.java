package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Planet;

public class SolarSystem {
    private Planet planet;

    public SolarSystem(Planet planet) {
        this.planet = planet;
        System.out.println("constr in SolarSystem");
    }

    public void spinPlanet() {
        if (this.planet != null) {
            System.out.println("not null");
            this.planet.rotate();
        } else {
            System.out.println("null");
        }
    }
}

