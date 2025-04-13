package com.xworkz.toStringRep;

public class Banner {
    private String text;
    private String color;
    private int width;

    public Banner(String text, String color, int width) {
        this.text = text;
        this.color = color;
        this.width = width;
        System.out.println("Banner Constructor");
    }

    @Override
    public String toString() {
        return "Text: " + this.text + ", Color: " + this.color + ", Width: " + this.width + " ft";
    }

    @Override
    public int hashCode() {
        return 40;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Banner) {
                System.out.println("Ref,compare");
                Banner banner = this;
                Banner banner1 = (Banner) obj;
                if (banner.text.equals(banner1.text) && banner.color.equals(banner1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
