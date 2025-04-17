package com.xworkz.interfaceClass.internal;

public interface Ice {
    void freeze();
    void store();
    void melt();

    default void chill() {
        System.out.println("Running chill in Ice");
    }
}
