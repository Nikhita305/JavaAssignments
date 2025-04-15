package com.xworkz.inheritanceTypes.multiLevel;

public class Triangle extends Polygon {
    private double area;

    public Triangle(String color, int sides, double area) {
        super(color, sides);
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
