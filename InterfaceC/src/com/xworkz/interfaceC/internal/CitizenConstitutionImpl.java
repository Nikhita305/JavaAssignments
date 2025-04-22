package com.xworkz.interfaceC.internal;


public class CitizenConstitutionImpl implements Constitution {

    public CitizenConstitutionImpl() {
        System.out.println("No-arg constructor in CitizenConstitutionImpl");
    }

    @Override
    public void followLaws() {
        System.out.println("Citizen is following the Constitution's laws.");
    }
}
