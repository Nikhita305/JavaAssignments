package com.xworkz.inheritanceTypes.multiLevel;

public class SmartWashingMachine extends WashingMachine {
    private boolean wifiEnabled;

    public SmartWashingMachine(String brand, int capacity, boolean wifiEnabled) {
        super(brand, capacity);
        this.wifiEnabled = wifiEnabled;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }
}
