package com.xworkz.toStringRep;

public class Ironbox {
    private String brand;
    private double weight;
    private double price;

    public Ironbox(String brand, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        System.out.println("IronBox Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Weight: " + this.weight + " kg, Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ironbox) {
                System.out.println("Ref is Ironbox, compare");
                Ironbox Ironbox = this;
                Ironbox ironbox1 = (Ironbox) obj;
                if (Ironbox.brand.equals(ironbox1.brand)
                        && Ironbox.weight == ironbox1.weight
                        && Ironbox.price == ironbox1.price) {
                    System.out.println("Both Ironbox objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
