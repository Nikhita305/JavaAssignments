package com.xworkz.toStringRep;

public class Pillar {
    private String material;
    private double height;
    private String location;

    public Pillar(String material, double height, String location) {
        this.material = material;
        this.height = height;
        this.location = location;
        System.out.println("Pillar Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Height: " + this.height + "Location: " + this.location;
    }
}
