package com.xworkz.interfaceClass.internal;

public interface Star {
    void shine();
    void twinkle();
    void disappear();

    default void glow() {
        System.out.println("The star is glowing faintly");
    }
}
