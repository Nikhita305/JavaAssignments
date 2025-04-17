package com.xworkz.interfaceClass.internal;

public interface Tree {
    void grow();
    void provideShade();
    void shedLeaves();

    default void bloom() {
        System.out.println("The tree blooms with beautiful flowers in spring");
    }
}
