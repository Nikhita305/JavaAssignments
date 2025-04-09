package com.xworkz.toStringRep;

public class Google {
    private String service;
    private String founder;
    private int year;

    public Google(String service, String founder, int year) {
        this.service = service;
        this.founder = founder;
        this.year = year;
        System.out.println("Google Constructor");
    }

    @Override
    public String toString() {
        return "Service: " + this.service + ", Founder: " + this.founder + ", Year: " + this.year;
    }
}
