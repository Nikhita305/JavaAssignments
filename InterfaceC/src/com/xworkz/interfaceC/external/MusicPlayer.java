package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Speaker;

public class MusicPlayer {
    private Speaker speaker;

    public MusicPlayer(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("constr in MusicPlayer");
    }

    public void play() {
        if (this.speaker != null) {
            System.out.println("not null");
            this.speaker.playSound();
        } else {
            System.out.println("null");
        }
    }
}

