package com.xworkz.toStringRep;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Shoe Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shoe) {
                System.out.println("Ref,compare");
                Shoe shoe = this;
                Shoe shoe1 = (Shoe) obj;
                if (shoe.brand.equals(shoe1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
