package com.xworkz.interfaceClass.internal;

public interface Key {
    void insert();
    void turn();
    void remove();

    default void keyInfo() {
        System.out.println("Running keyInfo in Key");
    }
}
