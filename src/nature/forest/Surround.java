package nature.forest;

import humans.Squatter;
import teams.TeamOfPolicemen;

public interface Surround {
    default void surround(TeamOfPolicemen team, Squatter squatter){
        System.out.printf("%s surrounded them.%n", this);
    }
}
