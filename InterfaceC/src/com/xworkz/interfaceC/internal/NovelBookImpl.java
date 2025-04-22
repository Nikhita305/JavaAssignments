package com.xworkz.interfaceC.internal;

public class NovelBookImpl implements Book {
    public NovelBookImpl() {
        super();
        System.out.println("no-arg constr in NovelBookImpl");
    }

    @Override
    public void read() {
        System.out.println("Read in NovelBookImpl");
    }
}

