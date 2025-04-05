package com.inheritance;

public class Transport {
    public Transport() {
        System.out.println("Running no-arg constructor of Transport");
    }

    public void type() {
        System.out.println("This is a mode of transport");
    }

    public void speed() {
        System.out.println("Transport has varying speeds");
    }

    public void capacity() {
        System.out.println("Transport can carry different numbers of passengers");
    }

    public void cost() {
        System.out.println("Cost of travel varies by transport");
    }

    public void environmentImpact() {
        System.out.println("Some transports are eco-friendly, others are not");
    }
}
