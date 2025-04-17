package com.xworkz.interfaceClass.internal;

public interface Color {
    void mix();
    void apply();
    void fade();

    default void treatment() {
        System.out.println("Running color treatment in Color");
    }
}
