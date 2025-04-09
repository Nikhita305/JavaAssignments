package com.xworkz.toStringRep;

public class Pizza {
    private String flavor;
    private String size;
    private double price;

    public Pizza(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        System.out.println("Pizza Constructor");
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Size: " + this.size + ", Price: ₹" + this.price;
    }
}
