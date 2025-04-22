package com.xworkz.interfaceC.internal;

public class PhotoFrameImpl implements Frame {
    public PhotoFrameImpl() {
        super();
        System.out.println("no-arg constr in PhotoFrameImpl");
    }

    @Override
    public void display() {
        System.out.println("Display in PhotoFrameImpl");
    }
}

