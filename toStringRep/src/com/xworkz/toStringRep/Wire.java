package com.xworkz.toStringRep;

public class Wire {
    private String material;
    private String color;
    private double length;

    public Wire(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Wire Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " m";
    }

    @Override
    public int hashCode() {
        return 59;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Wire) {
                System.out.println("Ref,compare");
                Wire wire = this;
                Wire wire1 = (Wire) obj;
                if (wire.material.equals(wire1.material) && wire.color.equals(wire1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
