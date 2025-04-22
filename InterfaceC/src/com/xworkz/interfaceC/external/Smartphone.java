package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Android;

public class Smartphone {
    private Android android;

    public Smartphone(Android android) {
        this.android = android;
        System.out.println("constr in Smartphone");
    }

    public void runAndroid() {
        if (this.android != null) {
            System.out.println("not null");
            this.android.operate();
        } else {
            System.out.println("null");
        }
    }
}

