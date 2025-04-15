package com.xworkz.inheritanceTypes.heirarchical;

public class ActionMovie extends Movie {
    private String stuntCoordinator;

    public ActionMovie(String title, String director, String stuntCoordinator) {
        super(title, director);
        this.stuntCoordinator = stuntCoordinator;
    }

    public String getStuntCoordinator() {
        return stuntCoordinator;
    }
}

