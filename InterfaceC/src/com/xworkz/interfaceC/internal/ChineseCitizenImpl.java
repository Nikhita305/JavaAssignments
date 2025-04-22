package com.xworkz.interfaceC.internal;

public class ChineseCitizenImpl implements China {
    public ChineseCitizenImpl() {
        super();
        System.out.println("no-arg constr in ChineseCitizenImpl");
    }

    @Override
    public void respectRules() {
        System.out.println("Respect rules in ChineseCitizenImpl");
    }
}

