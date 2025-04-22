package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Charger;

public class Phone {
    private Charger charger;

    public Phone(Charger charger) {
        this.charger = charger;
        System.out.println("constr in Phone");
    }

    public void charge() {
        if (this.charger != null) {
            System.out.println("not null");
            this.charger.supplyPower();
        } else {
            System.out.println("null");
        }
    }
}
