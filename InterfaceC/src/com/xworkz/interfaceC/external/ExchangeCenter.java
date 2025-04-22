package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Currency;

public class ExchangeCenter {
    private Currency currency;

    public ExchangeCenter(Currency currency) {
        this.currency = currency;
        System.out.println("constr in ExchangeCenter");
    }

    public void performExchange() {
        if (this.currency != null) {
            System.out.println("not null");
            this.currency.exchange();
        } else {
            System.out.println("null");
        }
    }
}

