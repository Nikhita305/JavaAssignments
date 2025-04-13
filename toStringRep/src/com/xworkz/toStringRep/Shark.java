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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shark) {
                System.out.println("Ref,compare");
                Shark shark = this;
                Shark shark1 = (Shark) obj;
                if (shark.species.equals(shark1.species) &&
                        shark.ocean.equals(shark1.ocean)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
