package exception.checking;

import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class Clones implements Check{
    public boolean check(TeamOfAborigines t1, TeamOfPolicemen t2){
        int clones = 0;
        for(int i = 0; i < t1.getTeam().size(); i++){
            for(int j = 0; j < t1.getTeam().size(); j++) {
                if (i != j && ( t1.getTeam().get(i).equals(t1.getTeam().get(j)) || t2.getTeam().get(i).equals(t2.getTeam().get(j)) ) ) clones++;
            }
        }
        return clones > 0;
    }
}
