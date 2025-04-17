package com.xworkz.interfaceClass.internal;

public interface Frame {
    void design();
    void assemble();
    void display();

    default void clean() {
        System.out.println("Cleaning the frame");
    }
}
