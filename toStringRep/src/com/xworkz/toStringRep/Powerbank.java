package com.xworkz.toStringRep;

public class Powerbank {
    private String brand;
    private int capacity;
    private double price;

    public Powerbank(String brand, int capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
        System.out.println("Powerbank Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Capacity: " + this.capacity + "mAh, Price: ₹" + this.price;
    }
}
