package com.xworkz.interfaceC.internal;

public class BankImp implements Bank {
    public BankImp() {
        super();
        System.out.println("no-arg constr in BankImp");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit in BankImp");
    }
}

