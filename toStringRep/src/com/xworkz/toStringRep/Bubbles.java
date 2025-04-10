package com.xworkz.toStringRep;

public class Bubbles {
    private String size;
    private String color;
    private int count;

    public Bubbles(String size, String color, int count) {
        this.size = size;
        this.color = color;
        this.count = count;
        System.out.println("Bubbles Constructor");
    }

    @Override
    public String toString() {
        return "Size: " + this.size + ", Color: " + this.color + ", Count: " + this.count;
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
