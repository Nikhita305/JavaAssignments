package com.xworkz.interfaceC.internal;

public class SportsCarImpl implements Car {
    public SportsCarImpl() {
        super();
        System.out.println("no-arg constr in SportsCarImpl");
    }

    @Override
    public void drive() {
        System.out.println("Drive in SportsCarImpl");
    }
}
