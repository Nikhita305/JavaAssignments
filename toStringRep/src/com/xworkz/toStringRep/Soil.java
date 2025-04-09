package com.xworkz.toStringRep;

public class Soil {
    private String type;
    private String color;
    private boolean isFertile;

    public Soil(String type, String color, boolean isFertile) {
        this.type = type;
        this.color = color;
        this.isFertile = isFertile;
        System.out.println("Soil Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Color: " + this.color + ", Is Fertile: " + this.isFertile;
    }
}
