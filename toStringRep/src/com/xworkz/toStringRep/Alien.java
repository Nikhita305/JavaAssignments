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

    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Alien) {
                System.out.println("Ref is Alien, compare");
                Alien Alien = this;
                Alien alien1 = (Alien) obj;
                if (Alien.planet.equals(alien1.planet)
                        && Alien.age == alien1.age
                        && Alien.species.equals(alien1.species)) {
                    System.out.println("Both Alien objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
