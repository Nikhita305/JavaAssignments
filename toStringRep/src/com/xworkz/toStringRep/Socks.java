package com.xworkz.toStringRep;

public class Socks {
    private String brand;
    private String size;
    private String color;

    public Socks(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Socks Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 29;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Socks) {
                System.out.println("Ref,compare");
                Socks socks = this;
                Socks socks1 = (Socks) obj;
                if (socks.brand.equals(socks1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
