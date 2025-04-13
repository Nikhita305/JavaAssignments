package com.xworkz.toStringRep;

public class Keyboard {
    private String brand;
    private String type;
    private double price;

    public Keyboard(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        System.out.println("Keyboard Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("Ref,compare");
                Keyboard keyboard = this;
                Keyboard keyboard1 = (Keyboard) obj;
                if (keyboard.brand.equals(keyboard1.brand) && keyboard.type.equals(keyboard1.type)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
