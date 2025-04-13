package com.xworkz.toStringRep;

public class Balloon {
    private String color;
    private String shape;
    private double size;

    public Balloon(String color, String shape, double size) {
        this.color = color;
        this.shape = shape;
        this.size = size;
        System.out.println("Balloon Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Shape: " + this.shape + ", Size: " + this.size + " inches";
    }

    @Override
    public int hashCode() {
        return 15;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Balloon) {
                System.out.println("Ref,compare");
                Balloon balloon1 = this;
                Balloon balloon2 = (Balloon) obj;
                if (balloon1.color.equals(balloon2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
