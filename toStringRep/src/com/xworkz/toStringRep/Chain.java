package com.xworkz.toStringRep;

public class Chain {
    private String material;
    private double length;
    private String type;

    public Chain(String material, double length, String type) {
        this.material = material;
        this.length = length;
        this.type = type;
        System.out.println("Chain Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Length: " + this.length + " inches, Type: " + this.type;
    }

    @Override
    public int hashCode() {
        return 30;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chain) {
                System.out.println("Ref,compare");
                Chain chain = this;
                Chain chain1 = (Chain) obj;
                if (chain.material.equals(chain1.material)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
