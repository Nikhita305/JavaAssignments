package com.xworkz.toStringRep;

public class Box {
    private String material;
    private String color;
    private double weight;

    public Box(String material, String color, double weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
        System.out.println("Box Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Weight: " + this.weight + " kg";
    }

    public int hashCode() {
        return 85;
    }
}
