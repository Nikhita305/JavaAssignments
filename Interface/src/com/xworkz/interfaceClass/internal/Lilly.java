package com.xworkz.interfaceClass.internal;

public interface Lilly {
    void bloom();
    void fragrance();
    void wilt();

    default void water() {
        System.out.println("Watering the Lilly flower");
    }
}
