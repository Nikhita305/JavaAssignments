package com.xworkz.toStringRep;

public class Bank {
    private String name;
    private String branch;
    private String ifsc;

    public Bank(String name, String branch, String ifsc) {
        this.name = name;
        this.branch = branch;
        this.ifsc = ifsc;
        System.out.println("Bank Constructor");
    }

    @Override
    public String toString() {
        return "Bank Name: " + this.name + ", Branch: " + this.branch + ", IFSC: " + this.ifsc;
    }

    @Override
    public int hashCode() {
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bank) {
                System.out.println("Ref,compare");
                Bank bank = this;
                Bank bank1 = (Bank) obj;
                if (bank.ifsc.equals(bank.ifsc) && bank.branch.equals(bank1.branch)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }



}
