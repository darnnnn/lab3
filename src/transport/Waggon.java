package transport;

import humans.Human;
import humans.Policeman;
import java.util.ArrayList;

public class Waggon extends Transport {
    public void go(){
        if (getNames()!=null) System.out.println(String.join(", ", getNames()) + " got into the waggon.");
    }
}
