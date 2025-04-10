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

    public int hashCode() {
        return 79;
    }
}
