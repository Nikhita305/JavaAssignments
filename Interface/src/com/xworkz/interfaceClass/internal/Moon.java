package com.xworkz.interfaceClass.internal;

public interface Moon {
    void rise();
    void shine();
    void set();

    default void reflect() {
        System.out.println("Moon is reflecting sunlight");
    }
}
