package com.inheritance;

public class Dosa extends Breakfast {

    public Dosa() {
        System.out.println("Running no-arg constructor of Dosa");
    }

    @Override
    public void prepare() {
        System.out.println("Running prepare in Dosa");
    }

    @Override
    public void serve() {
        System.out.println("Running serve in Dosa");
    }

    @Override
    public void eat() {
        System.out.println("Running eat in Dosa");
    }

    @Override
    public void cleanUp() {
        System.out.println("Running cleanUp in Dosa");
    }
}
