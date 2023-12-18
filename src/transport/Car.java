package transport;

import world.Locations;

public class Car extends Transport {
    public void go(Locations location){
        System.out.printf("%s got into the car.%n", getNamesOfPassengers());
        getPassengers().forEach(h->h.setLocation(location));
    }
}
