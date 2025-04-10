package com.xworkz.toStringRep;

public class Keyboard {
    private String brand;
    private String type;
    private double price;

    public Keyboard(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Keyboard Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }

    public int hashCode() {
        return 57;
    }
}
