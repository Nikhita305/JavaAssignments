package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.AutonomousCar;

public class TeslaDriver {
    private AutonomousCar car;

    public TeslaDriver(AutonomousCar car) {
        this.car = car;
        System.out.println("constr in Driver");
    }

    public void startJourney() {
        if (this.car != null) {
            System.out.println("not null");
            this.car.drive();
        } else {
            System.out.println("null");
        }
    }
}
