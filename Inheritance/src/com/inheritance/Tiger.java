package com.inheritance;

public class Tiger extends Animal {
    public Tiger() {
        System.out.println("Running no-arg constructor of Tiger");
    }

    @Override
    public void eat() {
        System.out.println("Tiger hunts and eats its prey");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in the shade during the day");
    }

    @Override
    public void move() {
        System.out.println("Tiger moves stealthily through the forest");
    }

    @Override
    public void sound() {
        System.out.println("Tiger roars loudly");
    }

    @Override
    public void habitat() {
        System.out.println("Tiger lives in dense forests and grasslands");
    }
}
