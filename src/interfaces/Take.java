package interfaces;

import exception.DeadException;
import interactionWithPoliceman.Figurine;

public interface Take {
    void take(Figurine f) throws DeadException;
}
