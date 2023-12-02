package result;
import humans.Human;
import teams.Team;
import humans.Status;
import java.util.ArrayList;

public interface GetNames {
    default ArrayList<String> get(Team t, Status stat) {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i<t.getTeam().size(); i++){
            Human h = (Human) t.getTeam().get(i);
            if (h.getStat() == stat) names.add(h.getName());
        }
        return names;
    }
}
