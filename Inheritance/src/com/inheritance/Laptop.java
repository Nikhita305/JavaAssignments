package com.inheritance;

public class Laptop extends Device {
    public Laptop() {
        System.out.println("Running no-arg constructor of Laptop");
    }

    @Override
    public void start() {
        System.out.println("Laptop is booting up with operating system");
    }

    @Override
    public void shutDown() {
        System.out.println("Laptop is shutting down safely");
    }

    @Override
    public void charge() {
        System.out.println("Laptop is plugged in and charging");
    }

    @Override
    public void performTask() {
        System.out.println("Laptop is running multiple applications");
    }

    @Override
    public void update() {
        System.out.println("Laptop is installing OS and driver updates");
    }
}
