package classesAndHasARelation;

public class Board {
    private char size;
    private Capacitor capacitor;

    public Board(char size, Capacitor capacitor){
        this.size = size;
        this.capacitor = capacitor;
    }

    public void reset(){
        System.out.println("board - Reset Method "+this.size+"\n");
        this.capacitor.energy();
    }
}
