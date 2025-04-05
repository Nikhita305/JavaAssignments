package com.inheritance;

public class Car extends Vehicle {
    public Car() {
        System.out.println("Running no-arg constructor of Car");
    }

    @Override
    public void move() {
        System.out.println("Car is driving smoothly");
    }

    @Override
    public void stop() {
        System.out.println("Car is braking");
    }

    @Override
    public void fuelUp() {
        System.out.println("Car is being refueled with petrol");
    }

    @Override
    public void honk() {
        System.out.println("Car horn goes beep beep");
    }

    @Override
    public void service() {
        System.out.println("Car is in service center");
    }
}
