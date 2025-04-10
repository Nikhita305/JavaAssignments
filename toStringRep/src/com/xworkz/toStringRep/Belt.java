package com.xworkz.toStringRep;

public class Belt {
    private String material;
    private String color;
    private double price;

    public Belt(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
        System.out.println("Belt Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Price: ₹" + this.price;
    }

    public int hashCode() {
        return 75;
    }
}
