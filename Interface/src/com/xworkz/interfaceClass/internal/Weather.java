package com.xworkz.interfaceClass.internal;

public interface Weather {
    void change();
    void forecast();
    void stabilize();

    default void warn() {
        System.out.println("Warning about extreme weather conditions");
    }
}
