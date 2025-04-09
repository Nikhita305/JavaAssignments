package com.xworkz.toStringRep;

public class Projector {
    private String brand;
    private String type;
    private double price;

    public Projector(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Projector Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }
}
