package com.xworkz.toStringRep;

public class Shampoo {
    private String brand;
    private String type;
    private double volume;

    public Shampoo(String brand, String type, double volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
        System.out.println("Shampoo Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Volume: " + this.volume + " ml";
    }

    @Override
    public int hashCode() {
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shampoo) {
                System.out.println("Ref is Shampoo, compare");
                Shampoo shampoo1 = this;
                Shampoo shampoo2 = (Shampoo) obj;
                if (shampoo1.brand.equals(shampoo2.brand)
                        && shampoo1.type.equals(shampoo2.type)
                        && shampoo1.volume == shampoo2.volume) {
                    System.out.println("Both Shampoo objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
