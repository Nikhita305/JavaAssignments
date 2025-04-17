package com.xworkz.interfaceClass.internal;

public interface Burger {
    void prepare();
    void serve();
    void eat();

    default void cook() {
        System.out.println("Running cook in Burger");
    }
}
