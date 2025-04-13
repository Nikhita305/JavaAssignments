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

    @Override
    public int hashCode() {
        return 16;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Airpods) {
                System.out.println("Ref,compare");
                Airpods airpods = this;
                Airpods airpods1 = (Airpods) obj;
                if (airpods.brand.equals(airpods1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
