package transport;

import humans.Human;
import java.util.ArrayList;

public interface Movable {
    void fillUp(Human...h);
    void go();
    void arrive();
}
