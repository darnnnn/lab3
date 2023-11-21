package exception.checking;

import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class Clones implements Check{
    public boolean check(TeamOfAborigines t1, TeamOfPolicemen t2){
        int clones = 0;
        for(int i=0; i < t1.get().size(); i++){
            for(int j=0; j < t1.get().size(); j++) {
                if (i != j && ( t1.get().get(i).equals(t1.get().get(j)) || t2.get().get(i).equals(t2.get().get(j)) ) ) clones++;
            }
        }
        return clones > 0;
    }
}
