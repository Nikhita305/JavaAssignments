package com.xworkz.toStringRep;

public class Cupboard {
    private String material;
    private int shelves;
    private String color;

    public Cupboard(String material, int shelves, String color) {
        this.material = material;
        this.shelves = shelves;
        this.color = color;
        System.out.println("Cupboard Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Shelves: " + this.shelves + ", Color: " + this.color;
    }

    public int hashCode() {
        return 86;
    }
}
