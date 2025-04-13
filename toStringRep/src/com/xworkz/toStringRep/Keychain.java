package com.xworkz.toStringRep;

public class Keychain {
    private String material;
    private String shape;
    private double price;

    public Keychain(String material, String shape, double price) {
        this.material = material;
        this.shape = shape;
        this.price = price;
        System.out.println("Keychain Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Shape: " + this.shape + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 91;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keychain) {
                System.out.println("Ref is Keychain, compare");
                Keychain Keychain = this;
                Keychain keychain1 = (Keychain) obj;
                if (Keychain.material.equals(keychain1.material)
                        && Keychain.shape.equals(keychain1.shape)
                        && Keychain.price == keychain1.price) {
                    System.out.println("Both Keychain objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
