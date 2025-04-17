package com.xworkz.interfaceClass.internal;

public interface Wheel {
    void rotate();
    void inflate();
    void repair();

    default void balance() {
        System.out.println("Balancing the wheel");
    }
}
