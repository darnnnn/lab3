package nature.forest;

import humans.Squatter;
import interactionWithHuman.Emotions;
import teams.TeamOfPolicemen;

public interface Appear {
    default void appear(TeamOfPolicemen team, Squatter squatter){
        System.out.printf("%s appeared.%n", this);
        team.feel(Emotions.DEPRESSION);
        squatter.feel(Emotions.DEPRESSION);
    }

}
