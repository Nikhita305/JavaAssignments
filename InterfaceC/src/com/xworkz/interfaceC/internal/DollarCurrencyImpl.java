package com.xworkz.interfaceC.internal;

public class DollarCurrencyImpl implements Currency {
    public DollarCurrencyImpl() {
        super();
        System.out.println("no-arg constr in DollarCurrencyImpl");
    }

    @Override
    public void exchange() {
        System.out.println("Exchange in DollarCurrencyImpl");
    }
}

