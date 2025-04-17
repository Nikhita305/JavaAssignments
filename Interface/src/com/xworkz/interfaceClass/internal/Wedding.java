package com.xworkz.interfaceClass.internal;

public interface Wedding {
    void plan();
    void celebrate();
    void remember();

    default void enjoy() {
        System.out.println("Running enjoy in Wedding");
    }
}
