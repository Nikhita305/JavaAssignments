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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Hippopotamus) {
                System.out.println("Ref,compare");
                Hippopotamus hippo = this;
                Hippopotamus hippo1 = (Hippopotamus) obj;
                if (hippo.name.equals(hippo1.name) && hippo.habitat.equals(hippo1.habitat)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
