package com.xworkz.interfaceClass.internal;

public interface Hill {
    void climb();
    void enjoyView();
    void descend();

    default void rest() {
        System.out.println("Taking a short rest on the hill");
    }
}
