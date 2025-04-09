package com.xworkz.toStringRep;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Watch Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }
}
