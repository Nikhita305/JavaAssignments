package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Car;

public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
        System.out.println("constr in Driver");
    }

    public void startDriving() {
        if (this.car != null) {
            System.out.println("not null");
            this.car.drive();
        } else {
            System.out.println("null");
        }
    }
}
