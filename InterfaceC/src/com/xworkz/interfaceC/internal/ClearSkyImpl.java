package com.xworkz.interfaceC.internal;

public class ClearSkyImpl implements Sky {
    public ClearSkyImpl() {
        super();
        System.out.println("no-arg constr in ClearSkyImpl");
    }

    @Override
    public void displayWeather() {
        System.out.println("The weather is clear in ClearSkyImpl");
    }
}
