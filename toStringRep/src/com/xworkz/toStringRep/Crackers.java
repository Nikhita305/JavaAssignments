package com.xworkz.toStringRep;

public class Crackers {
    private String type;
    private String brand;
    private double price;

    public Crackers(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        System.out.println("Crackers Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Brand: " + this.brand + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 37;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Crackers) {
                System.out.println("Ref,compare");
                Crackers crackers = this;
                Crackers crackers1 = (Crackers) obj;
                if (crackers.type.equals(crackers1.type) && crackers.brand.equals(crackers1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
