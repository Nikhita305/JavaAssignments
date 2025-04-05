package Main;

import Main.internal.Blood;
import Main.internal.Use;

public class BloodRunner {
    public static void main(String[] args){

        Blood blood = new Blood();
        Use use = new Use();
        blood.setGroup("AB+");
        use.UseBlood(blood);

    }
}
