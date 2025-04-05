package com.inheritance;

public class Shape {
    public Shape() {
        System.out.println("🔷 Shape constructor called");
    }

    public void draw() {
        System.out.println("Drawing a generic shape...");
    }

    public void rotate() {
        System.out.println("Rotating the shape...");
    }

    public void scale() {
        System.out.println("Scaling the shape...");
    }

    public void move() {
        System.out.println("Moving the shape...");
    }

    public void erase() {
        System.out.println("Erasing the shape...");
    }
}
