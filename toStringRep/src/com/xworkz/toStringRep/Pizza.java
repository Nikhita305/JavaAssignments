package com.xworkz.toStringRep;

public class Pizza {
    private String flavor;
    private String size;
    private double price;

    public Pizza(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        System.out.println("Pizza Constructor");
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Size: " + this.size + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 93;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pizza) {
                System.out.println("Ref is Pizza, compare");
                Pizza Pizza = this;
                Pizza pizza1 = (Pizza) obj;
                if (Pizza.flavor.equals(pizza1.flavor)
                        && Pizza.size.equals(pizza1.size)
                        && Pizza.price == pizza1.price) {
                    System.out.println("Both Pizza objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
