package com.inheritance;

public class VirtualReality extends Technology {
    public VirtualReality() {
        System.out.println("Running no-arg constructor of VirtualReality");
    }

    @Override
    public void purpose() {
        System.out.println("VR creates immersive simulated environments");
    }

    @Override
    public void evolve() {
        System.out.println("VR is evolving with haptic feedback and full-body tracking");
    }

    @Override
    public void accessibility() {
        System.out.println("VR is now accessible through affordable headsets");
    }

    @Override
    public void innovation() {
        System.out.println("VR innovation includes training, gaming, and therapy");
    }

    @Override
    public void impact() {
        System.out.println("VR impacts education, healthcare, and entertainment");
    }
}
