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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Wallpaper) {
                System.out.println("Ref,compare");
                Wallpaper wall1 = this;
                Wallpaper wall2 = (Wallpaper) obj;
                if (wall1.pattern.equals(wall2.pattern) && wall1.color.equals(wall2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
