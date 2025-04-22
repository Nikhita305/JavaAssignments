package com.xworkz.interfaceC.internal;

public class TechCompanyImpl implements Company {
    public TechCompanyImpl() {
        super();
        System.out.println("no-arg constr in TechCompanyImpl");
    }

    @Override
    public void operate() {
        System.out.println("Tech Company operating in TechCompanyImpl");
    }
}

