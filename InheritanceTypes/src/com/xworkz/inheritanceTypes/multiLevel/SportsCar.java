package com.xworkz.inheritanceTypes.multiLevel;

public class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String brand, String model, int topSpeed) {
        super(brand, model);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
