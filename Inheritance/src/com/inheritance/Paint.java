package com.inheritance;

public class Paint {
    public Paint() {
        System.out.println("Running no-arg constructor of Paint");
    }

    public void name() {
        System.out.println("Paint name");
    }

    public void type() {
        System.out.println("Paints can be watercolor, oil, acrylic, etc.");
    }

    public void use() {
        System.out.println("Paint is used for coloring surfaces or artworks");
    }

    public void dryTime() {
        System.out.println("Different paints have different drying times");
    }

    public void base() {
        System.out.println("Paints can be water-based or oil-based");
    }
}
