package com.xworkz.interfaceClass.internal;

public interface Barbie {
    void dressUp();
    void play();
    void collect();

    default void display() {
        System.out.println("Displaying the Barbie doll collection");
    }
}
