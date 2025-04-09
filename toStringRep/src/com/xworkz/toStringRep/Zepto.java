package com.xworkz.toStringRep;

public class Zepto {
    private String item;
    private String category;
    private double cost;

    public Zepto(String item, String category, double cost) {
        this.item = item;
        this.category = category;
        this.cost = cost;
        System.out.println("Zepto Constructor");
    }

    @Override
    public String toString() {
        return "Item: " + this.item + ", Category: " + this.category + ", Cost: ₹" + this.cost;
    }
}
