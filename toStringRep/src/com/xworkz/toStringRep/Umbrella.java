package com.xworkz.toStringRep;

public class Umbrella {
    private String color;
    private String size;
    private double price;

    public Umbrella(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
        System.out.println("Umbrella Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Size: " + this.size + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Umbrella) {
                System.out.println("Ref is Umbrella, compare");
                Umbrella umbrella1 = this;
                Umbrella umbrella2 = (Umbrella) obj;
                if (umbrella1.color.equals(umbrella2.color)
                        && umbrella1.size.equals(umbrella2.size)
                        && umbrella1.price == umbrella2.price) {
                    System.out.println("Both Umbrella objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
