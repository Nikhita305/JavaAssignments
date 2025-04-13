package com.xworkz.toStringRep;

public class Candy {
    private String flavor;
    private String color;
    private double weight;

    public Candy(String flavor, String color, double weight) {
        this.flavor = flavor;
        this.color = color;
        this.weight = weight;
        System.out.println("Candy Constructor");
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Color: " + this.color + ", Weight: " + this.weight + "g";
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Candy) {
                System.out.println("Ref,compare");
                Candy candy = this;
                Candy candy1 = (Candy) obj;
                if (candy.flavor.equals(candy1.flavor)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
