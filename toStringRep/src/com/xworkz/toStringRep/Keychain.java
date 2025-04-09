package com.xworkz.toStringRep;

public class Keychain {
    private String material;
    private String shape;
    private double price;

    public Keychain(String material, String shape, double price) {
        this.material = material;
        this.shape = shape;
        this.price = price;
        System.out.println("Keychain Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Shape: " + this.shape + ", Price: ₹" + this.price;
    }
}
