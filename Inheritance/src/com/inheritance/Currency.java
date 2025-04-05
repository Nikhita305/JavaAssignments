package com.inheritance;

public class Currency {
    public Currency() {
        System.out.println("Running no-arg constructor of Currency");
    }

    public void name() {
        System.out.println("This is a form of currency");
    }

    public void symbol() {
        System.out.println("Currencies have different symbols");
    }

    public void country() {
        System.out.println("Each currency belongs to a specific country");
    }

    public void value() {
        System.out.println("Currency values fluctuate over time");
    }

    public void usage() {
        System.out.println("Used in daily transactions and trade");
    }
}
