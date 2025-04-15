package com.xworkz.abstractClasses;

public abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("vehicle stopped");
    }
}
