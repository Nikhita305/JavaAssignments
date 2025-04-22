package com.xworkz.interfaceC.internal;

public class ConnectorImp implements Connector {
    public ConnectorImp(){
        super();
        System.out.println("no-arg constr in ConnectorImp");
    }
    @Override
    public void connect(){
        System.out.println("Connect in ConnectorImp");
    }
}
