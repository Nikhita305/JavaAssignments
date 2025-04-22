package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Company;

public class Employee {
    private Company company;

    public Employee(Company company) {
        this.company = company;
        System.out.println("constr in Employee");
    }

    public void work() {
        if (this.company != null) {
            System.out.println("not null");
            this.company.operate();
        } else {
            System.out.println("null");
        }
    }
}
