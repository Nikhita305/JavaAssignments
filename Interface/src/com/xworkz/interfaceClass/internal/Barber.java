package com.xworkz.interfaceClass.internal;

public interface Barber {
    void cutHair();
    void shave();
    void trimBeard();

    default void sanitize() {
        System.out.println("Running sanitize in Barber");
    }
}
