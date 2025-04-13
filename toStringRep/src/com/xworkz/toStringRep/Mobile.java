package com.xworkz.toStringRep;

public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Mobile Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mobile) {
                System.out.println("Ref,compare");
                Mobile mobile = this;
                Mobile mobile1 = (Mobile) obj;
                if (mobile.brand.equals(mobile1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
