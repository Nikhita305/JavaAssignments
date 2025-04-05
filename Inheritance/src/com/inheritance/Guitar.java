package com.inheritance;

public class Guitar extends Instrument {

    public Guitar() {
        System.out.println("Running no-arg constructor of Guitar");
    }

   @Override
    public void play() {
        System.out.println("Running play in Instrument");
    }

    @Override
    public void tune() {
        System.out.println("Running tune in Instrument");
    }

    @Override
    public void store() {
        System.out.println("Running store in Instrument");
    }

    @Override
    public void polish() {
        System.out.println("Running polish in Instrument");
    }

    @Override
    public void carry() {
        System.out.println("Running carry in Instrument");
    }
}