package com.xworkz.interfaceClass.internal;

public interface Thief {
    void steal();
    void escape();
    void hide();

    default void plan() {
        System.out.println("Running plan in Thief");
    }
}
