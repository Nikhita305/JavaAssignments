package com.xworkz.interfaceClass.internal;

public interface Rainbow {
    void appear();
    void shine();
    void fade();

    default void admire() {
        System.out.println("Running admire in Rainbow");
    }
}
