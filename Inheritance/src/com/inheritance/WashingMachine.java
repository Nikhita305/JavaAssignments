package com.inheritance;

public class WashingMachine extends Appliance {

    public WashingMachine() {
        System.out.println("Running no-arg constructor of WashingMachine");
    }

    @Override
    public void turnOn() {
        System.out.println("Running turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOf");
    }

    @Override
    public void setTimer() {
        System.out.println("Running setTimer");
    }

    @Override
    public void consumePower() {
        System.out.println("Running consumePower");
    }

    @Override
    public void showStatus() {
        System.out.println("Running showStatus");
    }

    public void loadClothes(){
        System.out.println("Running loadClothes");
    }
}
