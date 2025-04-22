package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.WashingMachine;

public class LaundryRoom {
    private WashingMachine washingMachine;

    public LaundryRoom(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
        System.out.println("constr in LaundryRoom");
    }

    public void startWashing() {
        if (this.washingMachine != null) {
            System.out.println("not null");
            this.washingMachine.wash();
        } else {
            System.out.println("null");
        }
    }
}

