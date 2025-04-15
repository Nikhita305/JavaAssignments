package com.xworkz.inheritanceTypes.multiLevel;

public class WashingMachine extends Appliance {
    private int capacity;

    public WashingMachine(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
