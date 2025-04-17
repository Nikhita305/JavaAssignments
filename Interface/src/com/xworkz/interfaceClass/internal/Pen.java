package com.xworkz.interfaceClass.internal;

public interface Pen {
    void write();
    void open();
    void close();

    default void checkInk() {
        System.out.println("Checking ink level in the pen");
    }
}
