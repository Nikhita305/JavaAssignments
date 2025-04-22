package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Wire;

public class Gadget {
    private Wire wire;

    public Gadget(Wire wire) {
        this.wire = wire;
        System.out.println("constr in Gadget");
    }

    public void useWire() {
        if (this.wire != null) {
            System.out.println("not null");
            this.wire.connect();
        } else {
            System.out.println("null");
        }
    }
}

