package com.xworkz.toStringRep;

public class BathTub {
    private String shape;
    private String material;
    private double length;

    public BathTub(String shape, String material, double length) {
        this.shape = shape;
        this.material = material;
        this.length = length;
        System.out.println("BathTub Constructor");
    }

    @Override
    public String toString() {
        return "Shape: " + this.shape + ", Material: " + this.material + ", Length: " + this.length + " ft";
    }
}
