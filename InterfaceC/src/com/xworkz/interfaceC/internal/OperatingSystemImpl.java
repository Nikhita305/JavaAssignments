package com.xworkz.interfaceC.internal;

public class OperatingSystemImpl implements Laptop {

    public OperatingSystemImpl() {
        System.out.println("No-arg constructor in OperatingSystemImpl");
    }

    @Override
    public void process() {
        System.out.println("Laptop is processing with the installed Operating System");
    }
}
