package com.xworkz.interfaceC.internal;

public class MountainBikeImpl implements Bike {
    public MountainBikeImpl() {
        super();
        System.out.println("no-arg constr in MountainBikeImpl");
    }

    @Override
    public void race() {
        System.out.println("Racing with MountainBikeImpl");
    }
}

