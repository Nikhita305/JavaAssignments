package com.xworkz.interfaceClass.internal;

public interface Button {
    void press();
    void release();
    void glow();

    default void reset() {
        System.out.println("Resetting the button state");
    }
}
