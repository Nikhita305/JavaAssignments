public class ExplicitConstructor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Creating Set " + i);
            
            Balloon b = new Balloon();
            Keyboard k = new Keyboard();
            Switch s = new Switch();
            Penguin p = new Penguin();
            Apple a = new Apple();
        }
    }
}