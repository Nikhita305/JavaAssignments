package com.xworkz.toStringRep;

public class Candle {
    private String scent;
    private String color;
    private int burnTime;

    public Candle(String scent, String color, int burnTime) {
        this.scent = scent;
        this.color = color;
        this.burnTime = burnTime;
        System.out.println("Candle Constructor");
    }

    @Override
    public String toString() {
        return "Scent: " + this.scent + ", Color: " + this.color + ", Burn Time: " + this.burnTime + " hrs";
    }

    @Override
    public int hashCode() {
        return 28;
    }
}
