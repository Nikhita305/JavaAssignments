package classesAndHasARelation;

public class RunnerMain {
    public static void main(String[] args){

        Waranty waranty = new Waranty(1,31);
        Lamp lamp = new Lamp("Round",waranty);

        Len len = new Len(56,5000);

        PortType portType = new PortType("Rectangle",3);
        Port port = new Port(portType,509);

        Quality quality = new Quality("Metal", 8);
        Wire wire = new Wire("Black",quality);

        Capacitor capacitor = new Capacitor(5,63);
        Board board = new Board('M',capacitor);

        Material material = new Material("Plastic","Smooth");
        Button button = new Button("Submit",material);

        Panel panel = new Panel(100,50);

        Voltage voltage = new Voltage(5,500);
        Battery battery = new Battery(50, voltage);
        Remote remote = new Remote(5000,battery);

        Screw screw = new Screw("Steel",30);

        Projector projector=new Projector(len,lamp,port,wire,board,button,panel,remote,screw);
        projector.display();





    }
}
