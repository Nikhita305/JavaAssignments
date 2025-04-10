package com.xworkz.toStringRep;

public class Alien {
    private String planet;
    private int age;
    private String species;

    public Alien(String planet, int age, String species) {
        this.planet = planet;
        this.age = age;
        this.species = species;
        System.out.println("Alien Constructor");
    }

    @Override
    public String toString() {
        return "Planet: " + this.planet + ", Age: " + this.age + ", Species: " + this.species;
    }

    public int hashCode() {
        return 84;
    }
}
