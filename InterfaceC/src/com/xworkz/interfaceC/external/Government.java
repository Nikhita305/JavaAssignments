package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Constitution;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution) {
        this.constitution = constitution;
        System.out.println("Constructor in Government");
    }

    public void enforceLaws() {
        if (constitution != null) {
            System.out.println("Constitution reference is not null");
            constitution.followLaws();
        } else {
            System.out.println("Constitution reference is null");
        }
    }
}
