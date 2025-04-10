package com.xworkz.toStringRep;

public class Crackers {
    private String type;
    private String brand;
    private double price;

    public Crackers(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        System.out.println("Crackers Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Brand: " + this.brand + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
