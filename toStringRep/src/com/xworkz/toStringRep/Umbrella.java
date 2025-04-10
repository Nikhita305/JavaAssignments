package com.xworkz.toStringRep;

public class Umbrella {
    private String color;
    private String size;
    private double price;

    public Umbrella(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
        System.out.println("Umbrella Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Size: " + this.size + ", Price: ₹" + this.price;
    }

    public int hashCode() {
        return 81;
    }
}
