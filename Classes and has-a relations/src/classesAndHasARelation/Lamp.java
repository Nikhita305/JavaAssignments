package classesAndHasARelation;

public class Lamp {
    private String shape;
    private Waranty waranty;

    public Lamp(String shape, Waranty waranty){
        this.shape = shape;
        this.waranty = waranty;
    }

    public void turnOff(){
        System.out.println("lamp-TurnOff Method" + this.shape+"\n");
        this.waranty.expiry();
    }
}
