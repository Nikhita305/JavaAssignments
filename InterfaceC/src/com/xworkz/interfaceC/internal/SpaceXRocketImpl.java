package com.xworkz.interfaceC.internal;

public class SpaceXRocketImpl implements Rocket {
    public SpaceXRocketImpl() {
        super();
        System.out.println("no-arg constr in SpaceXRocketImpl");
    }

    @Override
    public void launch() {
        System.out.println("Launching SpaceX Rocket in SpaceXRocketImpl");
    }
}
