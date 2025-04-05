package com.inheritance;

public class Circle extends Shape {
    public Circle() {
        System.out.println("Circle constructor called");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a perfect circle...");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the circle 360°...");
    }

    @Override
    public void scale() {
        System.out.println("Scaling the circle's radius...");
    }

    @Override
    public void move() {
        System.out.println("Moving the circle to a new position...");
    }

    @Override
    public void erase() {
        System.out.println("Circle erased from canvas.");
    }
}
