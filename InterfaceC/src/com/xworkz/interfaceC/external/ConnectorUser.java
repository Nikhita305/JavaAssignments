package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Connector;

public class ConnectorUser {
    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector = connector;
        System.out.println("constr in ConnectorUser");
    }
    public void execute(){
        if(this.connector != null){
            System.out.println("not null");
            this.connector.connect();
        }
        else
            System.out.println("null");
    }
}
