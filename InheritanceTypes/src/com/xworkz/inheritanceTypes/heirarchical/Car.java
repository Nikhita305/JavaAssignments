package com.xworkz.inheritanceTypes.heirarchical;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}

