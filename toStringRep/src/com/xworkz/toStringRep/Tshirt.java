package com.xworkz.toStringRep;

public class Tshirt {
    private String brand;
    private int size;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tshirt) {
                System.out.println("Ref is Tshirt,compare");
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt) obj;
                if (tshirt1.brand.equals(tshirt2.brand) && tshirt1.size == tshirt2.size && tshirt1.color.equals(tshirt2.color)) {
                    System.out.println("Both Tshirts are same");
                    return true;
                }
            }
        }
        return false;
    }
}
