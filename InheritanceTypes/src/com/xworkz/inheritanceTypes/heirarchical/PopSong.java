package com.xworkz.inheritanceTypes.heirarchical;

public class PopSong extends Song {
    private String danceStyle;

    public PopSong(String title, String artist, String danceStyle) {
        super(title, artist);
        this.danceStyle = danceStyle;
    }

    public String getDanceStyle() {
        return danceStyle;
    }
}
