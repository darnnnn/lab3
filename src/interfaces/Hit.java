package interfaces;

import humans.Aborigine;
import humans.Human;

public interface Hit<T extends Human> {
    void hit(T t);
}
