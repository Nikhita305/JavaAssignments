package JavaAccessSpecifier.internal;

public class Cupboard {
    public String material = "Wood";
    private int shelves = 4;
    String color = "Brown";

    public void openCupboard() {
        System.out.println("Public: " + material );
    }

    private void shelfCount() {
        System.out.println("Private: " + shelves );
    }

    void showColor() {
        System.out.println("Default:  " + color);
    }
}
