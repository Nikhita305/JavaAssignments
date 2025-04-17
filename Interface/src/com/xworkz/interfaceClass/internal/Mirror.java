package com.xworkz.interfaceClass.internal;

public interface Mirror {
    void reflect();
    void clean();
    void frame();

    default void shine() {
        System.out.println("The mirror shines brightly");
    }
}
