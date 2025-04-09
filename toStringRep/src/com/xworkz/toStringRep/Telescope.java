package com.xworkz.toStringRep;

public class Telescope {
    private String brand;
    private String type;
    private double zoom;

    public Telescope(String brand, String type, double zoom) {
        this.brand = brand;
        this.type = type;
        this.zoom = zoom;
        System.out.println("Telescope Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Zoom: " + this.zoom + "x";
    }
}
