package com.inheritance;

public class WiFi extends Network {
    public WiFi() {
        System.out.println("Running no-arg constructor of WiFi");
    }

    @Override
    public void type() {
        System.out.println("WiFi is a wireless network");
    }

    @Override
    public void speed() {
        System.out.println("WiFi offers speeds up to 1 Gbps");
    }

    @Override
    public void range() {
        System.out.println("WiFi range is about 100-150 feet indoors");
    }

    @Override
    public void security() {
        System.out.println("WiFi uses WPA3 encryption for secure access");
    }

    @Override
    public void connect() {
        System.out.println("Multiple smart devices connect to WiFi");
    }
}
