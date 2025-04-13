package com.xworkz.toStringRep;

public class Parachute {
    private String material;
    private String color;
    private double diameter;

    public Parachute(String material, String color, double diameter) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
        System.out.println("Parachute Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Diameter: " + this.diameter + "m";
    }

    @Override
    public int hashCode() {
        return 7;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Parachute) {
                System.out.println("Ref,compare");
                Parachute parachute = this;
                Parachute parachute1 = (Parachute) obj;
                if (parachute.material.equals(parachute1.material)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
