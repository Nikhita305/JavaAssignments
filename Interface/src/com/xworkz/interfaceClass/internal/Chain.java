package com.xworkz.interfaceClass.internal;

public interface Chain {
    void wear();
    void polish();
    void remove();

    default void shine() {
        System.out.println("Running shine in Chain");
    }
}
