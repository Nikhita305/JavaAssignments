package com.inheritance;

public class Summer extends Season {
    public Summer() {
        System.out.println("Running no-arg constructor of Summer");
    }

    @Override
    public void name() {
        System.out.println("This season is Summer");
    }

    @Override
    public void duration() {
        System.out.println("Summer usually lasts from March to June");
    }

    @Override
    public void temperature() {
        System.out.println("Summer has high temperatures and heat");
    }

    @Override
    public void activities() {
        System.out.println("People enjoy swimming, vacations, and mangoes in summer");
    }

    @Override
    public void clothing() {
        System.out.println("Light and cotton clothes are worn during summer");
    }

    public void heatAlert() {
        System.out.println("Heatwave alert: Stay hydrated and avoid peak hours");
    }

}
