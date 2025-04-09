package com.xworkz.toStringRep;

public class Gun {
    private String model;
    private String type;
    private int capacity;

    public Gun(String model, String type, int capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        System.out.println("Gun Constructor");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + ", Type: " + this.type + ", Capacity: " + this.capacity + " rounds";
    }
}
