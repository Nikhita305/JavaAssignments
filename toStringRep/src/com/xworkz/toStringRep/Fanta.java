package com.xworkz.toStringRep;

public class Fanta {
    private String flavor;
    private int volume;
    private int price;

    public Fanta(String flavor, int volume, int price) {
        this.flavor = flavor;
        this.volume = volume;
        this.price = price;
        System.out.println("Fanta Constructor");
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Volume: " + this.volume + "Price: ₹" + this.price;
    }

    public int hashCode() {
        return 97;
    }
}
