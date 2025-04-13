package com.xworkz.toStringRep;

public class Projector {
    private String brand;
    private String type;
    private double price;

    public Projector(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Projector Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 53;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Projector) {
                System.out.println("Ref,compare");
                Projector projector = this;
                Projector projector1 = (Projector) obj;
                if (projector.brand.equals(projector1.brand) && projector.type.equals(projector1.type)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
