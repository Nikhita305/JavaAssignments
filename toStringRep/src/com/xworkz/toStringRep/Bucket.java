package com.xworkz.toStringRep;

public class Bucket {
    private String material;
    private double capacity;
    private String color;

    public Bucket(String material, double capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Bucket Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Capacity: " + this.capacity + " L, Color: " + this.color;
    }
}
