package com.xworkz.interfaceClass.internal;

public interface Noodles {
    void boil();
    void season();
    void serve();

    default void cook() {
        System.out.println("Cooking the noodles in the kitchen");
    }
}
