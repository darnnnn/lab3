package interfaces.for_fight;

import humans.Human;

public interface Hit<T extends Human> {
    void hit(T t);
}
