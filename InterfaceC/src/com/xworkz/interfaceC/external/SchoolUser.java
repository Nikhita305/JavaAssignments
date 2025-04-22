package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.School;

public class SchoolUser {
    private School school;

    public SchoolUser(School school) {
        this.school = school;
        System.out.println("constr in SchoolUser");
    }

    public void execute() {
        if (this.school != null) {
            System.out.println("not null");
            this.school.teach();
        } else {
            System.out.println("null");
        }
    }
}

