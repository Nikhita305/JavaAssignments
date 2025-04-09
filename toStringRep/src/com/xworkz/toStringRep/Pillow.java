package com.xworkz.toStringRep;

public class Pillow {
    private String material;
    private String size;
    private double price;

    public Pillow(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
        System.out.println("Pillow Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Size: " + this.size + ", Price: ₹" + this.price;
    }
}
