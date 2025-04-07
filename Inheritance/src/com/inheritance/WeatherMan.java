package com.inheritance;

public class WeatherMan {
    public void report(Season season) {
        season.name();
        season.duration();
        season.temperature();
        season.activities();
        season.clothing();

        if (season instanceof Summer) {
            Summer summer = (Summer) season;
            summer.heatAlert();
        }
    }
}
