package com.xworkz.toStringRep;

public class Towel {
    private String material;
    private String color;
    private double length;

    public Towel(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Towel Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " cm";
    }

    @Override
    public int hashCode() {
        return 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Towel) {
                System.out.println("Ref is Towel, compare");
                Towel towel1 = this;
                Towel towel2 = (Towel) obj;
                if (towel1.material.equals(towel2.material)
                        && towel1.color.equals(towel2.color)
                        && towel1.length == towel2.length) {
                    System.out.println("Both Towels are same");
                    return true;
                }
            }
        }
        return false;
    }
}
