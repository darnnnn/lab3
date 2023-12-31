package teams;
import exception.ClonesException;
import exception.SmallAmount;
import humans.Human;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Team<H extends Human> {
    private final ArrayList<H> team;
    {team = new ArrayList<>();}
    @SafeVarargs
    public Team(H...h) {
        if (h.length < 7) throw new SmallAmount("There are not enough people in the team. The minimum number is 7.");
        if (check(h)) throw new ClonesException("There are clones on your teams. This is impossible.");
        else Collections.addAll(team, h);
    }
    public final ArrayList<H> getTeam(){
        return team;
    }
    private static boolean check(Human[] h){
        int clones = 0;
        for(int i = 0; i < h.length; i++){
            for(int j = 0; j < h.length; j++) {
                if (i != j && h[i].equals(h[j])) clones++;
            }
        }
        return clones > 0;
    }

}