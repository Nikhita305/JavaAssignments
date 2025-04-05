package com.inheritance;

public class Metro extends Transport {
    public Metro() {
        System.out.println("Running no-arg constructor of Metro");
    }

    @Override
    public void type() {
        System.out.println("This is a rapid transit system called Metro");
    }

    @Override
    public void speed() {
        System.out.println("Metro trains are fast and efficient for city travel");
    }

    @Override
    public void capacity() {
        System.out.println("Metro can carry hundreds of passengers at once");
    }

    @Override
    public void cost() {
        System.out.println("Metro is affordable and cost-effective");
    }

    @Override
    public void environmentImpact() {
        System.out.println("Metro is eco-friendly and reduces traffic pollution");
    }
}
