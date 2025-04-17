package com.xworkz.interfaceClass.internal;

public interface Lassi {
    void mix();
    void serve();
    void drink();

    default void garnish() {
        System.out.println("Running garnish in Lassi");
    }
}
