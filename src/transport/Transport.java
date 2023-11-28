package transport;

import humans.Human;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Transport implements Movable{
    private final ArrayList<Human> passengers = new ArrayList<>();

    public ArrayList<Human> getPassengers(){
        return passengers;
    }
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        passengers.forEach(p->names.add(p.getName()));
        return names;
    }
    public void fillUp(Human...h){
        Collections.addAll(passengers, h);
    }
    public void arrive(){
        passengers.clear();
    }

}
