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

    @Override
    public int hashCode() {
        return 25;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Coin) {
                System.out.println("Ref,compare");
                Coin coin = this;
                Coin coin1 = (Coin) obj;
                if (coin.material.equals(coin1.material)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
