package com.xworkz.toStringRep;

public class Lipstick {
    private String brand;
    private String shade;
    private double price;

    public Lipstick(String brand, String shade, double price) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
        System.out.println("Lipstick Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Shade: " + this.shade + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 18;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lipstick) {
                System.out.println("Ref,compare");
                Lipstick lipstick = this;
                Lipstick lipstick1 = (Lipstick) obj;
                if (lipstick.shade.equals(lipstick1.shade)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
