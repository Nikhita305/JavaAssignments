package com.xworkz.interfaceClass.internal;

public interface Sticker {
    void stick();
    void peel();
    void design();

    default void showSticker() {
        System.out.println("Showing the sticker");
    }
}
