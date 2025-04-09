package com.xworkz.toStringRep;

public class Dustbin {
    private String material;
    private String color;
    private int capacity;

    public Dustbin(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Dustbin Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Capacity: " + this.capacity + " L";
    }
}
