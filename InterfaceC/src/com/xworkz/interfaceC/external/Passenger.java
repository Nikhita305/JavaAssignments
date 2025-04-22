package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Metro;

public class Passenger {
    private Metro metro;

    public Passenger(Metro metro) {
        this.metro = metro;
        System.out.println("constr in Passenger");
    }

    public void travel() {
        if (this.metro != null) {
            System.out.println("not null");
            this.metro.operate();
        } else {
            System.out.println("null");
        }
    }
}
