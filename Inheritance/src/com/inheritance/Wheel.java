package com.inheritance;

public class Wheel extends Part {
    public Wheel() {
        System.out.println("🛞 Wheel constructor called");
    }

    @Override
    public void manufacture() {
        System.out.println("Wheel is being cast and molded...");
    }

    @Override
    public void test() {
        System.out.println("Wheel is tested for balance and durability...");
    }

    @Override
    public void ship() {
        System.out.println("Wheel is packed and ready to roll!");
    }

    @Override
    public void assemble() {
        System.out.println("Wheel is fitted onto the vehicle...");
    }

    @Override
    public void label() {
        System.out.println("Wheel is labeled with specs and brand.");
    }
}
