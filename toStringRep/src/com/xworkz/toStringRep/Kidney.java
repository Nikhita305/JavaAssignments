package com.xworkz.toStringRep;

public class Kidney {
    private String type;
    private String function;
    private double size;

    public Kidney(String type, String function, double size) {
        this.type = type;
        this.function = function;
        this.size = size;
        System.out.println("Kidney Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Function: " + this.function + ", Size: " + this.size + " cm";
    }

    public int hashCode() {
        return 74;
    }
}
