package com.xworkz.inheritanceTypes.multiLevel;

public class InterestAccount extends SavingAccount {
    private double interestRate;

    public InterestAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
