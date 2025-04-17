package com.xworkz.interfaceClass.internal;

public interface Candy {
    void make();
    void wrap();
    void distribute();

    default void decorate() {
        System.out.println("Running decorate in Candy");
    }
}
