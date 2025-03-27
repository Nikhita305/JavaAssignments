package classesAndHasARelation;

public class Capacitor {
    private int voltage;
    private int charge;

    public Capacitor(int voltage, int charge){
        this.voltage = voltage;
        this.charge = charge;
    }

    public void energy(){
        System.out.println("capacitor- Energy method "+this.voltage+" "+this.charge+"\n");
    }
}
