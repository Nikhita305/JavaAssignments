package com.inheritance;

public class Diwali extends Festival {
    public Diwali() {
        System.out.println("Running no-arg constructor of Diwali");
    }

    @Override
    public void celebrate() {
        System.out.println("Celebrating Diwali with fireworks and lights");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating with diyas and rangoli");
    }

    @Override
    public void gather() {
        System.out.println("Families gather for Lakshmi puja");
    }

    @Override
    public void eat() {
        System.out.println("Eating sweets like laddus and barfi");
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoying Diwali night with crackers");
    }

    public void fire() {
        System.out.println("Enjoying Diwali night with fire crackers");
    }
}
