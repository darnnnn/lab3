package transport;
import humans.Human;

public interface Movable {
    void fillUp(Human...h);
    void go();
    void arrive();
}
