package com.xworkz.interfaceClass.internal;

public interface Water {
    void flow();
    void purify();
    void store();

    default void filter() {
        System.out.println("Filtering the water");
    }
}
