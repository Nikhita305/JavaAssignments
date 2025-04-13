package com.xworkz.toStringRep;

public class Belt {
    private String material;
    private String color;
    private double price;

    public Belt(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
        System.out.println("Belt Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Belt) {
                System.out.println("Ref is Belt, compare");
                Belt belt1 = this;
                Belt belt2 = (Belt) obj;
                if (belt1.material.equals(belt2.material)
                        && belt1.color.equals(belt2.color)
                        && belt1.price == belt2.price) {
                    System.out.println("Both Belt objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}