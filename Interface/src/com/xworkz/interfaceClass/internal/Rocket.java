package com.xworkz.interfaceClass.internal;

public interface Rocket {
    void launch();
    void navigate();
    void land();

    default void checkStatus() {
        System.out.println("Running checkStatus in Rocket");
    }
}
