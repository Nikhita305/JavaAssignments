package com.inheritance;

public class Economist {
    public void analyze(Currency currency) {
        currency.name();
        currency.symbol();
        currency.country();
        currency.value();
        currency.usage();

        if (currency instanceof Rupee) {
            Rupee rupee = (Rupee) currency;
            rupee.denominations();
        }
    }
}
