package com.xworkz.toStringRep;

public class Auditorium {
    private String name;
    private int capacity;
    private String location;

    public Auditorium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        System.out.println("Auditorium Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Capacity: " + this.capacity + " seats, Location: " + this.location;
    }

    public int hashCode() {
        return 76;
    }
}
