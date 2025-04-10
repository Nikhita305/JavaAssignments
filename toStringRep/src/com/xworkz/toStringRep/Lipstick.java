package com.xworkz.toStringRep;

public class Lipstick {
    private String brand;
    private String shade;
    private double price;

    public Lipstick(String brand, String shade, double price) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
        System.out.println("Lipstick Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Shade: " + this.shade + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 18;
    }
}
