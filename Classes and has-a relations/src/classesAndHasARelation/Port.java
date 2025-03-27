package classesAndHasARelation;

public class Port {
    private PortType type;
    private int portNo;

    public Port(PortType type, int portNO){
        this.portNo = portNO;
        this.type = type;
    }

    public void Working(){
        System.out.println("port- Working Method "+this.portNo+"\n");
        this.type.fetch();
    }
}
