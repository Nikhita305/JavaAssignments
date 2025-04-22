package com.xworkz.interfaceC.internal;

public class WiFiHotspotImpl implements Hotspot {
    public WiFiHotspotImpl() {
        super();
        System.out.println("no-arg constr in WiFiHotspotImpl");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to WiFi Hotspot in WiFiHotspotImpl");
    }
}

