package com.xworkz.interfaceClass.internal;

public interface Tower {
    void build();
    void lightUp();
    void maintain();

    default void attractVisitors() {
        System.out.println("Attracting visitors to the tower");
    }
}
