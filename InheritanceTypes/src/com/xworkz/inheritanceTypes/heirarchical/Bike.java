package com.xworkz.inheritanceTypes.heirarchical;

public class Bike extends Vehicle {
    private boolean hasPedals;

    public Bike(String brand, int speed, boolean hasPedals) {
        super(brand, speed);
        this.hasPedals = hasPedals;
    }

    public boolean hasPedals() {
        return hasPedals;
    }
}

