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
}
