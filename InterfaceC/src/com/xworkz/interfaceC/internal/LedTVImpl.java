package com.xworkz.interfaceC.internal;

public class LedTVImpl implements TV {
    public LedTVImpl() {
        super();
        System.out.println("no-arg constr in LedTVImpl");
    }

    @Override
    public void play() {
        System.out.println("Play in LedTVImpl");
    }
}

