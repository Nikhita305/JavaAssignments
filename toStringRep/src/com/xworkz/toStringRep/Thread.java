package com.xworkz.toStringRep;

public class Thread {
    private String color;
    private String type;
    private double length;

    public Thread(String color, String type, double length) {
        this.color = color;
        this.type = type;
        this.length = length;
        System.out.println("Thread Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Type: " + this.type + ", Length: " + this.length + " m";
    }

    public int hashCode() {
        return 56;
    }
}
