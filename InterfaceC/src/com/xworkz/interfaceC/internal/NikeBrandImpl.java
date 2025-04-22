package com.xworkz.interfaceC.internal;

public class NikeBrandImpl implements Brand {
    public NikeBrandImpl() {
        super();
        System.out.println("no-arg constr in NikeBrandImpl");
    }

    @Override
    public void advertise() {
        System.out.println("Advertising Nike in NikeBrandImpl");
    }
}

