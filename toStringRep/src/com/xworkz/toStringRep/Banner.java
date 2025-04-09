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
}
