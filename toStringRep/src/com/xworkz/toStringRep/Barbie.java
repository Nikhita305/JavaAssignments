package com.xworkz.toStringRep;

public class Barbie {
    private String outfit;
    private String hairColor;
    private double price;

    public Barbie(String outfit, String hairColor, double price) {
        this.outfit = outfit;
        this.hairColor = hairColor;
        this.price = price;
        System.out.println("Barbie Constructor");
    }

    @Override
    public String toString() {
        return "Outfit: " + this.outfit + ", Hair Color: " + this.hairColor + ", Price: ₹" + this.price;
    }

    public int hashCode() {
        return 96;
    }
}
