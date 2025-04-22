package com.xworkz.interfaceC.internal;

public class SmartLightImpl implements SmartHomeDevice {
    public SmartLightImpl() {
        super();
        System.out.println("no-arg constr in SmartLightImpl");
    }

    @Override
    public void activate() {
        System.out.println("SmartLight activated in SmartLightImpl");
    }
}
