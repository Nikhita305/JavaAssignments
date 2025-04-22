package com.xworkz.interfaceC.internal;

public class CommunicationSatelliteImpl implements Satellite {
    public CommunicationSatelliteImpl() {
        super();
        System.out.println("no-arg constr in CommunicationSatelliteImpl");
    }

    @Override
    public void transmit() {
        System.out.println("Transmit in CommunicationSatelliteImpl");
    }
}

