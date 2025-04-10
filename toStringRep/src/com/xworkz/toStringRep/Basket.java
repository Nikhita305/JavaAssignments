package com.xworkz.toStringRep;

public class Basket {
    private String material;
    private String color;
    private int size;

    public Basket(String material, String color, int size) {
        this.material = material;
        this.color = color;
        this.size = size;
        System.out.println("Basket Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Size: " + this.size;
    }

    public int hashCode() {
        return 55;
    }
}
