package com.xworkz.interfaceClass.internal;

public interface Zudio {
    void design();
    void display();
    void discount();

    default void offerSeasonalSale() {
        System.out.println("Offering seasonal sale in the store");
    }
}
