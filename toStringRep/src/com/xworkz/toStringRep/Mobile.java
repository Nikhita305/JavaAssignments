package com.xworkz.toStringRep;

public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Mobile Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 5;
    }
}
