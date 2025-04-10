package com.xworkz.toStringRep;

public class Hippopotamus {
    private String name;
    private double weight;
    private String habitat;

    public Hippopotamus(String name, double weight, String habitat) {
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
        System.out.println("Hippopotamus Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Weight: " + this.weight + " kg, Habitat: " + this.habitat;
    }

    @Override
    public int hashCode() {
        return 36;
    }
}
