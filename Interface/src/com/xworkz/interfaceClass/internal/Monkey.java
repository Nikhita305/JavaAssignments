package com.xworkz.interfaceClass.internal;

public interface Monkey {
    void climb();
    void swing();
    void eatBanana();

    default void play() {
        System.out.println("Running play in Monkey");
    }
}
