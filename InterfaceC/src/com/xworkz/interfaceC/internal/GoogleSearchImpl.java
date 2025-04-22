package com.xworkz.interfaceC.internal;

public class GoogleSearchImpl implements Google {
    public GoogleSearchImpl() {
        super();
        System.out.println("no-arg constr in GoogleSearchImpl");
    }

    @Override
    public void search() {
        System.out.println("Searching with Google in GoogleSearchImpl");
    }
}

