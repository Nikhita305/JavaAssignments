package com.xworkz.toStringRep;

public class Sticker {
    private String design;
    private String shape;
    private double price;

    public Sticker(String design, String shape, double price) {
        this.design = design;
        this.shape = shape;
        this.price = price;
        System.out.println("Sticker Constructor");
    }

    @Override
    public String toString() {
        return "Design: " + this.design + ", Shape: " + this.shape + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sticker) {
                System.out.println("Ref is Sticker, compare");
                Sticker Sticker = this;
                Sticker sticker1 = (Sticker) obj;
                if (Sticker.design.equals(sticker1.design)
                        && Sticker.shape.equals(sticker1.shape)
                        && Sticker.price == sticker1.price) {
                    System.out.println("Both Sticker objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
