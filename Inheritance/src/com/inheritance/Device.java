package com.inheritance;

public class Device {
    public Device() {
        System.out.println("Running no-arg constructor of Device");
    }

    public void start() {
        System.out.println("Device is starting");
    }

    public void shutDown() {
        System.out.println("Device is shutting down");
    }

    public void charge() {
        System.out.println("Device is charging");
    }

    public void performTask() {
        System.out.println("Device is performing a task");
    }

    public void update() {
        System.out.println("Device is updating software");
    }
}
