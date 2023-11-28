package interfaces;

import exception.DeadException;
import interactionWithHuman.Figurine;

public interface Take {
    void take(Figurine f) throws DeadException;
}
