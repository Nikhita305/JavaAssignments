package com.xworkz.interfaceC.internal;

public class DslrCameraImpl implements Camera {
    public DslrCameraImpl() {
        super();
        System.out.println("no-arg constr in DslrCameraImpl");
    }

    @Override
    public void capture() {
        System.out.println("Capture in DslrCameraImpl");
    }
}

