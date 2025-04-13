package com.xworkz.toStringRep;

public class Bangle {
    private String material;
    private String color;
    private double diameter;

    public Bangle(String material, String color, double diameter) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
        System.out.println("Bangle Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Diameter: " + this.diameter + " cm";
    }

    @Override
    public int hashCode() {
        return 60;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bangle) {
                System.out.println("Ref,compare");
                Bangle bangle = this;
                Bangle bangle1 = (Bangle) obj;
                if (bangle.material.equals(bangle1.material) && bangle.color.equals(bangle1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
