package teams;

import humans.Status;
import interactionWithHuman.Emotions;
import humans.Policeman;
import interactionWithHuman.Sound;
import interfaces.Feel;
import interfaces.GetIntoTpansport;
import interfaces.GoInForest;
import nature.forest.Lichen;
import nature.forest.Roots;
import nature.forest.Stones;
import nature.forest.Wall;
import result.GetNames;
import transport.Car;
import transport.Waggon;

public class TeamOfPolicemen extends Team<Policeman> implements Feel, GetIntoTpansport, GoInForest {
	public TeamOfPolicemen(Policeman...po) {
		super(po);
	}
	public void feel(Emotions e){
		GetNames names = new GetNames() {
		};
		System.out.println(String.join(", ", names.get(this, Status.ALIVE)) + " feel " + e + ".");
	}
	public void hear(Sound s){
		GetNames names = new GetNames() {
		};
		System.out.println(String.join(", ", names.get(this, Status.ALIVE)) + " heard " + s + ".");
	}
	public void getIntoTpansport(Car car, Waggon w1, Waggon w2){
		for (int i=0; i<getTeam().size(); i+=3){
			car.fillUp(getTeam().get(i));
		}
		for (int j=1; j<getTeam().size(); j+=3) {
			w1.fillUp(getTeam().get(j));
		}
		for (int k = 2; k < getTeam().size(); k+=3) {
			w2.fillUp(getTeam().get(k));
		}

	}
	public void goInForest(Roots r, Lichen l, Stones s, Wall w){
		System.out.println(r + " and " + l + " surrounded them, and " + s + " or " +  w + " appeared from time to time.");
		feel(Emotions.DEPRESSION);
	}
}
