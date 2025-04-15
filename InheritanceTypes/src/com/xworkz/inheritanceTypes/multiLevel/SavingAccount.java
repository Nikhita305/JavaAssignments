package com.xworkz.inheritanceTypes.multiLevel;

public class SavingAccount extends Account {
    private double balance;

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber);
    }

    public double getBalance() {
        return balance;
    }
}
