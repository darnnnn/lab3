package transport;

import world.Locations;

public class Car extends Transport {
    public void go(Locations location){
        System.out.printf("%s got into the car.%n", String.join(", ", getNamesOfPassengers()));
        getPassengers().forEach(h->h.setLocation(location));
    }
}
