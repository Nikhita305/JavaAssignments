package com.xworkz.interfaceC.internal;

public class LEDscreenImpl implements Screen {
    public LEDscreenImpl() {
        super();
        System.out.println("no-arg constr in LEDscreenImpl");
    }

    @Override
    public void display() {
        System.out.println("Displaying content on LED Screen in LEDscreenImpl");
    }
}
