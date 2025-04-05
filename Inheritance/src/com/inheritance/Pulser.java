package com.inheritance;

public class Pulser extends Bike {
    public Pulser() {
        System.out.println("Running no-arg constructor of Pulser");
    }

    @Override
    public void brand() {
        System.out.println("Pulser is a brand from Bajaj");
    }

    @Override
    public void speed() {
        System.out.println("Pulser bikes can go up to 130+ km/h");
    }

    @Override
    public void fuelType() {
        System.out.println("Pulser runs on petrol");
    }

    @Override
    public void gearSystem() {
        System.out.println("Pulser has a 5/6-speed manual gearbox");
    }

    @Override
    public void mileage() {
        System.out.println("Pulser gives around 45-50 km/l");
    }
}
