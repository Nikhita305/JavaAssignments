package com.inheritance;

public class Linguist {
    public void research(Language language) {
        language.name();
        language.origin();
        language.script();
        language.speakers();
        language.importance();

        if (language instanceof Kannada) {
            Kannada kannada = (Kannada) language;
            kannada.poets();
        }
    }
}
