package com.xworkz.toStringRep;

public class BathTub {
    private String shape;
    private String material;
    private double length;

    public BathTub(String shape, String material, double length) {
        this.shape = shape;
        this.material = material;
        this.length = length;
        System.out.println("BathTub Constructor");
    }

    @Override
    public String toString() {
        return "Shape: " + this.shape + ", Material: " + this.material + ", Length: " + this.length + " ft";
    }

    @Override
    public int hashCode() {
        return 27;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof BathTub) {
                System.out.println("Ref,compare");
                BathTub bathTub = this;
                BathTub bathTub1 = (BathTub) obj;
                if (bathTub.shape.equals(bathTub1.shape)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
