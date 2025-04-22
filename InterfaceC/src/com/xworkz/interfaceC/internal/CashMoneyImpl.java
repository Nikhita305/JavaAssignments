package com.xworkz.interfaceC.internal;

public class CashMoneyImpl implements Money {
    public CashMoneyImpl() {
        super();
        System.out.println("no-arg constr in CashMoneyImpl");
    }

    @Override
    public void spend() {
        System.out.println("Spend in CashMoneyImpl");
    }
}

