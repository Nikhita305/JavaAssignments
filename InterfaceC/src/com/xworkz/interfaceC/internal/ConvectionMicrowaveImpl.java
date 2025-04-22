package com.xworkz.interfaceC.internal;

public class ConvectionMicrowaveImpl implements Microwave {
    public ConvectionMicrowaveImpl() {
        super();
        System.out.println("no-arg constr in ConvectionMicrowaveImpl");
    }

    @Override
    public void cook() {
        System.out.println("Cook in ConvectionMicrowaveImpl");
    }
}
