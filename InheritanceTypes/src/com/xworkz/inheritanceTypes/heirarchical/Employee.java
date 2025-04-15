package com.xworkz.inheritanceTypes.heirarchical;

public class Employee extends Human {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

