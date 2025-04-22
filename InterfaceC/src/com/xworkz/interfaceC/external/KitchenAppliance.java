package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Refrigerator;

public class KitchenAppliance {
    private Refrigerator refrigerator;

    public KitchenAppliance(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
        System.out.println("constr in KitchenAppliance");
    }

    public void startCooling() {
        if (this.refrigerator != null) {
            System.out.println("not null");
            this.refrigerator.cool();
        } else {
            System.out.println("null");
        }
    }
}

