package com.xworkz.interfaceClass.internal;

public interface Grapes {
    void harvest();
    void pack();
    void sell();

    default void wash() {
        System.out.println("Running wash in Grapes");
    }
}
