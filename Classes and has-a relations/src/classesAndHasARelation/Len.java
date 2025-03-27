package classesAndHasARelation;

public class Len {
    private int pixel;
    private int price;

    public Len(int pixel, int price){
        this.pixel = pixel;
        this.price=price;
    }

    public void zoom() {
        System.out.println(" Len - zoom method " + this.pixel +" "+this.price+"\n");

    }
}
