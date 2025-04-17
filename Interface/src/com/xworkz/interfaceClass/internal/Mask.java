package com.xworkz.interfaceClass.internal;

public interface Mask {
    void wear();
    void remove();
    void clean();

    default void adjust() {
        System.out.println("Adjusting the mask for a better fit");
    }
}
