package com.xworkz.interfaceC.internal;

public class SchoolImp implements School {
    public SchoolImp() {
        super();
        System.out.println("no-arg constr in SchoolImp");
    }

    @Override
    public void teach() {
        System.out.println("Teach in SchoolImp");
    }
}

