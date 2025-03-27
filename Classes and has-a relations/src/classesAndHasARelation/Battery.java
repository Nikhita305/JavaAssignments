package classesAndHasARelation;

public class Battery {
    private int current;
    private Voltage voltage;

    public Battery(int current, Voltage voltage){
        this.current = current;
        this.voltage = voltage;
    }

    public void charge(){
        System.out.println("battery - Charge Mathod "+this.current+"\n");
        this.voltage.reset();
    }
}
