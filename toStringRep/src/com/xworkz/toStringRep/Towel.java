package com.xworkz.toStringRep;

public class Towel {
    private String material;
    private String color;
    private double length;

    public Towel(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Towel Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " cm";
    }

    public int hashCode() {
        return 69;
    }
}
