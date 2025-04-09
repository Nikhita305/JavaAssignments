package com.xworkz.toStringRep;

public class Aquarium {
    private String name;
    private int capacity;
    private String location;

    public Aquarium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        System.out.println("Aquarium Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Capacity: " + this.capacity + " liters, Location: " + this.location;
    }
}
