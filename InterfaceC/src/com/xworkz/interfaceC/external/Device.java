package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Network;

public class Device {
    private Network network;

    public Device(Network network) {
        this.network = network;
        System.out.println("constr in Device");
    }

    public void useNetwork() {
        if (this.network != null) {
            System.out.println("not null");
            this.network.connect();
        } else {
            System.out.println("null");
        }
    }
}
