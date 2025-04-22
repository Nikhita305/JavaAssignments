package com.xworkz.interfaceC.internal;


public class MilkChocolateImpl implements Chocolate {

    public MilkChocolateImpl() {
        System.out.println("No-arg constructor in MilkChocolateImpl");
    }

    @Override
    public void taste() {
        System.out.println("Milk Chocolate tastes creamy and sweet.");
    }
}
