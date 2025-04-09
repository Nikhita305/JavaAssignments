package com.xworkz.toStringRep;

public class Airport {
    private String name;
    private String location;
    private int terminals;

    public Airport(String name, String location, int terminals) {
        this.name = name;
        this.location = location;
        this.terminals = terminals;
        System.out.println("Airport Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Location: " + this.location + ", Terminals: " + this.terminals;
    }
}
