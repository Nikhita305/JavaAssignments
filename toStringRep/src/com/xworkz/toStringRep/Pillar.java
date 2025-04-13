package com.xworkz.toStringRep;

public class Pillar {
    private String material;
    private double height;
    private String location;

    public Pillar(String material, double height, String location) {
        this.material = material;
        this.height = height;
        this.location = location;
        System.out.println("Pillar Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Height: " + this.height + " m, Location: " + this.location;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pillar) {
                System.out.println("Ref is Pillar, compare");
                Pillar pillar1 = (Pillar) obj;
                if (this.material.equals(pillar1.material)
                        && this.height == pillar1.height
                        && this.location.equals(pillar1.location)) {
                    System.out.println("Both Pillars are same");
                    return true;
                }
            }
        }
        return false;
    }
}
