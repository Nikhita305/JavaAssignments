package com.xworkz.interfaceClass.internal;

public interface Fan {
    void turnOn();
    void adjustSpeed();
    void turnOff();

    default void oscillate() {
        System.out.println("Running oscillate in Fan");
    }
}
