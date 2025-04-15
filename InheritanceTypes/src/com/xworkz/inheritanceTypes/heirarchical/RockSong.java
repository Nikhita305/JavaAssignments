package com.xworkz.inheritanceTypes.heirarchical;

public class RockSong extends Song {
    private String guitarType;

    public RockSong(String title, String artist, String guitarType) {
        super(title, artist);
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return guitarType;
    }
}

