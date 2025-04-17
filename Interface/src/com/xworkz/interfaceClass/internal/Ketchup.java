package com.xworkz.interfaceClass.internal;

public interface Ketchup {
    void squeeze();
    void dip();
    void store();

    default void shake() {
        System.out.println("Shaking the ketchup bottle before use");
    }
}
