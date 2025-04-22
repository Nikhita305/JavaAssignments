package com.xworkz.interfaceC.internal;

public class SamsungAndroidImpl implements Android {
    public SamsungAndroidImpl() {
        super();
        System.out.println("no-arg constr in SamsungAndroidImpl");
    }

    @Override
    public void operate() {
        System.out.println("Operate in SamsungAndroidImpl");
    }
}
