package com.xworkz.toStringRep;

public class Skirt {
    private String brand;
    private String length;
    private String color;

    public Skirt(String brand, String length, String color) {
        this.brand = brand;
        this.length = length;
        this.color = color;
        System.out.println("Skirt Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Length: " + this.length + ", Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 22;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Skirt) {
                System.out.println("Ref,compare");
                Skirt skirt = this;
                Skirt skirt1 = (Skirt) obj;
                if (skirt.brand.equals(skirt1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
