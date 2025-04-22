package com.xworkz.interfaceC.internal;

public class TeslaImpl implements AutonomousCar {
    public TeslaImpl() {
        super();
        System.out.println("no-arg constr in TeslaImpl");
    }

    @Override
    public void drive() {
        System.out.println("Driving autonomously in TeslaImpl");
    }
}

