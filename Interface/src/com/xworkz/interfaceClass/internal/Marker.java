package com.xworkz.interfaceClass.internal;

public interface Marker {
    void write();
    void erase();
    void refill();

    default void checkInkLevel() {
        System.out.println("Checking the ink level of the marker");
    }
}
