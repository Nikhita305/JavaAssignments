package com.xworkz.interfaceClass.internal;

public interface Lipstick {
    void apply();
    void remove();
    void checkColor();

    default void checkQuality() {
        System.out.println("Checking the quality of the lipstick");
    }
}
