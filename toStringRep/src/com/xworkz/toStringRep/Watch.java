package com.xworkz.toStringRep;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Watch Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Watch) {
                System.out.println("Ref,compare");
                Watch watch = this;
                Watch watch1 = (Watch) obj;
                if (watch.brand.equals(watch1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
