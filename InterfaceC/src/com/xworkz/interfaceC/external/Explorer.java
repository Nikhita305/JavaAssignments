package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Treasure;

public class Explorer {
    private Treasure treasure;

    public Explorer(Treasure treasure) {
        this.treasure = treasure;
        System.out.println("constr in Explorer");
    }

    public void uncoverTreasure() {
        if (this.treasure != null) {
            System.out.println("not null");
            this.treasure.discover();
        } else {
            System.out.println("null");
        }
    }
}
