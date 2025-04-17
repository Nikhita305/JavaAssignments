package com.xworkz.interfaceClass.internal;

public interface Shark {
    void swim();
    void hunt();
    void rest();

    default void breach() {
        System.out.println("The shark breaches out of the water");
    }
}
