package com.xworkz.toStringRep;

public class Barbie {
    private String outfit;
    private String hairColor;
    private double price;

    public Barbie(String outfit, String hairColor, double price) {
        this.outfit = outfit;
        this.hairColor = hairColor;
        this.price = price;
        System.out.println("Barbie Constructor");
    }

    @Override
    public String toString() {
        return "Outfit: " + this.outfit + ", Hair Color: " + this.hairColor + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Barbie) {
                System.out.println("Ref is Barbie, compare");
                Barbie Barbie = this;
                Barbie barbie1 = (Barbie) obj;
                if (Barbie.outfit.equals(barbie1.outfit)
                        && Barbie.hairColor.equals(barbie1.hairColor)
                        && Barbie.price == barbie1.price) {
                    System.out.println("Both Barbie objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
