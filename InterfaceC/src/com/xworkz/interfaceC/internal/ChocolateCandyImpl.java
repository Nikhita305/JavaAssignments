package com.xworkz.interfaceC.internal;

public class ChocolateCandyImpl implements Candy {
    public ChocolateCandyImpl() {
        super();
        System.out.println("no-arg constr in ChocolateCandyImpl");
    }

    @Override
    public void eat() {
        System.out.println("Eating ChocolateCandyImpl");
    }
}

