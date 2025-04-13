package com.xworkz.toStringRep;

public class Cream {
    private String brand;
    private String purpose;
    private double price;

    public Cream(String brand, String purpose, double price) {
        this.brand = brand;
        this.purpose = purpose;
        this.price = price;
        System.out.println("Cream Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Purpose: " + this.purpose + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cream) {
                System.out.println("Ref,compare");
                Cream cream = this;
                Cream cream1 = (Cream) obj;
                if (cream.brand.equals(cream1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
