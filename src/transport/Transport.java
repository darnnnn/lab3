package transport;

import humans.Human;
import java.util.ArrayList;

public abstract class Transport implements Movable{
    private final ArrayList<Human> passengers = new ArrayList<>();
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        passengers.forEach(p->names.add(p.getName()));
        return names;
    }
    public void fillUp(Human h){
        passengers.add(h);
    }
    public void arrive(){
        passengers.clear();
    }

}
