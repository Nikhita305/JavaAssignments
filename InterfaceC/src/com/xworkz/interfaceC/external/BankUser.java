package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Bank;

public class BankUser {
    private Bank bank;

    public BankUser(Bank bank) {
        this.bank = bank;
        System.out.println("constr in BankUser");
    }

    public void execute() {
        if (this.bank != null) {
            System.out.println("not null");
            this.bank.deposit();
        } else {
            System.out.println("null");
        }
    }
}

