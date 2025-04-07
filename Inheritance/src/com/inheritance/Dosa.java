package com.inheritance;

public class Dosa extends Breakfast {

    public Dosa() {
        System.out.println("Running no-arg constructor");
    }

    @Override
    public void prepare() {
        System.out.println("Running prepare");
    }

    @Override
    public void serve() {
        System.out.println("Running serve");
    }

    @Override
    public void eat() {
        System.out.println("Running eat");
    }

    @Override
    public void cleanUp() {
        System.out.println("Running cleanUp");
    }

    public void color(){
        System.out.println("Running color");
    }
}
