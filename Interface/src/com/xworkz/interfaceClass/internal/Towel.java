package com.xworkz.interfaceClass.internal;

public interface Towel {
    void dry();
    void fold();
    void wash();

    default void hang() {
        System.out.println("Hanging the towel to dry");
    }
}
