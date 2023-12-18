package transport;

import humans.Human;
import world.Locations;
import java.util.ArrayList;

public abstract class Transport implements Movable{
    private final ArrayList<Human> passengers;
    {passengers = new ArrayList<>();}
    public ArrayList<Human> getPassengers(){
        return passengers;
    }
    public String getNamesOfPassengers(){
        ArrayList<String> names = new ArrayList<>();
        passengers.forEach(p->names.add(p.getName()));
        return String.join(", ", names);
    }
    public void fillUp(Human h){
        passengers.add(h);
    }
    public void arrive(Locations location){
        passengers.forEach(h->h.setLocation(location));
        passengers.clear();
    }

}
