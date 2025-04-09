package com.xworkz.toStringRep;

public class Skirt {
    private String brand;
    private String length;
    private String color;

    public Skirt(String brand, String length, String color) {
        this.brand = brand;
        this.length = length;
        this.color = color;
        System.out.println("Skirt Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Length: " + this.length + ", Color: " + this.color;
    }
}
