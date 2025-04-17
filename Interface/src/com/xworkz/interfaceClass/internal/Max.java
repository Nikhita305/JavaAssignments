package com.xworkz.interfaceClass.internal;

public interface Max {
    void calculate();
    void display();
    void reset();

    default void log() {
        System.out.println("Logging the maximum value operation");
    }
}
