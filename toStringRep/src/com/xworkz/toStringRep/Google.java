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

    @Override
    public int hashCode() {
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Google) {
                System.out.println("Ref,compare");
                Google google = this;
                Google google1 = (Google) obj;
                if (google.service.equals(google1.service) && google.founder.equals(google1.founder)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
