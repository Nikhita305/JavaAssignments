package com.xworkz.interfaceClass.internal;

public interface TShirt {
    void wear();
    void wash();
    void fold();

    default void iron() {
        System.out.println("Ironing the T-shirt");
    }
}
