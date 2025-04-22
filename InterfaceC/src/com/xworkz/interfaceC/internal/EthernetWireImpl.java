package com.xworkz.interfaceC.internal;

public class EthernetWireImpl implements Wire {
    public EthernetWireImpl() {
        super();
        System.out.println("no-arg constr in EthernetWireImpl");
    }

    @Override
    public void connect() {
        System.out.println("Connect using EthernetWireImpl");
    }
}

