package com.xworkz.toStringRep;

public class Shark {
    private String species;
    private double length;
    private String ocean;

    public Shark(String species, double length, String ocean) {
        this.species = species;
        this.length = length;
        this.ocean = ocean;
        System.out.println("Shark Constructor");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + ", Length: " + this.length + " ft, Ocean: " + this.ocean;
    }

    @Override
    public int hashCode() {
        return 32;
    }
}
