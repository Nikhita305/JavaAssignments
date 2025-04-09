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
}
