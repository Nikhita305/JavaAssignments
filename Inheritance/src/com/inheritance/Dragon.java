package com.inheritance;

public class Dragon extends Creature {
    public Dragon() {
        System.out.println("Running no-arg constructor of Dragon");
    }

    @Override
    public void habitat() {
        System.out.println("Dragon lives in volcanoes and mountains");
    }

    @Override
    public void diet() {
        System.out.println("Dragon eats livestock and magical herbs");
    }

    @Override
    public void sound() {
        System.out.println("Dragon roars fiercely");
    }

    @Override
    public void move() {
        System.out.println("Dragon flies with mighty wings");
    }

    @Override
    public void defense() {
        System.out.println("Dragon breathes fire for defense");
    }
}
