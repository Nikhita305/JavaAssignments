package com.xworkz.interfaceClass.internal;

public interface Jalebi {
    void fry();
    void soak();
    void serve();

    default void garnish() {
        System.out.println("Running garnish in Jalebi");
    }
}
