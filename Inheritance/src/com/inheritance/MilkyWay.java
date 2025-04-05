package com.inheritance;

public class MilkyWay extends Galaxy {
    public MilkyWay() {
        System.out.println("Running no-arg constructor of MilkyWay");
    }

    @Override
    public void rotate() {
        System.out.println("MilkyWay rotates every 250 million years");
    }

    @Override
    public void expand() {
        System.out.println("MilkyWay is slowly merging with Andromeda");
    }

    @Override
    public void containStars() {
        System.out.println("MilkyWay contains over 100 billion stars");
    }

    @Override
    public void emitLight() {
        System.out.println("MilkyWay emits light visible as a band in the night sky");
    }

    @Override
    public void hasBlackHole() {
        System.out.println("MilkyWay has a black hole at its center called Sagittarius A*");
    }
}
