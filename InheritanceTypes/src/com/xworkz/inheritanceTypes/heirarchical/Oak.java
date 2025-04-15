package com.xworkz.inheritanceTypes.heirarchical;

public class Oak extends Wood {
    private int age;

    public Oak(String type, double weight, int age) {
        super(type, weight);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

