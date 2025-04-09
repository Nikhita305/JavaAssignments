package com.xworkz.toStringRep;

public class Chain {
    private String material;
    private double length;
    private String type;

    public Chain(String material, double length, String type) {
        this.material = material;
        this.length = length;
        this.type = type;
        System.out.println("Chain Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Length: " + this.length + " inches, Type: " + this.type;
    }
}
