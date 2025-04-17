package com.xworkz.interfaceClass.internal;

public interface Pilot {
    void takeOff();
    void fly();
    void land();

    default void communicate() {
        System.out.println("Communicating with Air Traffic Control from Pilot interface");
    }
}
