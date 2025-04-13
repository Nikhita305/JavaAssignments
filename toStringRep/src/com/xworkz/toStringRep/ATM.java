package com.xworkz.toStringRep;

public class ATM {
    private String bankName;
    private String location;
    private double balance;

    public ATM(String bankName, String location, double balance) {
        this.bankName = bankName;
        this.location = location;
        this.balance = balance;
        System.out.println("ATM Constructor");
    }

    @Override
    public String toString() {
        return "Bank: " + this.bankName + ", Location: " + this.location + ", Balance: ₹" + this.balance;
    }

    @Override
    public int hashCode() {
        return 79;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof ATM) {
                System.out.println("Ref is ATM, compare");
                ATM atm1 = this;
                ATM atm2 = (ATM) obj;
                if (atm1.bankName.equals(atm2.bankName)
                        && atm1.location.equals(atm2.location)
                        && atm1.balance == atm2.balance) {
                    System.out.println("Both ATM objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
