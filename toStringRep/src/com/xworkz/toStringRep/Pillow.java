package com.xworkz.toStringRep;

public class Pillow {
    private String material;
    private String size;
    private double price;

    public Pillow(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
        System.out.println("Pillow Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Size: " + this.size + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pillow) {
                System.out.println("Ref is Pillow, compare");
                Pillow Pillow = this;
                Pillow pillow1 = (Pillow) obj;
                if (Pillow.material.equals(pillow1.material)
                        && Pillow.size.equals(pillow1.size)
                        && Pillow.price == pillow1.price) {
                    System.out.println("Both Pillow objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
