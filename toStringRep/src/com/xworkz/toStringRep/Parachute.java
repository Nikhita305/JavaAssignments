package com.xworkz.toStringRep;

public class Parachute {
    private String material;
    private String color;
    private double diameter;

    public Parachute(String material, String color, double diameter) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
        System.out.println("Parachute Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Diameter: " + this.diameter + "m";
    }

    @Override
    public int hashCode() {
        return 7;
    }
}
