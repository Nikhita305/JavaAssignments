package com.xworkz.toStringRep;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Shoe Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color;
    }
}
