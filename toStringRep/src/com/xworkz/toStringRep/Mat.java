package com.xworkz.toStringRep;

public class Mat {
    private String material;
    private String color;
    private double length;

    public Mat(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Mat Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " ft";
    }
}
