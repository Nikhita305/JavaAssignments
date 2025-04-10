package com.xworkz.toStringRep;

public class Bangle {
    private String material;
    private String color;
    private double diameter;

    public Bangle(String material, String color, double diameter) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
        System.out.println("Bangle Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Diameter: " + this.diameter + " cm";
    }

    public int hashCode() {
        return 60;
    }
}
