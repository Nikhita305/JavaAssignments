package com.inheritance;

public class Sunglasses extends Eyewear {
    public Sunglasses() {
        System.out.println("Running no-arg constructor of Sunglasses");
    }

    @Override
    public void type() {
        System.out.println("Eyewear: Sunglasses 🕶️");
    }

    @Override
    public void purpose() {
        System.out.println("Protects eyes from UV rays and adds style");
    }

    @Override
    public void frameMaterial() {
        System.out.println("Often lightweight plastic or metal for comfort");
    }

    @Override
    public void style() {
        System.out.println("Trendy styles: aviator, wayfarer, cat-eye, round");
    }

    @Override
    public void wearTime() {
        System.out.println("Usually worn outdoors during the day");
    }
}
