package classesAndHasARelation;

public class Voltage {
    private int minVoltage;
    private int maxVoltage;

    public Voltage(int minVoltage, int maxVoltage){
        this.minVoltage = minVoltage;
        this.maxVoltage = maxVoltage;
    }

    public void reset(){
        System.out.println("voltage- Reset Method "+this.minVoltage+" "+this.maxVoltage+"\n");
    }
}
