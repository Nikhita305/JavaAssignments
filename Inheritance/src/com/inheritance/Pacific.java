package com.inheritance;

public class Pacific extends Ocean {
    public Pacific() {
        System.out.println("Running no-arg constructor of Pacific");
    }

    @Override
    public void waves() {
        System.out.println("Pacific has calm and large waves");
    }

    @Override
    public void depth() {
        System.out.println("Pacific is the deepest ocean");
    }

    @Override
    public void temperature() {
        System.out.println("Pacific temperature is mostly warm");
    }

    @Override
    public void biodiversity() {
        System.out.println("Pacific has rich coral reefs and marine life");
    }

    @Override
    public void currents() {
        System.out.println("Pacific currents affect global climate");
    }
}
