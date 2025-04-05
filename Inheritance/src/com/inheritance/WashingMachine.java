package com.inheritance;

public class WashingMachine extends Appliance {

    public WashingMachine() {
        System.out.println("Running no-arg constructor of WashingMachine");
    }

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in Appliance");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in Appliance");
    }

    @Override
    public void setTimer() {
        System.out.println("Running setTimer in Appliance");
    }

    @Override
    public void consumePower() {
        System.out.println("Running consumePower in Appliance");
    }

    @Override
    public void showStatus() {
        System.out.println("Running showStatus in Appliance");
    }
}
