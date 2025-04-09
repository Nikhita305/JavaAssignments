package com.xworkz.toStringRep;

public class Gym {
    private String name;
    private String location;
    private int members;

    public Gym(String name, String location, int members) {
        this.name = name;
        this.location = location;
        this.members = members;
        System.out.println("Gym Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Location: " + this.location + ", Members: " + this.members;
    }
}
