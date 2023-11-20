package teams;
import java.util.ArrayList;
import java.util.Collections;
import interactionWithPoliceman.Emotions;
import humans.Policeman;
import interfaces.Feel;

public class TeamOfPolicemen implements Feel {
	private final ArrayList<Policeman> team2 = new ArrayList<>();
	public TeamOfPolicemen(Policeman...po){
		Collections.addAll(team2, po); }
	public ArrayList<Policeman> get(){
		return team2;
	}
	public void feel(Emotions e){
		team2.forEach(p -> p.feel(e));
	}

}