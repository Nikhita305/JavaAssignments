package com.xworkz.interfaceC.internal;

public class QuadcopterDroneImpl implements Drone {
    public QuadcopterDroneImpl() {
        super();
        System.out.println("no-arg constr in QuadcopterDroneImpl");
    }

    @Override
    public void fly() {
        System.out.println("Fly in QuadcopterDroneImpl");
    }
}

