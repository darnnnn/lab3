package teams;

import humans.Status;
import interactionWithHuman.Emotions;
import humans.Policeman;
import interactionWithHuman.Sound;
import interfaces.Feel;
import interfaces.GetIntoTpansport;
import result.GetNames;
import transport.Transport;

public class TeamOfPolicemen extends Team<Policeman> implements Feel, GetIntoTpansport{
	public TeamOfPolicemen(Policeman...po) {
		super(po);
	}
	public void feel(Emotions emotion){
		getTeam().forEach(h->h.setHealth(h.getHealth()+emotion.getEffect()));
		GetNames names = new GetNames() {};
		System.out.printf( "%s feel %s.%n", names.get(this, Status.ALIVE), emotion);
	}
	public void hear(Sound sound){
		GetNames names = new GetNames() {};
		System.out.printf( "%s heard %s.%n", names.get(this, Status.ALIVE), sound);
	}
	public void getIntoTpansport(Transport[] transports){
		for (int i=0; i<getTeam().size(); i+=3){
			transports[0].fillUp(getTeam().get(i));
		}
		for (int j=1; j<getTeam().size(); j+=3) {
			transports[1].fillUp(getTeam().get(j));
		}
		for (int k = 2; k < getTeam().size(); k+=3) {
			transports[2].fillUp(getTeam().get(k));
		}

	}
}
