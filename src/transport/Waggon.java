package transport;

import world.Locations;
import world.World;

public class Waggon extends Transport {
    public void go(Locations location){
        System.out.printf("%s got into the waggon.%n", getNamesOfPassengers());
        getPassengers().forEach(h->h.setLocation(location));
    }
}
