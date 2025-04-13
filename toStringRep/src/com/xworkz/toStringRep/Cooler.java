package com.xworkz.toStringRep;

public class Cooler {
    private String brand;
    private String type;
    private double price;

    public Cooler(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Cooler Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 70;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cooler) {
                System.out.println("Ref is Cooler, compare");
                Cooler cooler1 = this;
                Cooler cooler2 = (Cooler) obj;
                if (cooler1.brand.equals(cooler2.brand)
                        && cooler1.type.equals(cooler2.type)
                        && cooler1.price == cooler2.price) {
                    System.out.println("Both Coolers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
