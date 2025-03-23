package Brush;

public class Clip {
    Color color;

    Clip(Color color){
        this.color = color;
        System.out.println("color is "+this.color);
    }
    void hold(){
        System.out.println("Running");
    }
}
