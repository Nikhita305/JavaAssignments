package com.xworkz.inheritanceTypes.multiLevel;

public class Employee extends Person {
    private int employeeId;

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
