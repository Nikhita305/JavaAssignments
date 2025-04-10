package com.xworkz.toStringRep;

public class River {
    private String name;
    private double length;
    private String origin;

    public River(String name, double length, String origin) {
        this.name = name;
        this.length = length;
        this.origin = origin;
        System.out.println("River Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Length: " + this.length + " km, Origin: " + this.origin;
    }

    public int hashCode() {
        return 64;
    }
}
