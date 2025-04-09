package com.xworkz.toStringRep;

public class Shampoo {
    private String brand;
    private String type;
    private double volume;

    public Shampoo(String brand, String type, double volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
        System.out.println("Shampoo Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Volume: " + this.volume + " ml";
    }
}
