package teams;
import humans.Aborigine;
import humans.Status;
import interactionWithHuman.Emotions;
import interfaces.Feel;
import nature.swamp.Bonfire;
import nature.swamp.Island;
import result.GetNames;

public class TeamOfAborigines extends Team<Aborigine> implements Feel {
	public TeamOfAborigines(Aborigine...ab) {
		super(ab);
	}
    public void haveFun(Island island){
		GetNames names = new GetNames() {};
		System.out.printf("%s trampled, howled and writhed on %s.%n", names.get(this, Status.ALIVE), island);
		feel(Emotions.HAPPINESS);
	}
	public void haveFun(Bonfire bonfire){
		GetNames names = new GetNames() {};
		System.out.printf("%s trampled, howled and writhed on %s.%n", names.get(this, Status.ALIVE), bonfire);
		feel(Emotions.HAPPINESS);
	}
	public void feel(Emotions emotion){
		getTeam().forEach(h->h.setHealth(h.getHealth()+emotion.getEffect()));
		GetNames names = new GetNames() {};
		System.out.printf("%s feel %s.%n", names.get(this, Status.ALIVE), emotion);
	}
}