package com.xworkz.interfaceClass.internal;

public interface Bangle {
    void wear();
    void shine();
    void remove();

    default void polish() {
        System.out.println("Polishing the bangle");
    }
}
