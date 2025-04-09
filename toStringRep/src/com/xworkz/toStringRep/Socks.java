package com.xworkz.toStringRep;

public class Socks {
    private String brand;
    private String size;
    private String color;

    public Socks(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Socks Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color;
    }
}
