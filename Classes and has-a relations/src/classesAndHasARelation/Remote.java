package classesAndHasARelation;

public class Remote {
    private int range;
    private Battery battery;

    public Remote(int range, Battery battery){
        this.range = range;
        this.battery = battery;
    }

    public void connect(){
        System.out.println("remote- Connect Method "+this.range+"\n");
        this.battery.charge();
    }
}
