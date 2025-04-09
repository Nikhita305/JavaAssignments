package com.xworkz.toStringRep;

public class Currency {
    private String country;
    private String name;
    private double value;

    public Currency(String country, String name, double value) {
        this.country = country;
        this.name = name;
        this.value = value;
        System.out.println("Currency Constructor");
    }

    @Override
    public String toString() {
        return "Country: " + this.country + ", Name: " + this.name + ", Value: ₹" + this.value;
    }
}
