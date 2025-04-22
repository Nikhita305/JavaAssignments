package com.xworkz.interfaceC.internal;

public class SideBySideRefrigeratorImpl implements Refrigerator {
    public SideBySideRefrigeratorImpl() {
        super();
        System.out.println("no-arg constr in SideBySideRefrigeratorImpl");
    }

    @Override
    public void cool() {
        System.out.println("Cool in SideBySideRefrigeratorImpl");
    }
}
