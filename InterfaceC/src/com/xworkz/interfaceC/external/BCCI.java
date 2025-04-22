package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Icc;

public class BCCI {
    private Icc icc;

    public BCCI(Icc icc) {
        this.icc = icc;
        System.out.println("Constructor in BCCI");
    }

    public void conductMatch() {
        if (icc != null) {
            System.out.println("ICC reference is not null");
            icc.fairPlay();
        } else {
            System.out.println("ICC reference is null");
        }
    }
}
