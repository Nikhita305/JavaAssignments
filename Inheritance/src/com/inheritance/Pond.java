package com.inheritance;

public class Pond extends Waterbody {
    public Pond() {
        System.out.println("🪷 A pond is forming...");
    }

    @Override
    public void name() {
        System.out.println("Waterbody: Pond");
    }

    @Override
    public void size() {
        System.out.println("Size: Small and shallow.");
    }

    @Override
    public void contains() {
        System.out.println("Contains still water, plants like lotus, and fish.");
    }

    @Override
    public void purpose() {
        System.out.println("Purpose: Often used for decoration, habitat, or farming.");
    }

    @Override
    public void beauty() {
        System.out.println("Pond adds calmness and natural charm.");
    }
}
