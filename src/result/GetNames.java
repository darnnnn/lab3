package result;
import humans.Human;
import teams.Team;
import humans.Status;
import java.util.ArrayList;

public interface GetNames {
    default String get(Team team, Status status) {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i< team.getTeam().size(); i++){
            Human h = (Human) team.getTeam().get(i);
            if (h.getStat() == status) names.add(h.getName());
        }
        return String.join(", ", names);
    }
}
