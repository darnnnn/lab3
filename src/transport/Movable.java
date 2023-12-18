package transport;
import humans.Human;
import world.Locations;
import world.World;

public interface Movable {
    void fillUp(Human h);
    void go(Locations location);
    void arrive(Locations location);
}
