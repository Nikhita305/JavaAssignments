package com.xworkz.interfaceC.internal;

public class TubeLightImpl implements Light {
    public TubeLightImpl() {
        super();
        System.out.println("no-arg constr in TubeLightImpl");
    }

    @Override
    public void glow() {
        System.out.println("Glow in TubeLightImpl");
    }
}

