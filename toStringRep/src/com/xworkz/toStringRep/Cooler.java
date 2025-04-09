package com.xworkz.toStringRep;

public class Cooler {
    private String brand;
    private String type;
    private double price;

    public Cooler(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Cooler Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }
}
