package com.xworkz.toStringRep;

public class Powerbank {
    private String brand;
    private int capacity;
    private double price;

    public Powerbank(String brand, int capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
        System.out.println("Powerbank Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Capacity: " + this.capacity + "mAh, Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 68;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Powerbank) {
                System.out.println("Ref is Powerbank, compare");
                Powerbank powerbank1 = this;
                Powerbank powerbank2 = (Powerbank) obj;
                if (powerbank1.brand.equals(powerbank2.brand)
                        && powerbank1.capacity == powerbank2.capacity
                        && powerbank1.price == powerbank2.price) {
                    System.out.println("Both Powerbanks are same");
                    return true;
                }
            }
        }
        return false;
    }
}
