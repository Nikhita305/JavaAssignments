package com.inheritance;

public class Jeep {
    public void start(Vehicle vehicle) {
        vehicle.fuelUp();
        vehicle.honk();
        vehicle.move();
        vehicle.service();
        vehicle.stop();

        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.speed();
        }
    }
}
