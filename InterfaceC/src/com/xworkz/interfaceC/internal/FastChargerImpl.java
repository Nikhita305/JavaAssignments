package com.xworkz.interfaceC.internal;

public class FastChargerImpl implements Charger {
    public FastChargerImpl() {
        super();
        System.out.println("no-arg constr in FastChargerImpl");
    }

    @Override
    public void supplyPower() {
        System.out.println("Supply power using FastChargerImpl");
    }
}

