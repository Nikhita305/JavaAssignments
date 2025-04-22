package com.xworkz.interfaceC.internal;

public class LaserPrinterImpl implements Printer {
    public LaserPrinterImpl() {
        super();
        System.out.println("no-arg constr in LaserPrinterImpl");
    }

    @Override
    public void print() {
        System.out.println("Print in LaserPrinterImpl");
    }
}

