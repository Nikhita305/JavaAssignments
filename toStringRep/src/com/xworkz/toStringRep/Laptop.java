package com.xworkz.toStringRep;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        System.out.println("Laptop Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", RAM: " + this.ram + "GB, Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("Ref,compare");
                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop.brand.equals(laptop1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
