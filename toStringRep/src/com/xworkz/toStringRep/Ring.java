package com.xworkz.toStringRep;

public class Ring {
    private String metal;
    private String design;
    private double price;

    public Ring(String metal, String design, double price) {
        this.metal = metal;
        this.design = design;
        this.price = price;
        System.out.println("Ring Constructor");
    }

    @Override
    public String toString() {
        return "Metal: " + this.metal + ", Design: " + this.design + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 48;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ring) {
                System.out.println("Ref,compare");
                Ring ring1 = this;
                Ring ring2 = (Ring) obj;
                if (ring1.metal.equals(ring2.metal) && ring1.design.equals(ring2.design)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
