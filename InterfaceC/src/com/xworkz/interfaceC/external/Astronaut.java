package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Rocket;

public class Astronaut {
    private Rocket rocket;

    public Astronaut(Rocket rocket) {
        this.rocket = rocket;
        System.out.println("constr in Astronaut");
    }

    public void startMission() {
        if (this.rocket != null) {
            System.out.println("not null");
            this.rocket.launch();
        } else {
            System.out.println("null");
        }
    }
}
