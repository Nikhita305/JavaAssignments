package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.SIM;

public class Mobile {
    private SIM sim;

    public Mobile(SIM sim) {
        this.sim = sim;
        System.out.println("constr in Mobile");
    }

    public void useSIM() {
        if (this.sim != null) {
            System.out.println("not null");
            this.sim.activate();
        } else {
            System.out.println("null");
        }
    }
}

