package JavaAccessSpecifier.internal;

public class Mall {
    public String name = "Lulu";
    private int timing = 5;
    String Brand = "Max";

    public void Open(){
        System.out.println("Public " + this.name);
    }

    private void Close(){
        System.out.println("Private: Lift floor");
    }

    void Stores(){
        System.out.println("Default: Shopping");
    }
}
