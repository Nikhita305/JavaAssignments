package com.xworkz.interfaceClass.internal;

public interface Rice {
    void cook();
    void store();
    void harvest();

    default void soak() {
        System.out.println("Soaking the rice before cooking");
    }
}
