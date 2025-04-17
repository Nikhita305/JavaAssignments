package com.xworkz.interfaceClass.internal;

public interface Oreo {
    void open();
    void eat();
    void share();

    default void enjoy() {
        System.out.println("Running enjoy in Oreo");
    }
}
