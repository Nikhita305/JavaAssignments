package com.inheritance;

public class Hammer extends Tool {
    public Hammer() {
        System.out.println("Running no-arg constructor of Hammer");
    }

    @Override
    public void name() {
        System.out.println("Tool: Hammer");
    }

    @Override
    public void material() {
        System.out.println("Hammer is made of steel with a wooden or rubber handle");
    }

    @Override
    public void use() {
        System.out.println("Hammer is used for pounding or extracting nails");
    }

    @Override
    public void weight() {
        System.out.println("Hammer weighs between 200g to 1kg typically");
    }

    @Override
    public void maintenance() {
        System.out.println("Keep the hammer clean and check handle for cracks");
    }
}
