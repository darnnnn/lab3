package transport;
import humans.Human;
import world.Locations;

public interface Movable {
    void fillUp(Human h);
    void go(Locations location);
    void arrive(Locations location);
}
