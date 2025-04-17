package com.xworkz.interfaceClass.internal;

public interface Lays {
    void open();
    void eat();
    void share();

    default void displayFlavor() {
        System.out.println("This is a default flavor of Lays.");
    }
}
