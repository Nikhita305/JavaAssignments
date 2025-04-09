package com.xworkz.toStringRep;

public class Wire {
    private String material;
    private String color;
    private double length;

    public Wire(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Wire Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " m";
    }
}
