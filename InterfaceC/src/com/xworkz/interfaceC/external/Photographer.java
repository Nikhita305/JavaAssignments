package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Camera;

public class Photographer {
    private Camera camera;

    public Photographer(Camera camera) {
        this.camera = camera;
        System.out.println("constr in Photographer");
    }

    public void takePicture() {
        if (this.camera != null) {
            System.out.println("not null");
            this.camera.capture();
        } else {
            System.out.println("null");
        }
    }
}

