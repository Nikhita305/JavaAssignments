package com.xworkz.interfaceC.internal;

public class WiFiNetworkImpl implements Network {
    public WiFiNetworkImpl() {
        super();
        System.out.println("no-arg constr in WiFiNetworkImpl");
    }

    @Override
    public void connect() {
        System.out.println("Connect to WiFiNetworkImpl");
    }
}

