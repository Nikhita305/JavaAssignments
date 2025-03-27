package classesAndHasARelation;

public class PortType {
    private String shape;
    private int noOfPorts;

    public PortType(String shape, int noOfPorts){
        this.shape = shape;
        this.noOfPorts = noOfPorts;
    }

    public void fetch(){
        System.out.println("porttype-Fetch Method"+ this.shape+" "+this.noOfPorts+"\n");
    }
}
