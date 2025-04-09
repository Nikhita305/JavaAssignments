package com.xworkz.toStringRep;

public class Ring {
    private String metal;
    private String design;
    private double price;

    public Ring(String metal, String design, double price) {
        this.metal = metal;
        this.design = design;
        this.price = price;
        System.out.println("Ring Constructor");
    }

    @Override
    public String toString() {
        return "Metal: " + this.metal + ", Design: " + this.design + ", Price: ₹" + this.price;
    }
}
