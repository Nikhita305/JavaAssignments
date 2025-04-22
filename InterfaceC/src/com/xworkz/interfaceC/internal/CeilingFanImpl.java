package com.xworkz.interfaceC.internal;

public class CeilingFanImpl implements Fan {
    public CeilingFanImpl() {
        super();
        System.out.println("no-arg constr in CeilingFanImpl");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate in CeilingFanImpl");
    }
}

