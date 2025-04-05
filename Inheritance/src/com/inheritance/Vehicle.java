package com.inheritance;

public class Vehicle {
    public Vehicle() {
        System.out.println("Running no-arg constructor of Vehicle");
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void fuelUp() {
        System.out.println("Fueling the vehicle");
    }

    public void honk() {
        System.out.println("Vehicle is honking");
    }

    public void service() {
        System.out.println("Servicing the vehicle");
    }
}
