package teams;

import interactionWithPoliceman.Emotions;
import humans.Policeman;
import interfaces.Feel;

public class TeamOfPolicemen extends Team<Policeman> implements Feel {
	public TeamOfPolicemen(Policeman...po){
		super(po);
	}
	public void feel(Emotions e){
		getTeam().forEach(p -> p.feel(e));
	}

}