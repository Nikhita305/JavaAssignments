package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Hotspot;

public class HotspotUser {
    private Hotspot hotspot;

    public HotspotUser(Hotspot hotspot) {
        this.hotspot = hotspot;
        System.out.println("constr in User");
    }

    public void accessInternet() {
        if (this.hotspot != null) {
            System.out.println("not null");
            this.hotspot.connect();
        } else {
            System.out.println("null");
        }
    }
}
