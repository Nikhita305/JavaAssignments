package com.inheritance;

public class Sunflower extends Plant {
    public Sunflower() {
        System.out.println("Running no-arg constructor of Sunflower");
    }

    @Override
    public void grow() {
        System.out.println("Sunflower grows tall and faces the sun");
    }

    @Override
    public void absorbWater() {
        System.out.println("Sunflower uses its long roots to absorb water");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Sunflower uses its broad leaves to photosynthesize");
    }

    @Override
    public void reproduce() {
        System.out.println("Sunflower reproduces through seeds in its center");
    }

    @Override
    public void survive() {
        System.out.println("Sunflower survives well in sunny climates");
    }

    public void color() {
        System.out.println("Sunflower yellow color");
    }
}
