package com.inheritance;

public class Pencil extends Stationery {
    public Pencil() {
        System.out.println("Pencil constructor called");
    }

    @Override
    public void write() {
        System.out.println("Pencil is writing smoothly...");
    }

    @Override
    public void draw() {
        System.out.println("Pencil is drawing a sketch...");
    }

    @Override
    public void erase() {
        System.out.println("Pencil eraser is removing marks...");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the pencil tip...");
    }

    @Override
    public void store() {
        System.out.println("Placing the pencil in the pencil case...");
    }
}
