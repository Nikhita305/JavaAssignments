package com.xworkz.interfaceClass.internal;

public interface Lens {
    void focus();
    void zoom();
    void clean();

    default void adjust() {
        System.out.println("Adjusting the camera lens for better clarity");
    }
}
