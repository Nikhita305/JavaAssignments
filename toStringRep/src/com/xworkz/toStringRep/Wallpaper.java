package com.xworkz.toStringRep;

public class Wallpaper {
    private String pattern;
    private String color;
    private double price;

    public Wallpaper(String pattern, String color, double price) {
        this.pattern = pattern;
        this.color = color;
        this.price = price;
        System.out.println("Wallpaper Constructor");
    }

    @Override
    public String toString() {
        return "Pattern: " + this.pattern + ", Color: " + this.color + ", Price per Roll: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 47;
    }
}
