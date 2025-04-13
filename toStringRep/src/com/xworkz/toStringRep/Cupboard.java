package com.xworkz.toStringRep;

public class Cupboard {
    private String material;
    private int shelves;
    private String color;

    public Cupboard(String material, int shelves, String color) {
        this.material = material;
        this.shelves = shelves;
        this.color = color;
        System.out.println("Cupboard Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Shelves: " + this.shelves + ", Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cupboard) {
                System.out.println("Ref is Cupboard, compare");
                Cupboard Cupboard = this;
                Cupboard cupboard1 = (Cupboard) obj;
                if (Cupboard.material.equals(cupboard1.material)
                        && Cupboard.shelves == cupboard1.shelves
                        && Cupboard.color.equals(cupboard1.color)) {
                    System.out.println("Both Cupboard objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
