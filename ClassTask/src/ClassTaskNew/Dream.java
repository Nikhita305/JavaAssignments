package ClassTaskNew;

import ClassTask.Bored;

public class Dream {
    Bored bored = new Bored();

    public void night() {
        if(bored!=null) {
            System.out.println(bored.num);
            bored.students();
        }
    }
}
