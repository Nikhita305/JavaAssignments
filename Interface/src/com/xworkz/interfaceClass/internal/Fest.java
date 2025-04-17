package com.xworkz.interfaceClass.internal;

public interface Fest {
    void organize();
    void promote();
    void celebrate();

    default void event() {
        System.out.println("Running event in Fest");
    }
}
