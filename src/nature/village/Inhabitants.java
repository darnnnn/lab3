package nature.village;

import java.sql.SQLOutput;

public class Inhabitants {
    public void goOutside(Huts huts){
        System.out.println("Hysterical inhabitants jumped out of " + huts.getAmount() + " huts to meet them.");
    }
    public void say(String s){
        System.out.println("Inhabitants said: " + s);
    }
}
