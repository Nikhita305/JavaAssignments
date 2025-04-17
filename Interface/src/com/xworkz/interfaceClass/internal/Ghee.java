package com.xworkz.interfaceClass.internal;

public interface Ghee {
    void melt();
    void useInCooking();
    void store();

    default void purify() {
        System.out.println("Purifying ghee in traditional way");
    }
}
