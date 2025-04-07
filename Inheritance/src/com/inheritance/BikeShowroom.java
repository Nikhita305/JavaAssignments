package com.inheritance;

public class BikeShowroom {
    public void display(Bike bike) {
        bike.brand();
        bike.speed();
        bike.fuelType();
        bike.gearSystem();
        bike.mileage();

        if (bike instanceof Pulser) {
            Pulser pulser = (Pulser) bike;
            pulser.price();
        }
    }
}
