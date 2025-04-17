package com.xworkz.interfaceClass.internal;

public interface Anklet {
    void wear();
    void makeSound();
    void remove();

    default void clean() {
        System.out.println("Running clean in Anklet");
    }
}
