package com.xworkz.interfaceClass.internal;

public interface Shampoo {
    void apply();
    void lather();
    void rinse();

    default void fragrance() {
        System.out.println("Shampoo has a pleasant fragrance");
    }
}
