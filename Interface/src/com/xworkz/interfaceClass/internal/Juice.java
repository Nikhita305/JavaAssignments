package com.xworkz.interfaceClass.internal;

public interface Juice {
    void squeeze();
    void mix();
    void serve();

    default void chill() {
        System.out.println("Running chill in Juice");
    }
}
