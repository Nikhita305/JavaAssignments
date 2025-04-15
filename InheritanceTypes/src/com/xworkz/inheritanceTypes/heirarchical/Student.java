package com.xworkz.inheritanceTypes.heirarchical;

public class Student extends Human {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

