package com.xworkz.interfaceClass.internal;

public interface Bird {
    void fly();
    void sing();
    void buildNest();

    default void migrate() {
        System.out.println("The bird is migrating to warmer climates");
    }
}
