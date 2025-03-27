package classesAndHasARelation;

public class Panel {
    private int width;
    private int height;

    public Panel(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void resize(){
        System.out.println("panel-Resize method "+this.width+" "+this.height+"\n");
    }
}
