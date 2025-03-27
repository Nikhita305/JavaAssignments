package classesAndHasARelation;

public class Wire {
    private String color;
    private Quality quality;

    public Wire(String color, Quality quality){
        this.color = color;
        this.quality = quality;
    }

    public void connect(){
        System.out.println("wire-Connect Method "+this.color+"\n");
        this.quality.evaluate();
    }
}
