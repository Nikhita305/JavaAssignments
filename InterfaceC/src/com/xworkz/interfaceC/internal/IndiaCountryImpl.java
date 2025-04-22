package com.xworkz.interfaceC.internal;

public class IndiaCountryImpl implements Country {
    public IndiaCountryImpl() {
        super();
        System.out.println("no-arg constr in IndiaCountryImpl");
    }

    @Override
    public void govern() {
        System.out.println("Govern in IndiaCountryImpl");
    }
}

