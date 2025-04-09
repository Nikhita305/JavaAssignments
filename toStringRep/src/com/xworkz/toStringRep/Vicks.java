package com.xworkz.toStringRep;

public class Vicks {
    private String type;
    private String scent;
    private double price;

    public Vicks(String type, String scent, double price) {
        this.type = type;
        this.scent = scent;
        this.price = price;
        System.out.println("Vicks Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Scent: " + this.scent + ", Price: ₹" + this.price;
    }
}
