package com.xworkz.toStringRep;

public class Tubelight {
    private String brand;
    private int length;
    private int wattage;

    public Tubelight(String brand, int length, int wattage) {
        this.brand = brand;
        this.length = length;
        this.wattage = wattage;
        System.out.println("Tubelight Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Length: " + this.length + " inches, Wattage: " + this.wattage + "W";
    }
}
