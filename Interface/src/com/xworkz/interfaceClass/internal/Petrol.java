package com.xworkz.interfaceClass.internal;

public interface Petrol {
    void fuelEngine();
    void checkLevel();
    void refill();

    default void cleanTank() {
        System.out.println("Cleaning the petrol tank");
    }
}
