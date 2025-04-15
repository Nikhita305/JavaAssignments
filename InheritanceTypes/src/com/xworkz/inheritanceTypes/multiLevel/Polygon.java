package com.xworkz.inheritanceTypes.multiLevel;

public class Polygon extends Shape {
    private int sides;

    public Polygon(String color, int sides) {
        super(color);
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
}
