package com.xworkz.toStringRep;

public class Cream {
    private String brand;
    private String purpose;
    private double price;

    public Cream(String brand, String purpose, double price) {
        this.brand = brand;
        this.purpose = purpose;
        this.price = price;
        System.out.println("Cream Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Purpose: " + this.purpose + ", Price: ₹" + this.price;
    }
}
