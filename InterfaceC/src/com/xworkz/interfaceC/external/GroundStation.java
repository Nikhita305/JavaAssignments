package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Satellite;

public class GroundStation {
    private Satellite satellite;

    public GroundStation(Satellite satellite) {
        this.satellite = satellite;
        System.out.println("constr in GroundStation");
    }

    public void sendSignal() {
        if (this.satellite != null) {
            System.out.println("not null");
            this.satellite.transmit();
        } else {
            System.out.println("null");
        }
    }
}

