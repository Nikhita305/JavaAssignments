package Brush;

public class Pushpa {

    void useClip(Clip[] clip){

        System.out.println("running pushpa");
        for(Clip ref:clip) {
            System.out.println(ref);
            ref.hold();
        }
    }
}