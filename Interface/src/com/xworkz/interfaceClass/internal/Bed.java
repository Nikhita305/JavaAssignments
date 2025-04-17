package com.xworkz.interfaceClass.internal;

public interface Bed {
    void layDown();
    void make();
    void sleep();

    default void relax() {
        System.out.println("Relaxing on the bed");
    }
}
