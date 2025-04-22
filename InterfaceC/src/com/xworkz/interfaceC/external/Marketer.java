package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Brand;

public class Marketer {
    private Brand brand;

    public Marketer(Brand brand) {
        this.brand = brand;
        System.out.println("constr in Marketer");
    }

    public void runAdCampaign() {
        if (this.brand != null) {
            System.out.println("not null");
            this.brand.advertise();
        } else {
            System.out.println("null");
        }
    }
}

