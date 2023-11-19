package exception.checking;

import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class Amount implements Check{
    public boolean check(TeamOfAborigines t1, TeamOfPolicemen t2){
        return t1.get().size() != t2.get().size() | t1.get().isEmpty() | t2.get().isEmpty();
    }
}
