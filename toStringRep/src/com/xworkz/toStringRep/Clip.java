package com.xworkz.toStringRep;

public class Clip {
    private String material;
    private String color;
    private double length;

    public Clip(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Clip Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " cm";
    }

    @Override
    public int hashCode() {
        return 13;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Clip) {
                System.out.println("Ref,compare");
                Clip clip = this;
                Clip clip1 = (Clip) obj;
                if (clip.material.equals(clip1.material)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
