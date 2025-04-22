package com.xworkz.interfaceC.internal;

public class WindowACImpl implements AirConditioner {
    public WindowACImpl() {
        super();
        System.out.println("no-arg constr in WindowACImpl");
    }

    @Override
    public void cool() {
        System.out.println("Cool in WindowACImpl");
    }
}

