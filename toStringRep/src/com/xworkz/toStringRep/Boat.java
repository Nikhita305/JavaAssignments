package com.xworkz.toStringRep;

public class Boat {
    private String type;
    private String color;
    private int capacity;

    public Boat(String type, String color, int capacity) {
        this.type = type;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Boat Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Color: " + this.color + ", Capacity: " + this.capacity + " people";
    }
}
