package exception.checking;

import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class Twins implements Check{
    public boolean check(TeamOfAborigines t1, TeamOfPolicemen t2){
        int twins = 0;
        for(int i=0; i < t1.get().size(); i++){
            for(int j=0; j < t2.get().size(); j++) {
                if (t1.get().get(i).equals(t2.get().get(j))) twins++;
            }
        }
        return twins > 0;
    }
}
