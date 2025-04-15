package com.xworkz.inheritanceTypes.heirarchical;

public class ComedyMovie extends Movie {
    private String leadComedian;

    public ComedyMovie(String title, String director, String leadComedian) {
        super(title, director);
        this.leadComedian = leadComedian;
    }

    public String getLeadComedian() {
        return leadComedian;
    }
}

