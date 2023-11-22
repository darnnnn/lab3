package exception.checking;

import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class Amount implements Check{
    public boolean check(TeamOfAborigines t1, TeamOfPolicemen t2){
        return t1.getTeam().size() != t2.getTeam().size() || t1.getTeam().isEmpty() || t2.getTeam().isEmpty();
    }
}
