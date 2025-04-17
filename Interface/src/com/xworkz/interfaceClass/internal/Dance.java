package com.xworkz.interfaceClass.internal;

public interface Dance {
    void perform();
    void practice();
    void choreograph();

    default void warmUp() {
        System.out.println("Warming up before the dance performance");
    }
}
