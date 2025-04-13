package com.xworkz.toStringRep;

public class Dustbin {
    private String material;
    private String color;
    private int capacity;

    public Dustbin(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Dustbin Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Capacity: " + this.capacity + " L";
    }

    @Override
    public int hashCode() {
        return 49;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Dustbin) {
                System.out.println("Ref,compare");
                Dustbin bin1 = this;
                Dustbin bin2 = (Dustbin) obj;
                if (bin1.material.equals(bin2.material) && bin1.color.equals(bin2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
