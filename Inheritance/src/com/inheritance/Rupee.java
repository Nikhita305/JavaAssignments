package com.inheritance;

public class Rupee extends Currency {
    public Rupee() {
        System.out.println("Running no-arg constructor of Rupee");
    }

    @Override
    public void name() {
        System.out.println("Rupee is the currency of India");
    }

    @Override
    public void symbol() {
        System.out.println("Symbol of Rupee is ₹");
    }

    @Override
    public void country() {
        System.out.println("Rupee is used in India and some neighboring countries");
    }

    @Override
    public void value() {
        System.out.println("1 Rupee = 100 paise");
    }

    @Override
    public void usage() {
        System.out.println("Rupee is used for all financial transactions in India");
    }

    public void denominations() {
        System.out.println("Rupee has denominations like ₹1, ₹2, ₹5, ₹10, ₹20, ₹50, ₹100, ₹500, ₹2000");
    }
}
