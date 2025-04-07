package com.inheritance;

public class Ganga extends River {
    public Ganga() {
        System.out.println("Running no-arg constructor of Ganga");
    }

    @Override
    public void name() {
        System.out.println("Ganga is one of the holiest rivers in India");
    }

    @Override
    public void length() {
        System.out.println("Ganga flows for about 2,525 kilometers");
    }

    @Override
    public void origin() {
        System.out.println("Ganga originates from the Gangotri Glacier in the Himalayas");
    }

    @Override
    public void flowDirection() {
        System.out.println("Ganga flows southeast into the Bay of Bengal");
    }

    @Override
    public void importance() {
        System.out.println("Ganga is spiritually, culturally, and economically significant");
    }

    public void cleanUpMission() {
        System.out.println("Namami Gange is a major cleanup mission for River Ganga");
    }

}
