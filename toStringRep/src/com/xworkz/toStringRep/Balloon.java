package com.xworkz.toStringRep;

public class Balloon {
    private String color;
    private String shape;
    private double size;

    public Balloon(String color, String shape, double size) {
        this.color = color;
        this.shape = shape;
        this.size = size;
        System.out.println("Balloon Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Shape: " + this.shape + ", Size: " + this.size + " inches";
    }

    @Override
    public int hashCode() {
        return 15;
    }
}
