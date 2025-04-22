package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Bike;

public class Racer {
    private Bike bike;

    public Racer(Bike bike) {
        this.bike = bike;
        System.out.println("constr in Racer");
    }

    public void startRace() {
        if (this.bike != null) {
            System.out.println("not null");
            this.bike.race();
        } else {
            System.out.println("null");
        }
    }
}

