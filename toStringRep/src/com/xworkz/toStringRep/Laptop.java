package com.xworkz.toStringRep;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        System.out.println("Laptop Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", RAM: " + this.ram + "GB, Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 4;
    }
}
