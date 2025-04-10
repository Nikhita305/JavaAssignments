package com.xworkz.toStringRep;

public class Needle {
    private String type;
    private double length;
    private boolean isSharp;

    public Needle(String type, double length, boolean isSharp) {
        this.type = type;
        this.length = length;
        this.isSharp = isSharp;
        System.out.println("Needle Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Length: " + this.length + " cm, Is Sharp: " + this.isSharp;
    }

    public int hashCode() {
        return 51;
    }
}
