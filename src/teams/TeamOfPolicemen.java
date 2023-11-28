package teams;

import exception.ClonesException;
import exception.FullException;
import humans.Status;
import interactionWithHuman.Emotions;
import humans.Policeman;
import interfaces.Feel;
import interfaces.GetIntoTpansport;
import nature.forest.Lichen;
import nature.forest.Roots;
import nature.forest.Stones;
import nature.forest.Wall;
import result.GetNames;
import transport.Car;
import transport.Waggon;

public class TeamOfPolicemen extends Team<Policeman> implements Feel, GetIntoTpansport {
	public TeamOfPolicemen(Policeman...po) throws FullException, ClonesException {
		super(po);
	}
	public void feel(Emotions e){
		GetNames<Team> names = new GetNames<>() {
		};
		System.out.println(String.join(", ", names.get(this, Status.ALIVE)) + " feel " + e.toString());
	}
	public void getIntoTpansport(Car car, Waggon w1, Waggon w2){
		getTeam().forEach(p->{
		if (Math.random()<=0.33) car.fillUp(p);
		else if (Math.random()<=0.33) w1.fillUp(p);
		else w2.fillUp(p);});
	}
	public void goInForest(Roots r, Lichen l, Stones s, Wall w){
		System.out.println(r.toString() + " and " + l.toString() + " surrounded them, and " + s.toString() + " or " +  w.toString() + " appeared from time to time.");
		feel(Emotions.DEPRESSION);
	}
}
