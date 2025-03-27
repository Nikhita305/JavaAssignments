package classesAndHasARelation;

public class Projector {
    private Len lens;
    private Lamp lamp;
    private Port port;
    private Wire wire;
    private Board board;
    private Button button;
    private Panel panel;
    private Remote remote;
    private Screw screw;

    public Projector(Len lens, Lamp lamp, Port port, Wire wire, Board board, Button button, Panel panel, Remote remote, Screw screw){
        this.lens = lens;
        this.lamp = lamp;
        this.port = port;
        this.wire = wire;
        this.board = board;
        this.button = button;
        this.panel = panel;
        this.remote = remote;
        this.screw = screw;
    }

    public void display(){
        System.out.println("Display Method");
        this.lens.zoom();
        this.lamp.turnOff();
        this.port.Working();
        this.wire.connect();
        this.board.reset();
        this.button.press();
        this.panel.resize();
        this.remote.connect();
        this.screw.replace();
    }
}
