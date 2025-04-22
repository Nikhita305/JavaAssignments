package com.xworkz.interfaceC.internal;

public class PacificOceanImpl implements Ocean {
    public PacificOceanImpl() {
        super();
        System.out.println("no-arg constr in PacificOceanImpl");
    }

    @Override
    public void flow() {
        System.out.println("The Pacific Ocean is flowing in PacificOceanImpl");
    }
}

