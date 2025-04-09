package com.xworkz.toStringRep;

public class Coin {
    private String material;
    private double value;
    private int year;

    public Coin(String material, double value, int year) {
        this.material = material;
        this.value = value;
        this.year = year;
        System.out.println("Coin Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Value: ₹" + this.value + ", Year: " + this.year;
    }
}
