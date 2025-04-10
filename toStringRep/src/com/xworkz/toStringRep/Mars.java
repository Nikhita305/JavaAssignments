package com.xworkz.toStringRep;

public class Mars {
    private String color;
    private double distance;
    private boolean hasLife;

    public Mars(String color, double distance, boolean hasLife) {
        this.color = color;
        this.distance = distance;
        this.hasLife = hasLife;
        System.out.println("Mars Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Distance from Earth: " + this.distance + " million km, Has Life: " + this.hasLife;
    }

    public int hashCode() {
        return 61;
    }
}
