package com.inheritance;

public class Earth extends Planet {
    public Earth() {
        System.out.println("Running no-arg constructor of Earth");
    }

    @Override
    public void rotate() {
        System.out.println("Earth rotates every 24 hours");
    }

    @Override
    public void revolve() {
        System.out.println("Earth revolves around the sun in 365 days");
    }

    @Override
    public void supportLife() {
        System.out.println("Earth supports a vast range of life");
    }

    @Override
    public void temperature() {
        System.out.println("Earth has moderate temperature for life");
    }

    @Override
    public void atmosphere() {
        System.out.println("Earth has oxygen-rich atmosphere");
    }
}
