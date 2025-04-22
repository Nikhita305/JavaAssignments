package com.xworkz.interfaceC.internal;

public class ShoppingMallImpl implements Mall {
    public ShoppingMallImpl() {
        super();
        System.out.println("no-arg constr in ShoppingMallImpl");
    }

    @Override
    public void openStore() {
        System.out.println("Opening store in ShoppingMallImpl");
    }
}

