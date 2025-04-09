package com.xworkz.toStringRep;

public class Zudio {
    private String productType;
    private String size;
    private double price;

    public Zudio(String productType, String size, double price) {
        this.productType = productType;
        this.size = size;
        this.price = price;
        System.out.println("Zudio Constructor");
    }

    @Override
    public String toString() {
        return "Product: " + this.productType + ", Size: " + this.size + ", Price: ₹" + this.price;
    }
}
