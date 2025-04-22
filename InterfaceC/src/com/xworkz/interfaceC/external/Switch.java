package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Fan;

public class Switch {
    private Fan fan;

    public Switch(Fan fan) {
        this.fan = fan;
        System.out.println("constr in Switch");
    }

    public void turnOn() {
        if (this.fan != null) {
            System.out.println("not null");
            this.fan.rotate();
        } else {
            System.out.println("null");
        }
    }
}
