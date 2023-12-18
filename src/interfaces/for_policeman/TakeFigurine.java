package interfaces.for_policeman;

import exception.DeadException;
import interactionWithHuman.Figurine;

public interface TakeFigurine {
    void takeFigurine(Figurine f) throws DeadException;
}
