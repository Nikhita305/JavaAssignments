package com.xworkz.interfaceClass.internal;

public interface Bubble {
    void create();
    void pop();
    void floatInAir();

    default void makeSound() {
        System.out.println("Bubble makes a popping sound");
    }
}
