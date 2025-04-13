package com.xworkz.toStringRep;

public class Lenskart {
    private String frameType;
    private String lensType;
    private double price;

    public Lenskart(String frameType, String lensType, double price) {
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        System.out.println("Lenskart Constructor");
    }

    @Override
    public String toString() {
        return "Frame Type: " + this.frameType + ", Lens Type: " + this.lensType + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 44;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lenskart) {
                System.out.println("Ref,compare");
                Lenskart lens = this;
                Lenskart lens1 = (Lenskart) obj;
                if (lens.frameType.equals(lens1.frameType) && lens.lensType.equals(lens1.lensType)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
