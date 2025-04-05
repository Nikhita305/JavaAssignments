package com.inheritance;

public class Company {
    public Company() {
        System.out.println("Running no-arg constructor of Company");
    }

    public void register() {
        System.out.println("Company is registered under government law");
    }

    public void hire() {
        System.out.println("Company hires employees");
    }

    public void operate() {
        System.out.println("Company performs daily operations");
    }

    public void grow() {
        System.out.println("Company expands its business");
    }

    public void payTaxes() {
        System.out.println("Company pays corporate taxes");
    }
}
