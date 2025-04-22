package com.xworkz.interfaceC.internal;

public class CityMetroImpl implements Metro {
    public CityMetroImpl() {
        super();
        System.out.println("no-arg constr in CityMetroImpl");
    }

    @Override
    public void operate() {
        System.out.println("Operating City Metro in CityMetroImpl");
    }
}
