package com.inheritance;

public class King extends Ruler {
    public King() {
        System.out.println(" King constructor called");
    }

    @Override
    public void rule() {
        System.out.println("King rules with strength and justice.");
    }

    @Override
    public void protect() {
        System.out.println("King defends the kingdom from enemies.");
    }

    @Override
    public void strategize() {
        System.out.println("King plans conquests and treaties.");
    }

    @Override
    public void lead() {
        System.out.println("King leads in war and peace.");
    }

    @Override
    public void legacy() {
        System.out.println("King is remembered for his reign.");
    }
}
