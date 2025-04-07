package com.inheritance;

public class Therapist {
    public void analyze(Emotion emotion) {
        emotion.type();
        emotion.expression();
        emotion.impact();
        emotion.duration();
        emotion.intensity();

        if (emotion instanceof Happiness) {
            Happiness happiness = (Happiness) emotion;
            happiness.reason();
        }
    }
}
