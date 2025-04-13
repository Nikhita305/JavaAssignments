package com.xworkz.toStringRep;

public class Sandal {
    private String brand;
    private String size;
    private String color;

    public Sandal(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Sandal Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 20;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sandal) {
                System.out.println("Ref,compare");
                Sandal s1 = this;
                Sandal s2 = (Sandal) obj;
                if (s1.brand.equals(s2.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
