package com.xworkz.toStringRep;

public class Zudio {
    private String productType;
    private String size;
    private double price;

    public Zudio(String productType, String size, double price) {
        this.productType = productType;
        this.size = size;
        this.price = price;
        System.out.println("Zudio Constructor");
    }

    @Override
    public String toString() {
        return "Product: " + this.productType + ", Size: " + this.size + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Zudio) {
                System.out.println("Ref,compare");
                Zudio zudio1 = this;
                Zudio zudio2 = (Zudio) obj;
                if (zudio1.productType.equals(zudio2.productType)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
