package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.China;

public class ChineseGovernment {
    private China china;

    public ChineseGovernment(China china) {
        this.china = china;
        System.out.println("constr in ChineseGovernment");
    }

    public void implementPolicies() {
        if (this.china != null) {
            System.out.println("not null");
            this.china.respectRules();
        } else {
            System.out.println("null");
        }
    }
}

