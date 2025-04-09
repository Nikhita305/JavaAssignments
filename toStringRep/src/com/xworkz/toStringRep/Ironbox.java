package com.xworkz.toStringRep;

public class Ironbox {
    private String brand;
    private double weight;
    private double price;

    public Ironbox(String brand, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        System.out.println("IronBox Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Weight: " + this.weight + " kg, Price: ₹" + this.price;
    }
}
