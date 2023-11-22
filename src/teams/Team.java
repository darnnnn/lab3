package teams;
import humans.Human;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Team<H extends Human> {
    private final ArrayList<H> team = new ArrayList<>();
    @SafeVarargs
    public Team(H...h){
        Collections.addAll(team, h);
    }
    public final ArrayList<H> getTeam(){
        return team;
    }
}
