package com.xworkz.toStringRep;

public class Sticker {
    private String design;
    private String shape;
    private double price;

    public Sticker(String design, String shape, double price) {
        this.design = design;
        this.shape = shape;
        this.price = price;
        System.out.println("Sticker Constructor");
    }

    @Override
    public String toString() {
        return "Design: " + this.design + ", Shape: " + this.shape + ", Price: ₹" + this.price;
    }

    public int hashCode() {
        return 90;
    }
}
