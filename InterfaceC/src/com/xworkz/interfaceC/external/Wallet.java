package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Money;

public class Wallet {
    private Money money;

    public Wallet(Money money) {
        this.money = money;
        System.out.println("constr in Wallet");
    }

    public void useMoney() {
        if (this.money != null) {
            System.out.println("not null");
            this.money.spend();
        } else {
            System.out.println("null");
        }
    }
}

