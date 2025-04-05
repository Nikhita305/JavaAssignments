package com.inheritance;

public class Lens extends OpticalItem {
    public Lens() {
        System.out.println(" Lens constructor called");
    }

    @Override
    public void focusLight() {
        System.out.println("Lens bends light rays to a focal point.");
    }

    @Override
    public void magnify() {
        System.out.println("Lens magnifies the image of small objects.");
    }

    @Override
    public void assistVision() {
        System.out.println("Lens corrects visual impairments like myopia.");
    }

    @Override
    public void material() {
        System.out.println("Lens is made from specialized optical materials.");
    }

    @Override
    public void usage() {
        System.out.println("Lens is used in spectacles, telescopes, and cameras.");
    }
}
