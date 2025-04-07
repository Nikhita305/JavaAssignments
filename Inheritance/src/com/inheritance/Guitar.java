package com.inheritance;

public class Guitar extends Instrument {

    public Guitar() {
        System.out.println("Running no-arg constructor of Guitar");
    }

   @Override
    public void play() {
        System.out.println("Running play");
    }

    @Override
    public void tune() {
        System.out.println("Running tune");
    }

    @Override
    public void store() {
        System.out.println("Running store");
    }

    @Override
    public void polish() {
        System.out.println("Running polish");
    }

    @Override
    public void carry() {
        System.out.println("Running carry");
    }

    public void clean(){
        System.out.println("Running clean");
    }
}