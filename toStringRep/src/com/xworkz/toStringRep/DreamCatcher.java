package com.xworkz.toStringRep;

public class DreamCatcher {
    private String color;
    private double diameter;
    private String material;

    public DreamCatcher(String color, double diameter, String material) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        System.out.println("DreamCatcher Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Diameter: " + this.diameter + " inches, Material: " + this.material;
    }
}
