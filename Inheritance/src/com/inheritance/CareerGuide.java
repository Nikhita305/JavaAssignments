package com.inheritance;

public class CareerGuide {
    public void advise(Profession profession) {
        profession.type();
        profession.skill();
        profession.workHours();
        profession.income();
        profession.responsibility();

        if (profession instanceof Engineering) {
            Engineering engineering = (Engineering) profession;
            engineering.branch();
        }
    }
}
