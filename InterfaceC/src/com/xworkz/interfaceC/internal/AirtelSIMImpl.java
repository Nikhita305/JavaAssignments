package com.xworkz.interfaceC.internal;

public class AirtelSIMImpl implements SIM {
    public AirtelSIMImpl() {
        super();
        System.out.println("no-arg constr in AirtelSIMImpl");
    }

    @Override
    public void activate() {
        System.out.println("Activate in AirtelSIMImpl");
    }
}
