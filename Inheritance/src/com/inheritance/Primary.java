package com.inheritance;

public class Primary {
    public void homework(School school){
        school.breakTime();
        school.close();
        school.exam();
        school.open();
        school.teach();

        if(school instanceof HighSchool){
            HighSchool highSchool = (HighSchool) school;
            highSchool.work();
        }
    }
}
