package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Ocean;

public class MarineBiologist {
    private Ocean ocean;

    public MarineBiologist(Ocean ocean) {
        this.ocean = ocean;
        System.out.println("constr in MarineBiologist");
    }

    public void studyOcean() {
        if (this.ocean != null) {
            System.out.println("not null");
            this.ocean.flow();
        } else {
            System.out.println("null");
        }
    }
}
