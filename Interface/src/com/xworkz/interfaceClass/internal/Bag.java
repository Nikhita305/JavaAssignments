package com.xworkz.interfaceClass.internal;

public interface Bag {
    void pack();
    void carry();
    void unpack();

    default void clean() {
        System.out.println("Running clean in Bag");
    }
}
