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

    @Override
    public int hashCode() {
        return 54;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Zepto) {
                System.out.println("Ref,compare");
                Zepto zepto = this;
                Zepto zepto1 = (Zepto) obj;
                if (zepto.item.equals(zepto1.item) && zepto.category.equals(zepto1.category)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
