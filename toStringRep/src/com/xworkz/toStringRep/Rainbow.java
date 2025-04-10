package com.xworkz.toStringRep;

public class Rainbow {
    private int colors;
    private String shape;
    private String timeVisible;

    public Rainbow(int colors, String shape, String timeVisible) {
        this.colors = colors;
        this.shape = shape;
        this.timeVisible = timeVisible;
        System.out.println("Rainbow Constructor");
    }

    @Override
    public String toString() {
        return "Colors: " + this.colors + ", Shape: " + this.shape + ", Visible At: " + this.timeVisible;
    }

    public int hashCode() {
        return 95;
    }
}
