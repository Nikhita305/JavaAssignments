package com.inheritance;

public class Drawing {
    public void draw(Art art){
        art.create();
        art.display();
        art.inspire();
        art.preserve();
        art.sell();

        if(art instanceof Painting){
            Painting painting = (Painting) art;
            painting.destroy();
        }
    }
}
