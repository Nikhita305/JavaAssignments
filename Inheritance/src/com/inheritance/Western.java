package com.inheritance;

public class Western {
    public void vibe(Music music){
        music.pause();
        music.play();
        music.stop();
        music.stop();
        music.adjustVolume();
        music.selectTrack();

        if(music instanceof Classical){
            Classical classical = (Classical) music;
            classical.song();
        }
    }

}
