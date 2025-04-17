package com.xworkz.interfaceClass.internal;

public interface Mall {
    void open();
    void close();
    void offerDeals();

    default void offerLoyaltyProgram() {
        System.out.println("Offering a loyalty program to regular customers");
    }
}
