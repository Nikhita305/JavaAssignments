package com.xworkz.interfaceC.internal;

public class LaptopImpl implements Computer {
    public LaptopImpl() {
        super();
        System.out.println("no-arg constr in LaptopImpl");
    }

    @Override
    public void boot() {
        System.out.println("Boot in LaptopImpl");
    }
}

