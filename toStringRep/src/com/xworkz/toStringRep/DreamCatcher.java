package com.xworkz.toStringRep;

public class DreamCatcher {
    private String color;
    private double diameter;
    private String material;

    public DreamCatcher(String color, double diameter, String material) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        System.out.println("DreamCatcher Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Diameter: " + this.diameter + " inches, Material: " + this.material;
    }

    @Override
    public int hashCode() {
        return 21;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof DreamCatcher) {
                System.out.println("Ref,compare");
                DreamCatcher d1 = this;
                DreamCatcher d2 = (DreamCatcher) obj;
                if (d1.color.equals(d2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
