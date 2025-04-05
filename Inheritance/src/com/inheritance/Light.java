package com.inheritance;

public class Light {
    public Light() {
        System.out.println("Running no-arg constructor of Light");
    }

    public void type() {
        System.out.println("This is a general light");
    }

    public void powerConsumption() {
        System.out.println("Lights consume electric power to produce brightness");
    }

    public void color() {
        System.out.println("Lights can emit white, yellow, or colored light");
    }

    public void usage() {
        System.out.println("Lights are used for illumination");
    }

    public void lifetime() {
        System.out.println("The lifetime of lights varies by type");
    }
}
