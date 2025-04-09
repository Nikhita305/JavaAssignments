package com.xworkz.toStringRep;

public class Airpods {
    private String brand;
    private String model;
    private int batteryLife;

    public Airpods(String brand, String model, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
        System.out.println("Airpods Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Battery Life: " + this.batteryLife + " hrs";
    }
}
