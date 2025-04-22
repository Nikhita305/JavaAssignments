package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Drone;

public class Pilot {
    private Drone drone;

    public Pilot(Drone drone) {
        this.drone = drone;
        System.out.println("constr in Pilot");
    }

    public void takeOff() {
        if (this.drone != null) {
            System.out.println("not null");
            this.drone.fly();
        } else {
            System.out.println("null");
        }
    }
}

