package com.xworkz.interfaceClass.internal;

public interface Money {
    void earn();
    void save();
    void spend();

    default void invest() {
        System.out.println("Running invest in Money");
    }
}
