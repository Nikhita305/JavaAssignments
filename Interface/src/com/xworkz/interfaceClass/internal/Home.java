package com.xworkz.interfaceClass.internal;

public interface Home {
    void clean();
    void cook();
    void organize();

    default void maintain() {
        System.out.println("Running maintain in Home");
    }
}
